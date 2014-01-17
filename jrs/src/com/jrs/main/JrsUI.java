package com.jrs.main;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.annotation.WebServlet;

import com.google.gwt.dev.util.Util;
import com.jrs.hibernate.Benutzer;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.jrs.main.Utils;

//add something here to check the repo
@SuppressWarnings("serial")
@Theme("jrstheme")
public class JrsUI extends UI {

	private static Benutzer benutzer;  
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = JrsUI.class, widgetset = "com.jrs.main.widgetset.JrsWidgetset")
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);

		
		Panel loginPanel = new Panel();
		loginPanel.setSizeUndefined();
		layout.addComponent(loginPanel);
		
		CustomLayout PanelCustomLayout = new CustomLayout("LoginFormLayout");
		PanelCustomLayout.addStyleName("mystylename");
		
		final TextField usernameTxt = new TextField();
		final PasswordField passwordTxt = new PasswordField();
		
		EntityManager em = JPAContainerFactory.createEntityManagerForPersistenceUnit("jrsdb");
		
		Button loginBut = new Button("Anmelden");
		loginBut.addClickListener(new Button.ClickListener() {
			
			
		public void buttonClick(ClickEvent event) {
			String usernameStr = usernameTxt.getValue();
			String passwordStr = passwordTxt.getValue();
			if("admin".equals(usernameStr)){
				if("admin".equals(passwordStr)) {
					JrsUI.setUser(new Benutzer(usernameStr, passwordStr));
//					JrsUI.getCurrent().setContent("AdminView");
				}else {
					Notification.show("Bitte geben Sie Nutzernamen und Passwort erneut ein.", Type.ERROR_MESSAGE);
				}
			}else{
				EntityManager em = JPAContainerFactory.createEntityManagerForPersistenceUnit("loginData");
				Query q = em.createQuery("FROM Benutzer WHERE benutzername = ? AND kennwort = ? ");
				
				//TODO Delete this later
				if ("".equals(usernameTxt.getValue())) {
					usernameTxt.setValue("mazy");
					passwordTxt.setValue("1");
				}
				
				q.setParameter(1, usernameTxt.getValue());
				q.setParameter(2, passwordTxt.getValue());
				q.setMaxResults(1);
				
				try {
					Benutzer user = (Benutzer) q.getSingleResult();
					if (user != null) {
						if (user.getEnabled()) {
							JrsUI.setUser(user);
//							JrsUI.getCurrent().setContent(new UserHomePage());
						} else {
							JrsUI.getCurrent().setContent( new JrsUI());
							Notification.show("The user is not registered yet", Type.ERROR_MESSAGE);
						}
					} else {
						Notification.show("Wrong username password", Type.ERROR_MESSAGE);
					}
				} catch (Exception e) {
				}
				
			}
			
			
				
			}
		});
		
		PanelCustomLayout.addComponent(usernameTxt, "username");
		PanelCustomLayout.addComponent(passwordTxt, "password");
		PanelCustomLayout.addComponent(loginBut, "okbutton");

		loginPanel.setContent(PanelCustomLayout);

				

	}
	public static Benutzer getUser() {
		return benutzer;
	}

	public static void setUser(Benutzer benutzer) {
		JrsUI.benutzer = benutzer;
	}
}

