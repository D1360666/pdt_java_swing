package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.servicios.Usuario.InstitutoBeanRemote;
import com.servicios.Usuario.ProfesionBeanRemote;
import com.servicios.Usuario.RolBeanRemote;
import com.servicios.Usuario.UsuarioBeanRemote;

import Helper.Auxiliar;
import View.VisABMUsuarios;
import model.Instituto;
import model.Profesion;
import model.Rol;
import model.Usuario;
import com.exceptions.serviciosExcepciones;

public class ConUsuarios implements ActionListener, ItemListener, MouseListener {
	private VisABMUsuarios visABMUsuarios;
	private RolBeanRemote rbr;
	private InstitutoBeanRemote ibr;
	private ProfesionBeanRemote pbr;
	private UsuarioBeanRemote ubr;

	public ConUsuarios() throws NamingException, serviciosExcepciones {
		super();

		try {
			this.rbr = (RolBeanRemote) InitialContext.doLookup("FromTables/RolBean!com.servicios.RolBeanRemote");
			this.ibr = (InstitutoBeanRemote) InitialContext
					.doLookup("FromTables/InstitutoBean!com.servicios.InstitutoBeanRemote");
			this.pbr = (ProfesionBeanRemote) InitialContext
					.doLookup("FromTables/ProfesionBean!com.servicios.ProfesionBeanRemote");
			this.ubr = (UsuarioBeanRemote) InitialContext
					.doLookup("FromTables/UsuarioBean!com.servicios.UsuarioBeanRemote");

		} catch (NamingException e) {
			Auxiliar.avisar(e.getMessage(), "error");
		}

		this.visABMUsuarios = new VisABMUsuarios();

		this.visABMUsuarios.btnVolver.addActionListener(this);
		this.visABMUsuarios.btnGuardar.addActionListener(this);
		this.visABMUsuarios.btnLimpiar.addActionListener(this);

		this.visABMUsuarios.cbRol.addItemListener(this);
		this.visABMUsuarios.CBFiltro.addItemListener(this);

		this.visABMUsuarios.jtListado.addMouseListener(this);

		DefaultTableModel modelo = new DefaultTableModel();

		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista = (ArrayList<Usuario>) ubr.obtenerTodos();

		Object rowData[]=new Object[2];
		
		for (Usuario u : lista) {
			rowData[0]=u.getNombre();
	        rowData[1]=u.getApellido();
			modelo.addRow(rowData);
		}

		this.visABMUsuarios.jtListado.setModel(modelo);
		this.visABMUsuarios.jtListado.setVisible(true);

		cargarRoles();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		Auxiliar.avisar(obj.toString(), "error");
		if (obj == visABMUsuarios.btnVolver) { // BOTON PARA VER OPCIONES DE GEOGRAFIA -----------------------
			Auxiliar.volverAlMenuPrincipal(visABMUsuarios.jf);

		} else if (obj == visABMUsuarios.btnGuardar) {
			try {
				guardarUsuario();
			} catch (serviciosExcepciones e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (obj == visABMUsuarios.btnLimpiar) {
			limpiarCampos();
		}

	}

	/**
	 * Limpia todos los campos del formulario de alta y modificación de usuarios
	 */
	private void limpiarCampos() {
		visABMUsuarios.txtNombre.setText("");
		visABMUsuarios.txtApellido.setText("");
		visABMUsuarios.txtEmail.setText("");
		visABMUsuarios.txtNick.setText("");
		visABMUsuarios.txtPass.setText("");
		visABMUsuarios.txtCedula.setText("");
		visABMUsuarios.cbProfesionInstituto.removeAllItems();
	}

	/**
	 * Guarda un nuevo registro de usuario en la BD
	 * 
	 * @throws serviciosExcepciones
	 */
	private boolean guardarUsuario() throws serviciosExcepciones {

//		Usuario u = new Usuario();
//
//		u.setNombre(visABMUsuarios.txtNombre.getText());
//		u.setApellido(visABMUsuarios.txtApellido.getText());
//		u.setEmail(visABMUsuarios.txtEmail.getText());
//		u.setNick(visABMUsuarios.txtNick.getText());
//		u.setPass(visABMUsuarios.txtPass.getText());
//		u.setCedula(visABMUsuarios.txtCedula.getText());
//		
		Rol r = (Rol) visABMUsuarios.cbRol.getSelectedItem();
		System.out.println(r.toString());

//		ArrayList<Rol> r = (ArrayList<Rol>) rbr.obtenerPorNombre(pri);
//		System.out.println(r.toString());
//		
//		u.setRol(r);

//		if(r.getNombre().equals("Experto")) {
//			Instituto i = (Instituto) visABMUsuarios.cbProfesionInstituto.getSelectedItem();
//			u.setInstituto(i);
//		}else if(r.getNombre().equals("Administrador")) {
//			Profesion p = (Profesion) visABMUsuarios.cbProfesionInstituto.getSelectedItem();
//			u.setProfesion(p);
//		}
//		
//		if(!validarDatos(u)) {
//			return false;
//		}
		return true;

	}

	/**
	 * Carga los roles y los lista en el combobox de la vista
	 * 
	 * @throws serviciosExcepciones
	 */
	private void cargarRoles() throws serviciosExcepciones {
		try {
//			DefaultComboBoxModel modelo = new DefaultComboBoxModel();
//			ArrayList<Rol> lista = new ArrayList<Rol>();
//			lista = (ArrayList<Rol>) rbr.obtenerTodos();
//			for (Rol r : lista) {
//				modelo.addElement(r);
//			}
System.out.println(rbr.obtenerTodos());
//			for (Rol rol : roles) {
//			visABMUsuarios.cbRol.setModel(modelo);
//			}
		} catch (Exception e) {
			throw new serviciosExcepciones(e.getMessage());
		}

	}

	/**
	 * Verifica que los campos no estén vacíos y que estén entre los rangos
	 * aceptados y con un formato correcto
	 * 
	 * @param u Usuario al que hay que verificarle los datos
	 * @return Boolean con true si está todo bien, de lo contrario avisa del error y
	 *         devuelve false
	 */
	private boolean validarDatos(Usuario u) {
		boolean valido = true;
		String msj = "";
		if (u.getNombre().equals("") || u.getNombre().length() < 3 || u.getNombre().length() > 40) {
			valido = false;
			msj = "El nombre de usuario no es válido. Debe tener entre 3 y 40 caracteres.";
		}
		if (u.getApellido().equals("") || u.getApellido().length() < 3 || u.getApellido().length() > 40) {
			valido = false;
			msj = "El apellido de usuario no es válido. Debe tener entre 3 y 40 caracteres.";
		}
		if (!Auxiliar.validarEmail(u.getEmail())) {
			valido = false;
			msj = "El email no contiene un formato válido.";
		}
		if (u.getNick().equals("") || u.getNick().length() < 4 || u.getNick().length() > 10) {
			valido = false;
			msj = "El nick de usuario no es válido. Debe tener entre 4 y 10 caracteres.";
		}
		if (u.getPass().equals("") || u.getPass().length() < 6 || u.getPass().length() > 20) {
			valido = false;
			msj = "La contraseña de usuario no es válida. Debe tener entre 6 y 20 caracteres.";
		}
		if (u.getCi().equals("") || u.getCi().length() != 8) {
			valido = false;
			msj = "Ingrese los 8 números del documento sin puntos ni guión.";
		}

		if (!valido) {
			Auxiliar.avisar(msj, "info");
			return false;
		}
		return true;

	}

	/**
	 * Carga las Profesiones o los Institutos basándose en un Rol recibido Si es
	 * Administrador carga las Profesiones, si es Experto carga los Institutos
	 * 
	 * @param rol Rol Experto o Administrador
	 * @throws serviciosExcepciones
	 */
	private void cargarProfesionesInstitutos(String tipo) throws serviciosExcepciones {
		visABMUsuarios.cbProfesionInstituto.removeAllItems();
		if (tipo.equals("Experto")) {
			ArrayList<Instituto> institutos = (ArrayList<Instituto>) ibr.obtenerTodos();
			for (Instituto i : institutos) {
				visABMUsuarios.cbProfesionInstituto.addItem(i);
			}
		} else if (tipo.equals("Administrador")) {
			ArrayList<Profesion> profesiones = (ArrayList<Profesion>) pbr.obtenerTodos();
			for (Profesion p : profesiones) {
				visABMUsuarios.cbProfesionInstituto.addItem(p);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox combo = (JComboBox) e.getSource();
			String pri = combo.getSelectedItem().toString();
			if (combo == visABMUsuarios.cbRol) {
				try {
					cargarProfesionesInstitutos(pri);
				} catch (serviciosExcepciones e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} else {
//
		}
	}

	private void seleccionarRol(Rol rol) {
		visABMUsuarios.cbRol.getModel().setSelectedItem(rol);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int filaSeleccionada = visABMUsuarios.jtListado.getSelectedRow();
		if (filaSeleccionada > -1) {
			Usuario u = new Usuario();
			u = ((List<Usuario>) visABMUsuarios.jtListado).get(filaSeleccionada);

			visABMUsuarios.txtNombre.setText(u.getNombre());
			visABMUsuarios.txtApellido.setText(u.getApellido());
			visABMUsuarios.txtCedula.setText(u.getCi());
			visABMUsuarios.txtEmail.setText(u.getEmail());
			visABMUsuarios.txtNick.setText(u.getNick());

			seleccionarRol(u.getRole());
		}
		
		System.out.println("Puto el que lee");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
