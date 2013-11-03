package controlls;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class LocaleController {
	private Locale currentLocale = new Locale("en", "US");
	
	public void setLocalePortugues(){
		currentLocale = new Locale("pt", "BR");
	}
	public void setLocaleIngles(){
		currentLocale = new Locale("en", "US");
	}
	public Locale getCurrentLocale() {
		return currentLocale;
	}
	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}
	
	
	/*
	public void englishLocale(){
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale =  Locale.US;
		viewRoot.setLocale(currentLocale);
	}

	public void portugueseLocale(){
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = new Locale("pt", "BR");
		viewRoot.setLocale(currentLocale);
	}
	public Locale getCurrentLocale(){
		return currentLocale;
	}
	*/
}
