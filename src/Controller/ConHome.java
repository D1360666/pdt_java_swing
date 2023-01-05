package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.NamingException;

import View.VisHome;
import com.exceptions.serviciosExcepciones;

public class ConHome implements ActionListener {

	private VisHome visHome;

	public ConHome() {
		super();

		this.visHome = new VisHome();

		this.visHome.btnGeografia.addActionListener(this);
		this.visHome.btnUsuarios.addActionListener(this);
		this.visHome.btnFormularios.addActionListener(this);
		this.visHome.btnActividades.addActionListener(this);
		this.visHome.btnUsr.addActionListener(this);
		this.visHome.btnCasillas.addActionListener(this);

	}

	/**
	 * Es llamada cuando se presiona uno de los
	 */
	private void activarBoton(String btn) {
		Color color = new Color(75, 150, 210);
		switch (btn) {
		case "Geografia":
			visHome.btnGeografia.setBackground(color);
			visHome.btnGeografia.setText("[X] Ocultar");
			visHome.jpOpcionesGreografia.setVisible(true);
			break;
		case "Usuario":
			visHome.btnUsuarios.setBackground(color);
			visHome.btnUsuarios.setText("[X] Ocultar");
			visHome.jpOpcionesUsuario.setVisible(true);
			break;
		case "Formulario":
			visHome.btnFormularios.setBackground(color);
			visHome.btnFormularios.setText("[X] Ocultar");
			visHome.jpOpcionesFormularios.setVisible(true);
			break;
		case "Actividad":
			visHome.btnActividades.setBackground(color);
			visHome.btnActividades.setText("[X] Ocultar");
			visHome.jpOpcionesActividades.setVisible(true);
			break;
		}

	}

	private void desactivarBotones(boolean g, boolean u, boolean f, boolean a) {
		Color color = new Color(51, 102, 153);
		if (g) {
			visHome.btnGeografia.setBackground(color);
			visHome.btnGeografia.setText("Ver opciones");
			visHome.jpOpcionesGreografia.setVisible(false);
		}
		if (u) {
			visHome.btnUsuarios.setBackground(color);
			visHome.btnUsuarios.setText("Ver opciones");
			visHome.jpOpcionesUsuario.setVisible(false);
		}
		if (f) {
			visHome.btnFormularios.setBackground(color);
			visHome.btnFormularios.setText("Ver opciones");
			visHome.jpOpcionesFormularios.setVisible(false);
		}
		if (a) {
			visHome.btnFormularios.setBackground(color);
			visHome.btnFormularios.setText("Ver opciones");
			visHome.jpOpcionesFormularios.setVisible(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// INICIO BOTONES PPALES QUE DESPLIEGAN OPCIONES ########
		// INICIO BOTONES PPALES QUE DESPLIEGAN OPCIONES ########
		// INICIO BOTONES PPALES QUE DESPLIEGAN OPCIONES ########
		if (obj == visHome.btnGeografia) { // BOTON PARA VER OPCIONES DE GEOGRAFIA -----------------------
			if (visHome.jpOpcionesGreografia.isVisible()) {
				this.desactivarBotones(true, true, true, true);
			} else {
				this.desactivarBotones(false, true, true, true);
				this.activarBoton("Geografia");
			}

		} else if (obj == visHome.btnUsuarios) { // BOTON PARA VER OPCIONES DE USUARIO -------------------
			if (visHome.jpOpcionesUsuario.isVisible()) {
				this.desactivarBotones(true, true, true, true);
			} else {
				this.desactivarBotones(true, false, true, true);
				this.activarBoton("Usuario");
			}
		} else if (obj == visHome.btnFormularios) { // BOTON PARA VER OPCIONES DE USUARIO ----------------
			if (visHome.jpOpcionesFormularios.isVisible()) {
				this.desactivarBotones(true, true, true, true);
			} else {
				this.desactivarBotones(true, true, false, true);
				this.activarBoton("Formulario");
			}
		} else if (obj == visHome.btnActividades) { // BOTON PARA VER OPCIONES DE ACTIVIDADES -------------
			if (visHome.jpOpcionesActividades.isVisible()) {
				this.desactivarBotones(true, true, true, true);
			} else {
				this.desactivarBotones(true, true, true, false);
				this.activarBoton("Actividad");
			}
			// FIN BOTONES PPALES QUE DESPLIEGAN OPCIONES ########
			// FIN BOTONES PPALES QUE DESPLIEGAN OPCIONES ########
			// FIN BOTONES PPALES QUE DESPLIEGAN OPCIONES ########

			// INICIO BOTONES QUE ABREN VENTANAS ###
			// INICIO BOTONES QUE ABREN VENTANAS ###
			// INICIO BOTONES QUE ABREN VENTANAS ###
		} else if (obj == visHome.btnUsr) { // BOTON PARA ABRIR VENTANA DE ABM DE USUARIOS -----------------
			try {
				ConUsuarios cu = new ConUsuarios();
				this.visHome.jf.dispose();
			} catch (NamingException | serviciosExcepciones e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
		} else if (obj == visHome.btnCasillas) { // BOTON PARA ABRIR VENTANA DE ABM DE CASILLAS -----------------
			ConCasillas cc = new ConCasillas();
			this.visHome.jf.dispose();
		}
		// FIN BOTONES QUE ABREN VENTANAS ###
		// FIN BOTONES QUE ABREN VENTANAS ###
		// FIN BOTONES QUE ABREN VENTANAS ###

	}

}
