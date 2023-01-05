package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import model.Rol;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;

public class VisABMUsuarios {
	public JFrame jf;
	private Image img;
	Border dashed;

	// PANELES --------
	public JPanel contentPane;
	public JPanel panel;
	public JPanel panelAltaModificacion;
	public JPanel jpNombre;
	public JPanel jpApellido;
	public JPanel jpEmail;
	public JPanel jpCedula;
	public JPanel jpNick;
	public JPanel jpPass;
	public JPanel jpRol;
	public JPanel jpProfInst;
	public JPanel JPListadoDeRegistros;
	public JPanel JPBuscar;
	
	// LABELS ----------
	private JLabel lblAltaModificacion;
	private JLabel jlNombre;
	private JLabel jlApellido;
	private JLabel jlEmail;
	private JLabel jlCedula;
	private JLabel jlNick;
	private JLabel jlPass;
	private JLabel jlRol;
	private JLabel lblProfesioninstituto;
	private JLabel lblBuscar;
	private JLabel lblListadoDeRegistros;
	private JLabel lblTodosLosCampos;
	
	// CAMPOS DE TEXTOS ---------
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtEmail;
	public JTextField txtCedula;
	public JTextField txtNick;
	public JTextField txtBuscar;
	public JPasswordField txtPass;
	
	// BOTONES ------------------
	public JButton btnVolver;
	public JButton btnNuevoProfInst;
	public JButton btnGuardar;
	public JButton btnBuscar;
	public JButton btnEliminar;
	public JButton btnLimpiar;
	
	// OTROS --------------------
	public JComboBox cbProfesionInstituto;
	public JComboBox cbRol;
	public JComboBox CBFiltro;
	public JTable jtListado;
	
	
	/**
	 * Create the frame.
	 */
	public VisABMUsuarios() {
		jf = new JFrame();
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage(VisABMUsuarios.class.getResource("/Resources/Imgs/Home/Usuario.png")));
		jf.setMaximumSize(new Dimension(1920, 1080));
		jf.setFont(new Font("Open Sans", Font.PLAIN, 12));
		jf.setTitle("Mantenimiento de usuarios");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(0, 0, 1080, 768);

		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);
		dashed = BorderFactory.createDashedBorder(null, 2, 3, 3, true);

		// BLOQUE GENERAL :::::::::::::::::::::::::::::::::
		panel = new JPanel();
		panel.setBounds(33, 11, 959, 647);
		contentPane.add(panel);
		panel.setLayout(null);

		// TITULO :::::::::::::::::::::::::::::::::::::::::
		lblAltaModificacion = new JLabel("Alta / Modificaci\u00F3n");
		lblAltaModificacion.setBounds(10, 11, 294, 44);
		panel.add(lblAltaModificacion);
		lblAltaModificacion.setForeground(Color.BLACK);
		lblAltaModificacion.setFont(new Font("Roboto", Font.PLAIN, 20));

		// FORM DE ALTA Y MODIFICACIÓN ::::::::::::::::::::
		panelAltaModificacion = new JPanel();
		panelAltaModificacion.setBackground(Color.WHITE);
		panelAltaModificacion.setBounds(10, 66, 303, 494);
		panel.add(panelAltaModificacion);
		panelAltaModificacion.setLayout(null);

		jpNombre = new JPanel();
		jpNombre.setBackground(Color.WHITE);
		jpNombre.setBounds(10, 36, 140, 57);
		panelAltaModificacion.add(jpNombre);
		jpNombre.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setBounds(0, 26, 140, 31);
		jpNombre.add(txtNombre);
		txtNombre.setColumns(10);

		jlNombre = new JLabel("Nombre");
		jlNombre.setBounds(0, 0, 87, 25);
		jpNombre.add(jlNombre);
		jlNombre.setForeground(Color.BLACK);
		jlNombre.setFont(new Font("Open Sans", Font.PLAIN, 14));

		jpApellido = new JPanel();
		jpApellido.setBackground(Color.WHITE);
		jpApellido.setBounds(154, 36, 140, 57);
		panelAltaModificacion.add(jpApellido);
		jpApellido.setLayout(null);

		jlApellido = new JLabel("Apellido");
		jlApellido.setBounds(0, 0, 87, 25);
		jpApellido.add(jlApellido);
		jlApellido.setForeground(Color.BLACK);
		jlApellido.setFont(new Font("Open Sans", Font.PLAIN, 14));

		txtApellido = new JTextField();
		txtApellido.setBounds(0, 26, 140, 31);
		jpApellido.add(txtApellido);
		txtApellido.setColumns(10);
		
		jpEmail = new JPanel();
		jpEmail.setLayout(null);
		jpEmail.setBackground(Color.WHITE);
		jpEmail.setBounds(10, 99, 284, 57);
		panelAltaModificacion.add(jpEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(0, 26, 284, 31);
		jpEmail.add(txtEmail);
		
		jlEmail = new JLabel("Email");
		jlEmail.setForeground(Color.BLACK);
		jlEmail.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jlEmail.setBounds(0, 0, 87, 25);
		jpEmail.add(jlEmail);
		
		jpCedula = new JPanel();
		jpCedula.setLayout(null);
		jpCedula.setBackground(Color.WHITE);
		jpCedula.setBounds(154, 228, 140, 57);
		panelAltaModificacion.add(jpCedula);
		
		jlCedula = new JLabel("C\u00E9dula");
		jlCedula.setForeground(Color.BLACK);
		jlCedula.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jlCedula.setBounds(0, 0, 87, 25);
		jpCedula.add(jlCedula);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(0, 26, 140, 31);
		jpCedula.add(txtCedula);
		
		jpNick = new JPanel();
		jpNick.setLayout(null);
		jpNick.setBackground(Color.WHITE);
		jpNick.setBounds(10, 228, 140, 57);
		panelAltaModificacion.add(jpNick);
		
		txtNick = new JTextField();
		txtNick.setColumns(10);
		txtNick.setBounds(0, 26, 140, 31);
		jpNick.add(txtNick);
		
		jlNick = new JLabel("Nick");
		jlNick.setForeground(Color.BLACK);
		jlNick.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jlNick.setBounds(0, 0, 87, 25);
		jpNick.add(jlNick);
		
		jpPass = new JPanel();
		jpPass.setLayout(null);
		jpPass.setBackground(Color.WHITE);
		jpPass.setBounds(10, 164, 284, 57);
		panelAltaModificacion.add(jpPass);
		
		jlPass = new JLabel("Contrase\u00F1a");
		jlPass.setForeground(Color.BLACK);
		jlPass.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jlPass.setBounds(0, 0, 87, 25);
		jpPass.add(jlPass);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(0, 25, 284, 31);
		jpPass.add(txtPass);
		
		jpRol = new JPanel();
		jpRol.setBackground(Color.WHITE);
		jpRol.setBounds(10, 296, 284, 57);
		panelAltaModificacion.add(jpRol);
		jpRol.setLayout(null);
		
		jlRol = new JLabel("Rol");
		jlRol.setBounds(0, 0, 87, 25);
		jlRol.setForeground(Color.BLACK);
		jlRol.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jpRol.add(jlRol);
		
		cbRol = new JComboBox<Rol>();
		cbRol.setBounds(0, 26, 284, 31);
		jpRol.add(cbRol);
		
		jpProfInst = new JPanel();
		jpProfInst.setLayout(null);
		jpProfInst.setBackground(Color.WHITE);
		jpProfInst.setBounds(10, 364, 284, 57);
		panelAltaModificacion.add(jpProfInst);
		
		lblProfesioninstituto = new JLabel("Profesi\u00F3n / Instituto");
		lblProfesioninstituto.setForeground(Color.BLACK);
		lblProfesioninstituto.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblProfesioninstituto.setBounds(0, 0, 181, 25);
		jpProfInst.add(lblProfesioninstituto);
		
		cbProfesionInstituto = new JComboBox();
		cbProfesionInstituto.setBounds(0, 26, 181, 31);
		jpProfInst.add(cbProfesionInstituto);
				
		btnNuevoProfInst = new JButton("+");
		btnNuevoProfInst.setBounds(195, 25, 89, 32);
		jpProfInst.add(btnNuevoProfInst);
		btnNuevoProfInst.setFont(new Font("Roboto Black", Font.BOLD, 16));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(75, 437, 157, 46);
		panelAltaModificacion.add(btnGuardar);
		
		btnLimpiar = new JButton("Limpiar campos");
		btnLimpiar.setOpaque(false);
		btnLimpiar.setBounds(154, 11, 140, 23);
		panelAltaModificacion.add(btnLimpiar);
		
		JPListadoDeRegistros = new JPanel();
		JPListadoDeRegistros.setBackground(Color.WHITE);
		JPListadoDeRegistros.setBounds(323, 66, 605, 494);
		panel.add(JPListadoDeRegistros);
		JPListadoDeRegistros.setLayout(null);
		
		JPBuscar = new JPanel();
		JPBuscar.setBackground(Color.WHITE);
		JPBuscar.setBounds(10, 11, 548, 64);
		JPListadoDeRegistros.add(JPBuscar);
		JPBuscar.setLayout(null);
		
		lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(Color.BLACK);
		lblBuscar.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblBuscar.setBounds(0, 0, 87, 25);
		JPBuscar.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(0, 26, 251, 31);
		JPBuscar.add(txtBuscar);
		
		CBFiltro = new JComboBox();
		CBFiltro.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Apellido", "Email", "Nick", "C\u00E9dula", "Rol", "Profesi\u00F3n"}));
		CBFiltro.setBounds(261, 26, 134, 31);
		JPBuscar.add(CBFiltro);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(405, 26, 134, 31);
		JPBuscar.add(btnBuscar);
		
		jtListado = new JTable();
		jtListado.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		jtListado.setBounds(10, 86, 548, 366);
		JPListadoDeRegistros.add(jtListado);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(469, 463, 89, 23);
		JPListadoDeRegistros.add(btnEliminar);
		
		lblListadoDeRegistros = new JLabel("Listado de registros");
		lblListadoDeRegistros.setForeground(Color.BLACK);
		lblListadoDeRegistros.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblListadoDeRegistros.setBounds(323, 11, 294, 44);
		panel.add(lblListadoDeRegistros);
		
		btnVolver = new JButton("Volver a pantalla principal");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setBounds(598, 571, 331, 31);
		panel.add(btnVolver);
		
		lblTodosLosCampos = new JLabel("Todos los campos son obligatorios");
		lblTodosLosCampos.setForeground(Color.BLACK);
		lblTodosLosCampos.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblTodosLosCampos.setBounds(10, 36, 294, 31);
		panel.add(lblTodosLosCampos);

		// REDIMENSIONADO DE PANTALLA ***************
		// REDIMENSIONADO DE PANTALLA ***************
		// REDIMENSIONADO DE PANTALLA ***************
		jf.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent ev) {
				Dimension size = jf.getSize();
				if (size.getWidth() < 960) {
					if (size.getHeight() < 600) {
						jf.setSize(980, 600);
					} else {
						jf.setSize(980, (int) size.getHeight());
					}
				} else {
					if (size.getHeight() < 650) {
						jf.setSize((int) size.getWidth(), 650);
					}
				}
				int marginTop = (int) (size.getHeight() - panel.getHeight()) / 2;
				int marginLeft = (int) (size.getWidth() - panel.getWidth()) / 2;
				panel.setBounds(marginLeft, marginTop, 960, 600);
			}
		});

		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
}
