
public class DatosUsuario {
	public DatosUsuario() {
		
	}
	String usuario1="";
	String password1="";

	public int probarPass() {
		usuario1=Ventana1.txtUsuario.getText();
		password1=Ventana1.pssContraseña.getText();
		if(usuario1.equals("peru") & password1.equals("1234")) {
			return 1;
		}else {
			return 0;
		}
	}
}