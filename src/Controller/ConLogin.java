package Controller;

import View.VisLogin;
import model.Usuario;
import com.exceptions.serviciosExcepciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

import com.servicios.Usuario.UsuarioBeanRemote;

import Helper.Auxiliar;
import Helper.Globals;

public class ConLogin implements ActionListener {

	private UsuarioBeanRemote ubr;
	private VisLogin vistaLogin;
	private Usuario usr;
	
	// CONSTRUCTOR --------------------------
	public ConLogin() throws Exception {
		try {
			ubr = (UsuarioBeanRemote) InitialContext
					.doLookup("FromTables/UsuarioBean!com.servicios.Usuario.UsuarioBeanRemote");
			this.vistaLogin = new VisLogin();
			this.vistaLogin.btnLogin.addActionListener(this);
		} catch (Exception ne) {
			System.out.println("Sylvester");
			throw new NamingException(ne.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == this.vistaLogin.btnLogin) {
			String email = vistaLogin.txtEmail.getText();
			String pass = vistaLogin.txtPass.getText();
			try {
				if (email.equals("") || pass.equals("")) {
					Auxiliar.avisar("Los campos email y contraseña son obligatorios", "error");
					return;
				}else {
					this.usr = ubr.login(email, Auxiliar.passwordToHash(pass));
					//JOptionPane.showConfirmDialog(null, ubr.login(email, Auxiliar.passwordToHash(pass)));
					if (this.usr == null) {
						Auxiliar.avisar("Usuario no encontrado", "info");
						return;
					}
					Globals.usuario = this.usr;
					ConHome conHome = new ConHome();
					this.vistaLogin.jf.dispose();
				}
			} catch (serviciosExcepciones e1) {
				Auxiliar.avisar("Usuario no encontrado", "info");
				Auxiliar.avisar(e1.getMessage(), "info");
			}

		}
	}

}
