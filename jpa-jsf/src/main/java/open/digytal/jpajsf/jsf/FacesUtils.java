package open.digytal.jpajsf.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtils {
	
	public static void showMessage(String messagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(messagem));
	}
	
}
