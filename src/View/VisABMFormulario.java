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
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class VisABMFormulario {
	public JFrame jf;
	private Image img;
	Border dashed;

	// PANELES --------
	public JPanel contentPane;
	public JPanel panel;
	public JPanel panelAltaModificacion;
	public JPanel jpNombre;
	public JPanel jpApellido;
	public JPanel JPListadoDeRegistros;
	
	// LABELS ----------
	private JLabel lblAltaModificacion;
	private JLabel jlNombre;
	private JLabel jlApellido;
	private JLabel lblTodosLosCampos;
	
	// CAMPOS DE TEXTOS ---------
	public JTextField txtNombre;
	public JTextField txtDescripcion;
	
	// BOTONES ------------------
	public JButton btnVolver;
	public JButton btnGuardar;
	public JTable jtListado;
	private JLabel lblListadoDeRegistros;
	public JButton btnAgregarCasilla;
	public JButton btnGuardarCasillas;
	public JPanel pnCasillas;
	public JTable jtCasillas;
	private JLabel lblSeleccioneCasilla;
	public JButton btnAgregar;
	public JButton btnCerrar;
	private JTextField txtCasillaAAgregar;
	public JButton btnConfirmarCasilla;
	
	
	/**
	 * Create the frame.
	 */
	public VisABMFormulario() {
		jf = new JFrame();
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage(VisABMFormulario.class.getResource("/Resources/Imgs/Home/Usuario.png")));
		jf.setMaximumSize(new Dimension(1920, 1080));
		jf.setFont(new Font("Open Sans", Font.PLAIN, 12));
		jf.setTitle("Mantenimiento de usuarios");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(0, 0, 1025, 645);

		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);
		dashed = BorderFactory.createDashedBorder(null, 2, 3, 3, true);
		
		pnCasillas = new JPanel();
		pnCasillas.setBounds(10, 546, 800, 600);
		contentPane.add(pnCasillas);
		pnCasillas.setLayout(null);
		
		jtCasillas = new JTable();
		jtCasillas.setBounds(30, 58, 712, 420);
		jtCasillas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOMBRE", "ID"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtCasillas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCasillas.add(jtCasillas);
		
		lblSeleccioneCasilla = new JLabel("Seleccione casilla para agregar al formulario");
		lblSeleccioneCasilla.setForeground(Color.BLACK);
		lblSeleccioneCasilla.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblSeleccioneCasilla.setBounds(20, 0, 422, 44);
		pnCasillas.add(lblSeleccioneCasilla);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(20, 531, 111, 44);
		pnCasillas.add(btnAgregar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(597, 531, 111, 44);
		pnCasillas.add(btnCerrar);

		// BLOQUE GENERAL :::::::::::::::::::::::::::::::::
		panel = new JPanel();
		panel.setBounds(33, 11, 943, 577);
		contentPane.add(panel);
		panel.setLayout(null);

		// TITULO :::::::::::::::::::::::::::::::::::::::::
		lblAltaModificacion = new JLabel("Alta / Modificaci\u00F3n de Formularios");
		lblAltaModificacion.setBounds(10, 11, 422, 44);
		panel.add(lblAltaModificacion);
		lblAltaModificacion.setForeground(Color.BLACK);
		lblAltaModificacion.setFont(new Font("Roboto", Font.PLAIN, 20));

		// FORM DE ALTA Y MODIFICACIÓN ::::::::::::::::::::
		panelAltaModificacion = new JPanel();
		panelAltaModificacion.setBackground(Color.WHITE);
		panelAltaModificacion.setBounds(10, 66, 918, 215);
		panel.add(panelAltaModificacion);
		panelAltaModificacion.setLayout(null);

		jpNombre = new JPanel();
		jpNombre.setBackground(Color.WHITE);
		jpNombre.setBounds(10, 11, 886, 57);
		panelAltaModificacion.add(jpNombre);
		jpNombre.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setBounds(0, 26, 876, 31);
		jpNombre.add(txtNombre);
		txtNombre.setColumns(10);

		jlNombre = new JLabel("Nombre");
		jlNombre.setBounds(0, 0, 87, 25);
		jpNombre.add(jlNombre);
		jlNombre.setForeground(Color.BLACK);
		jlNombre.setFont(new Font("Open Sans", Font.PLAIN, 14));

		jpApellido = new JPanel();
		jpApellido.setBackground(Color.WHITE);
		jpApellido.setBounds(10, 85, 886, 57);
		panelAltaModificacion.add(jpApellido);
		jpApellido.setLayout(null);

		jlApellido = new JLabel("Descripci\u00F3n");
		jlApellido.setBounds(0, 0, 87, 25);
		jpApellido.add(jlApellido);
		jlApellido.setForeground(Color.BLACK);
		jlApellido.setFont(new Font("Open Sans", Font.PLAIN, 14));

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(0, 26, 876, 31);
		jpApellido.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(10, 153, 157, 46);
		panelAltaModificacion.add(btnGuardar);
		
		JPListadoDeRegistros = new JPanel();
		JPListadoDeRegistros.setBackground(Color.WHITE);
		JPListadoDeRegistros.setBounds(10, 333, 918, 174);
		panel.add(JPListadoDeRegistros);
		JPListadoDeRegistros.setLayout(null);
		
		jtListado = new JTable();
		jtListado.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		jtListado.setBounds(29, 11, 700, 149);
		JPListadoDeRegistros.add(jtListado);
		
		btnAgregarCasilla = new JButton("Agregar Casilla");
		btnAgregarCasilla.setBounds(740, 11, 113, 34);
		JPListadoDeRegistros.add(btnAgregarCasilla);
		
		btnGuardarCasillas = new JButton("Confirmar");
		btnGuardarCasillas.setBounds(740, 126, 113, 34);
		JPListadoDeRegistros.add(btnGuardarCasillas);
		
		btnVolver = new JButton("Volver a pantalla principal");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setBounds(597, 529, 331, 31);
		panel.add(btnVolver);
		
		lblTodosLosCampos = new JLabel("Todos los campos son obligatorios");
		lblTodosLosCampos.setForeground(Color.BLACK);
		lblTodosLosCampos.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblTodosLosCampos.setBounds(10, 36, 294, 31);
		panel.add(lblTodosLosCampos);
		
		lblListadoDeRegistros = new JLabel("Casillas");
		lblListadoDeRegistros.setForeground(Color.BLACK);
		lblListadoDeRegistros.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblListadoDeRegistros.setBounds(10, 292, 294, 44);
		panel.add(lblListadoDeRegistros);
		
		txtCasillaAAgregar = new JTextField();
		txtCasillaAAgregar.setBounds(145, 307, 250, 20);
		panel.add(txtCasillaAAgregar);
		txtCasillaAAgregar.setColumns(10);
		
		JCheckBox chkObligatorio = new JCheckBox("Obligatorio");
		chkObligatorio.setBounds(419, 306, 97, 23);
		panel.add(chkObligatorio);
		
		JButton btnConfirmarCasilla = new JButton("+");
		btnConfirmarCasilla.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConfirmarCasilla.setBounds(547, 307, 49, 23);
		panel.add(btnConfirmarCasilla);

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
