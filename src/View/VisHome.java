package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Helper.Auxiliar;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class VisHome {
	public JFrame jf;
	private Image img;
	Border dashed;

	// PANELES --------
	public JPanel contentPane;
	public JPanel jpUsuarios;
	public JPanel panel;
	public JPanel jpGeografia;
	public JPanel jpFormularios;
	public JPanel jpZonas;
	public JPanel jpRoles;
	public JPanel jpParametros;
	public JPanel jpActividad;
	public JPanel jpOpcionesGreografia;
	public JPanel jpOpcionesUsuario;
	public JPanel jpOpcionesFormularios;
	public JPanel jpLocalidades;
	public JPanel jpInstitutos;
	public JPanel jpForms;
	public JPanel jpEstaciones;
	public JPanel jpDepartamentos;
	public JPanel jpProfesiones;
	public JPanel jpCasillas;
	public JPanel jpUsr;
	public JPanel jpActividades;
	public JPanel jpOpcionesActividades;

	// CAMPOS DE TEXTOS ---------------
	private JTextArea jtAUsuarios;
	private JTextArea jtAFormularios;
	private JTextArea jtAZonas;
	private JTextArea jtARoles;
	private JTextArea jtAParametros;
	private JTextArea jtAActividades;
	private JTextArea jtAGeografia;
	private JTextArea jtADepartamentos;
	private JTextArea jtAProfesiones;
	private JTextArea jtACasillas;
	private JTextArea jtALocalidades;
	private JTextArea jtAInstitutos;
	private JTextArea jtAForms;
	private JTextArea jtAEstaciones;
	private JTextArea jtAUsr;
	private JTextArea txtrActividades;

	// BOTONES -------------------------
	public JButton btnGeografia;
	public JButton btnUsuarios;
	public JButton btnFormularios;
	public JButton btnActividades;
	
	public JButton btnEstaciones;
	public JButton btnDepartamentos;
	public JButton btnProfesiones;
	public JButton btnCasillas;
	public JButton btnLocalidades;
	public JButton btnInstitutos;
	public JButton btnForms;
	public JButton btnZonas;
	public JButton btnRoles;
	public JButton btnParametros;
	public JButton btnActividad;
	public JButton btnUsr;

	// ICONOS ---------------------------------
	private JLabel jlTitulo;
	private JLabel icoGeografia;
	private JLabel icoUsuarios;
	private JLabel icoFormularios;
	private JLabel icoZonas;
	private JLabel icoDepartamentos;
	private JLabel icoCasillas;
	private JLabel icoProfesiones;
	private JLabel icoLocalidades;
	private JLabel icoInstitutos;
	private JLabel icoForms;
	private JLabel icoEstaciones;
	private JLabel icoRoles;
	private JLabel icoParametros;
	private JLabel icoActividades;
	private JLabel icoUsr;
	private JLabel icoActividad;

	/**
	 * Create the frame.
	 */
	public VisHome() {
		jf = new JFrame();
		jf.setMaximumSize(new Dimension(1920, 1080));
		jf.setFont(new Font("Open Sans", Font.PLAIN, 12));
		jf.setTitle("Vista principal");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(0, 0, 1080, 768);

		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);
		dashed = BorderFactory.createDashedBorder(null, 2, 3, 3, true);

		// BLOQUE DE OPCIONES INICIALES :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES INICIALES :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES INICIALES :::::::::::::::::::::::::::::::::
		panel = new JPanel();
		panel.setBounds(140, 77, 800, 571);
		contentPane.add(panel);
		panel.setLayout(null);

		// BLOQUE DE GEOGRAFÍA -----------------
		// BLOQUE DE GEOGRAFÍA -----------------
		jpGeografia = new JPanel();
		jpGeografia.setBounds(10, 121, 160, 218);
		panel.add(jpGeografia);
		jpGeografia.setLayout(null);

		jtAGeografia = new JTextArea();
		jtAGeografia.setBounds(10, 72, 121, 50);
		jpGeografia.add(jtAGeografia);
		jtAGeografia.setOpaque(false);
		jtAGeografia.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAGeografia.setText("Mantenimiento\r\ngeogr\u00E1fico");

		btnGeografia = new JButton("Ver opciones");
		btnGeografia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGeografia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGeografia.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnGeografia.setForeground(Color.WHITE);
		btnGeografia.setBackground(new Color(51, 102, 153));
		btnGeografia.setBounds(10, 150, 140, 45);
		jpGeografia.add(btnGeografia);

		icoGeografia = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Geo.png")).getImage();
		icoGeografia.setIcon(new ImageIcon(img));
		icoGeografia.setBounds(10, 27, 30, 34);
		jpGeografia.add(icoGeografia);

		// BLOQUE DE USUARIOS -----------------
		// BLOQUE DE USUARIOS -----------------
		jpUsuarios = new JPanel();
		jpUsuarios.setBounds(216, 121, 160, 218);
		panel.add(jpUsuarios);
		jpUsuarios.setLayout(null);

		jtAUsuarios = new JTextArea();
		jtAUsuarios.setText("Manejo\r\nde usuarios");
		jtAUsuarios.setOpaque(false);
		jtAUsuarios.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAUsuarios.setBounds(10, 72, 121, 50);
		jpUsuarios.add(jtAUsuarios);

		btnUsuarios = new JButton("Ver opciones");
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnUsuarios.setBackground(new Color(51, 102, 153));
		btnUsuarios.setBounds(10, 150, 140, 45);
		jpUsuarios.add(btnUsuarios);

		icoUsuarios = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Usuario.png")).getImage();
		icoUsuarios.setIcon(new ImageIcon(img));
		icoUsuarios.setBounds(10, 27, 30, 34);
		jpUsuarios.add(icoUsuarios);

		// BLOQUE DE FORMULARIOS -----------------
		// BLOQUE DE FORMULARIOS -----------------
		jpFormularios = new JPanel();
		jpFormularios.setLayout(null);
		jpFormularios.setBounds(422, 121, 160, 218);
		panel.add(jpFormularios);

		jtAFormularios = new JTextArea();
		jtAFormularios.setText("Formularios y\r\ncomplementos");
		jtAFormularios.setOpaque(false);
		jtAFormularios.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAFormularios.setBounds(10, 72, 121, 50);
		jpFormularios.add(jtAFormularios);

		btnFormularios = new JButton("Ver opciones");
		btnFormularios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFormularios.setForeground(Color.WHITE);
		btnFormularios.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnFormularios.setBackground(new Color(51, 102, 153));
		btnFormularios.setBounds(10, 150, 140, 45);
		jpFormularios.add(btnFormularios);

		icoFormularios = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Formulario.png")).getImage();
		icoFormularios.setIcon(new ImageIcon(img));
		icoFormularios.setBounds(10, 27, 30, 34);
		jpFormularios.add(icoFormularios);

		// BLOQUE DE ACTIVIDADES -----------------
		// BLOQUE DE ACTIVIDADES -----------------
		jpActividades = new JPanel();
		jpActividades.setLayout(null);
		jpActividades.setBounds(628, 121, 160, 218);
		panel.add(jpActividades);

		txtrActividades = new JTextArea();
		txtrActividades.setText("Actividades de\r\ncampo");
		txtrActividades.setOpaque(false);
		txtrActividades.setFont(new Font("Open Sans", Font.PLAIN, 16));
		txtrActividades.setBounds(10, 72, 121, 50);
		jpActividades.add(txtrActividades);

		btnActividades = new JButton("Ver opciones");
		btnActividades.setForeground(Color.WHITE);
		btnActividades.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnActividades.setBackground(new Color(51, 102, 153));
		btnActividades.setBounds(10, 150, 140, 45);
		jpActividades.add(btnActividades);

		icoActividades = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Actividad.png")).getImage();
		icoActividades.setIcon(new ImageIcon(img));
		icoActividades.setBounds(10, 27, 30, 34);
		jpActividades.add(icoActividades);

		// BLOQUE DE OPCIONES DE GROGRAFIA :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE GROGRAFIA :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE GROGRAFIA :::::::::::::::::::::::::::::::::
		jpOpcionesGreografia = new JPanel();
		jpOpcionesGreografia.setVisible(false);
		jpOpcionesGreografia.setBounds(10, 363, 780, 197);
		jpOpcionesGreografia.setBorder(dashed);
		panel.add(jpOpcionesGreografia);
		jpOpcionesGreografia.setLayout(null);

		// BLOQUE DE ZONAS -----------------
		// BLOQUE DE ZONAS -----------------
		jpZonas = new JPanel();
		jpZonas.setLayout(null);
		jpZonas.setBounds(36, 11, 150, 175);
		jpOpcionesGreografia.add(jpZonas);

		jtAZonas = new JTextArea();
		jtAZonas.setText("Zonas");
		jtAZonas.setOpaque(false);
		jtAZonas.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAZonas.setBounds(15, 72, 121, 34);
		jpZonas.add(jtAZonas);

		btnZonas = new JButton("Editar");
		btnZonas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnZonas.setForeground(Color.WHITE);
		btnZonas.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnZonas.setBackground(new Color(51, 102, 153));
		btnZonas.setBounds(15, 117, 120, 38);
		jpZonas.add(btnZonas);

		icoZonas = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Zona.png")).getImage();
		icoZonas.setIcon(new ImageIcon(img));
		icoZonas.setBounds(15, 27, 32, 34);
		jpZonas.add(icoZonas);

		// BLOQUE DE DEPARTAMENTOS -----------------
		// BLOQUE DE DEPARTAMENTOS -----------------
		jpDepartamentos = new JPanel();
		jpDepartamentos.setLayout(null);
		jpDepartamentos.setBounds(222, 11, 150, 175);
		jpOpcionesGreografia.add(jpDepartamentos);

		jtADepartamentos = new JTextArea();
		jtADepartamentos.setText("Departamentos");
		jtADepartamentos.setOpaque(false);
		jtADepartamentos.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtADepartamentos.setBounds(15, 72, 121, 34);
		jpDepartamentos.add(jtADepartamentos);

		btnDepartamentos = new JButton("Editar");
		btnDepartamentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDepartamentos.setForeground(Color.WHITE);
		btnDepartamentos.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnDepartamentos.setBackground(new Color(51, 102, 153));
		btnDepartamentos.setBounds(15, 117, 120, 38);
		jpDepartamentos.add(btnDepartamentos);

		icoDepartamentos = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Departamento.png")).getImage();
		icoDepartamentos.setIcon(new ImageIcon(img));
		icoDepartamentos.setBounds(15, 27, 32, 34);
		jpDepartamentos.add(icoDepartamentos);

		// BLOQUE DE LOCALIDADES -----------------
		// BLOQUE DE LOCALIDADES -----------------
		jpLocalidades = new JPanel();
		jpLocalidades.setLayout(null);
		jpLocalidades.setBounds(408, 11, 150, 175);
		jpOpcionesGreografia.add(jpLocalidades);

		jtALocalidades = new JTextArea();
		jtALocalidades.setText("Localidades");
		jtALocalidades.setOpaque(false);
		jtALocalidades.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtALocalidades.setBounds(15, 72, 121, 34);
		jpLocalidades.add(jtALocalidades);

		btnLocalidades = new JButton("Editar");
		btnLocalidades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLocalidades.setForeground(Color.WHITE);
		btnLocalidades.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnLocalidades.setBackground(new Color(51, 102, 153));
		btnLocalidades.setBounds(15, 117, 120, 38);
		jpLocalidades.add(btnLocalidades);

		icoLocalidades = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Localidad.png")).getImage();
		icoLocalidades.setIcon(new ImageIcon(img));
		icoLocalidades.setBounds(15, 27, 32, 34);
		jpLocalidades.add(icoLocalidades);

		// BLOQUE DE ESTACIONES -----------------
		// BLOQUE DE ESTACIONES -----------------
		jpEstaciones = new JPanel();
		jpEstaciones.setLayout(null);
		jpEstaciones.setBounds(594, 11, 150, 175);
		jpOpcionesGreografia.add(jpEstaciones);

		jtAEstaciones = new JTextArea();
		jtAEstaciones.setText("Estaciones");
		jtAEstaciones.setOpaque(false);
		jtAEstaciones.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAEstaciones.setBounds(15, 72, 121, 34);
		jpEstaciones.add(jtAEstaciones);

		btnEstaciones = new JButton("Editar");
		btnEstaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEstaciones.setForeground(Color.WHITE);
		btnEstaciones.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnEstaciones.setBackground(new Color(51, 102, 153));
		btnEstaciones.setBounds(15, 117, 120, 38);
		jpEstaciones.add(btnEstaciones);

		icoEstaciones = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Estacion.png")).getImage();
		icoEstaciones.setIcon(new ImageIcon(img));
		icoEstaciones.setBounds(15, 27, 32, 34);
		jpEstaciones.add(icoEstaciones);

		// BLOQUE DE OPCIONES DE USUARIOS :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE USUARIOS :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE USUARIOS :::::::::::::::::::::::::::::::::
		jpOpcionesUsuario = new JPanel();
		jpOpcionesUsuario.setVisible(false);
		jpOpcionesUsuario.setBounds(10, 363, 780, 197);
		jpOpcionesUsuario.setBorder(dashed);
		panel.add(jpOpcionesUsuario);
		jpOpcionesUsuario.setLayout(null);

		// BLOQUE DE ROLES -----------------
		// BLOQUE DE ROLES -----------------
		jpRoles = new JPanel();
		jpRoles.setLayout(null);
		jpRoles.setBounds(36, 11, 150, 175);
		jpOpcionesUsuario.add(jpRoles);

		jtARoles = new JTextArea();
		jtARoles.setText("Roles");
		jtARoles.setOpaque(false);
		jtARoles.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtARoles.setBounds(15, 72, 121, 34);
		jpRoles.add(jtARoles);

		btnRoles = new JButton("Editar");
		btnRoles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRoles.setForeground(Color.WHITE);
		btnRoles.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnRoles.setBackground(new Color(51, 102, 153));
		btnRoles.setBounds(15, 117, 120, 38);
		jpRoles.add(btnRoles);

		icoRoles = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Rol.png")).getImage();
		icoRoles.setIcon(new ImageIcon(img));
		icoRoles.setBounds(15, 27, 32, 34);
		jpRoles.add(icoRoles);

		// BLOQUE DE PROFESIONES -----------------
		// BLOQUE DE PROFESIONES -----------------
		jpProfesiones = new JPanel();
		jpProfesiones.setLayout(null);
		jpProfesiones.setBounds(222, 11, 150, 175);
		jpOpcionesUsuario.add(jpProfesiones);

		jtAProfesiones = new JTextArea();
		jtAProfesiones.setText("Profesiones");
		jtAProfesiones.setOpaque(false);
		jtAProfesiones.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAProfesiones.setBounds(15, 72, 121, 34);
		jpProfesiones.add(jtAProfesiones);

		btnProfesiones = new JButton("Editar");
		btnProfesiones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProfesiones.setForeground(Color.WHITE);
		btnProfesiones.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnProfesiones.setBackground(new Color(51, 102, 153));
		btnProfesiones.setBounds(15, 117, 120, 38);
		jpProfesiones.add(btnProfesiones);

		icoProfesiones = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Profesion.png")).getImage();
		icoProfesiones.setIcon(new ImageIcon(img));
		icoProfesiones.setBounds(15, 27, 32, 34);
		jpProfesiones.add(icoProfesiones);

		// BLOQUE DE INSTITUTOS -----------------
		// BLOQUE DE INSTITUTOS -----------------
		jpInstitutos = new JPanel();
		jpInstitutos.setLayout(null);
		jpInstitutos.setBounds(408, 11, 150, 175);
		jpOpcionesUsuario.add(jpInstitutos);

		jtAInstitutos = new JTextArea();
		jtAInstitutos.setText("Institutos");
		jtAInstitutos.setOpaque(false);
		jtAInstitutos.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAInstitutos.setBounds(15, 72, 121, 34);
		jpInstitutos.add(jtAInstitutos);

		btnInstitutos = new JButton("Editar");
		btnInstitutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInstitutos.setForeground(Color.WHITE);
		btnInstitutos.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnInstitutos.setBackground(new Color(51, 102, 153));
		btnInstitutos.setBounds(15, 117, 120, 38);
		jpInstitutos.add(btnInstitutos);

		icoInstitutos = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Instituto.png")).getImage();
		icoInstitutos.setIcon(new ImageIcon(img));
		icoInstitutos.setBounds(15, 27, 32, 34);
		jpInstitutos.add(icoInstitutos);

		// BLOQUE DE USUARIO -----------------
		// BLOQUE DE USUARIO -----------------
		jpUsr = new JPanel();
		jpUsr.setLayout(null);
		jpUsr.setBounds(594, 11, 150, 175);
		jpOpcionesUsuario.add(jpUsr);

		jtAUsr = new JTextArea();
		jtAUsr.setText("Usuarios");
		jtAUsr.setOpaque(false);
		jtAUsr.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAUsr.setBounds(15, 72, 121, 34);
		jpUsr.add(jtAUsr);

		btnUsr = new JButton("Editar");
		btnUsr.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsr.setForeground(Color.WHITE);
		btnUsr.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnUsr.setBackground(new Color(51, 102, 153));
		btnUsr.setBounds(15, 117, 120, 38);
		jpUsr.add(btnUsr);

		icoUsr = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Usuario.png")).getImage();
		icoUsr.setIcon(new ImageIcon(img));
		icoUsr.setBounds(15, 27, 32, 34);
		jpUsr.add(icoUsr);

		// BLOQUE DE OPCIONES DE FORMULARIOS :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE FORMULARIOS :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE FORMULARIOS :::::::::::::::::::::::::::::::::
		jpOpcionesFormularios = new JPanel();
		jpOpcionesFormularios.setVisible(false);
		jpOpcionesFormularios.setBounds(10, 363, 780, 197);
		jpOpcionesFormularios.setBorder(dashed);
		panel.add(jpOpcionesFormularios);
		jpOpcionesFormularios.setLayout(null);

		// BLOQUE DE PARAMETROS -----------------
		// BLOQUE DE PARAMETROS -----------------
		jpParametros = new JPanel();
		jpParametros.setLayout(null);
		jpParametros.setBounds(36, 11, 150, 175);
		jpOpcionesFormularios.add(jpParametros);

		jtAParametros = new JTextArea();
		jtAParametros.setText("Parametros");
		jtAParametros.setOpaque(false);
		jtAParametros.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAParametros.setBounds(15, 72, 121, 34);
		jpParametros.add(jtAParametros);

		btnParametros = new JButton("Editar");
		btnParametros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnParametros.setForeground(Color.WHITE);
		btnParametros.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnParametros.setBackground(new Color(51, 102, 153));
		btnParametros.setBounds(15, 117, 120, 38);
		jpParametros.add(btnParametros);

		icoParametros = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Parametro.png")).getImage();
		icoParametros.setIcon(new ImageIcon(img));
		icoParametros.setBounds(15, 27, 32, 34);
		jpParametros.add(icoParametros);

		// BLOQUE DE CASILLAS -----------------
		// BLOQUE DE CASILLAS -----------------
		jpCasillas = new JPanel();
		jpCasillas.setLayout(null);
		jpCasillas.setBounds(222, 11, 150, 175);
		jpOpcionesFormularios.add(jpCasillas);

		jtACasillas = new JTextArea();
		jtACasillas.setText("Casillas");
		jtACasillas.setOpaque(false);
		jtACasillas.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtACasillas.setBounds(15, 72, 121, 34);
		jpCasillas.add(jtACasillas);

		btnCasillas = new JButton("Editar");
		btnCasillas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCasillas.setForeground(Color.WHITE);
		btnCasillas.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnCasillas.setBackground(new Color(51, 102, 153));
		btnCasillas.setBounds(15, 117, 120, 38);
		jpCasillas.add(btnCasillas);

		icoCasillas = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Input.png")).getImage();
		icoCasillas.setIcon(new ImageIcon(img));
		icoCasillas.setBounds(15, 27, 32, 34);
		jpCasillas.add(icoCasillas);

		// BLOQUE DE FORMULARIOS -----------------
		// BLOQUE DE FORMULARIOS -----------------
		jpForms = new JPanel();
		jpForms.setLayout(null);
		jpForms.setBounds(408, 11, 150, 175);
		jpOpcionesFormularios.add(jpForms);

		jtAForms = new JTextArea();
		jtAForms.setText("Formularios");
		jtAForms.setOpaque(false);
		jtAForms.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAForms.setBounds(15, 72, 121, 34);
		jpForms.add(jtAForms);

		btnForms = new JButton("Editar");
		btnForms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForms.setForeground(Color.WHITE);
		btnForms.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnForms.setBackground(new Color(51, 102, 153));
		btnForms.setBounds(15, 117, 120, 38);
		jpForms.add(btnForms);

		icoForms = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Formulario.png")).getImage();
		icoForms.setIcon(new ImageIcon(img));
		icoForms.setBounds(15, 27, 32, 34);
		jpForms.add(icoForms);

		jlTitulo = new JLabel("\u00BFQu\u00E9 deseas hacer hoy?");
		jlTitulo.setBounds(120, 0, 603, 108);
		panel.add(jlTitulo);
		jlTitulo.setForeground(Color.LIGHT_GRAY);
		jlTitulo.setFont(new Font("Open Sans Light", Font.PLAIN, 50));

		// BLOQUE DE OPCIONES DE ACTIVIDADES :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE ACTIVIDADES :::::::::::::::::::::::::::::::::
		// BLOQUE DE OPCIONES DE ACTIVIDADES :::::::::::::::::::::::::::::::::
		jpOpcionesActividades = new JPanel();
		jpOpcionesActividades.setVisible(false);
		jpOpcionesActividades.setBounds(10, 363, 780, 197);
		jpOpcionesActividades.setBorder(dashed);
		panel.add(jpOpcionesActividades);
		jpOpcionesActividades.setLayout(null);

		// BLOQUE DE PARAMETROS -----------------
		// BLOQUE DE PARAMETROS -----------------
		jpActividad = new JPanel();
		jpActividad.setLayout(null);
		jpActividad.setBounds(36, 11, 150, 175);
		jpOpcionesActividades.add(jpActividad);

		jtAActividades = new JTextArea();
		jtAActividades.setText("Actividad");
		jtAActividades.setOpaque(false);
		jtAActividades.setFont(new Font("Open Sans", Font.PLAIN, 16));
		jtAActividades.setBounds(15, 72, 121, 34);
		jpActividad.add(jtAActividades);

		btnActividad = new JButton("Editar");
		btnActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActividad.setForeground(Color.WHITE);
		btnActividad.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnActividad.setBackground(new Color(51, 102, 153));
		btnActividad.setBounds(15, 117, 120, 38);
		jpActividad.add(btnActividad);

		icoActividad = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Actividad.png")).getImage();
		icoActividad.setIcon(new ImageIcon(img));
		icoActividad.setBounds(15, 27, 32, 34);
		jpActividad.add(icoActividad);

//				// BLOQUE DE CASILLAS -----------------
//				// BLOQUE DE CASILLAS -----------------
//				jpCasillas = new JPanel();
//				jpCasillas.setLayout(null);
//				jpCasillas.setBounds(222, 11, 150, 175);
//				jpOpcionesFormularios.add(jpCasillas);
//
//				jtACasillas = new JTextArea();
//				jtACasillas.setText("Casillas");
//				jtACasillas.setOpaque(false);
//				jtACasillas.setFont(new Font("Open Sans", Font.PLAIN, 16));
//				jtACasillas.setBounds(15, 72, 121, 34);
//				jpCasillas.add(jtACasillas);
//
//				btnCasillas = new JButton("Editar");
//				btnCasillas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//				btnCasillas.setForeground(Color.WHITE);
//				btnCasillas.setFont(new Font("Open Sans", Font.PLAIN, 14));
//				btnCasillas.setBackground(new Color(51, 102, 153));
//				btnCasillas.setBounds(15, 117, 120, 38);
//				jpCasillas.add(btnCasillas);
//
//				icoCasillas = new JLabel("");
//				img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Input.png")).getImage();
//				icoCasillas.setIcon(new ImageIcon(img));
//				icoCasillas.setBounds(15, 27, 32, 34);
//				jpCasillas.add(icoCasillas);
//
//				// BLOQUE DE FORMULARIOS -----------------
//				// BLOQUE DE FORMULARIOS -----------------
//				jpForms = new JPanel();
//				jpForms.setLayout(null);
//				jpForms.setBounds(408, 11, 150, 175);
//				jpOpcionesFormularios.add(jpForms);
//
//				jtAForms = new JTextArea();
//				jtAForms.setText("Formularios");
//				jtAForms.setOpaque(false);
//				jtAForms.setFont(new Font("Open Sans", Font.PLAIN, 16));
//				jtAForms.setBounds(15, 72, 121, 34);
//				jpForms.add(jtAForms);
//
//				btnForms = new JButton("Editar");
//				btnForms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//				btnForms.setForeground(Color.WHITE);
//				btnForms.setFont(new Font("Open Sans", Font.PLAIN, 14));
//				btnForms.setBackground(new Color(51, 102, 153));
//				btnForms.setBounds(15, 117, 120, 38);
//				jpForms.add(btnForms);
//
//				icoForms = new JLabel("");
//				img = new ImageIcon(this.getClass().getResource("/Resources/Imgs/Home/Formulario.png")).getImage();
//				icoForms.setIcon(new ImageIcon(img));
//				icoForms.setBounds(15, 27, 32, 34);
//				jpForms.add(icoForms);

		// TÍTULO *****************
		// TÍTULO *****************
		// TÍTULO *****************
		jlTitulo = new JLabel("\u00BFQu\u00E9 deseas hacer hoy?");
		jlTitulo.setBounds(120, 0, 603, 108);
		panel.add(jlTitulo);
		jlTitulo.setForeground(Color.LIGHT_GRAY);
		jlTitulo.setFont(new Font("Open Sans Light", Font.PLAIN, 50));

		// REDIMENSIONADO DE PANTALLA ***************
		// REDIMENSIONADO DE PANTALLA ***************
		// REDIMENSIONADO DE PANTALLA ***************
		jf.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent ev) {
				Dimension size = jf.getSize();
				if (size.getWidth() < 850) {
					if (size.getHeight() < 600) {
						jf.setSize(850, 600);
					} else {
						jf.setSize(850, (int) size.getHeight());
					}
				} else {
					if (size.getHeight() < 650) {
						jf.setSize((int) size.getWidth(), 650);
					}
				}
				int marginTop = (int) (size.getHeight() - panel.getHeight()) / 2;
				int marginLeft = (int) (size.getWidth() - panel.getWidth()) / 2;
				panel.setBounds(marginLeft, marginTop, 800, 571);
			}
		});

		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
}
