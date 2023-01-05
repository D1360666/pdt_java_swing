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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class VisABMCasillas {
	public JFrame jf;
	private Image img;
	Border dashed;

	// PANELES --------
	public JPanel contentPane;
	public JPanel panel;
	public JPanel panelAltaModificacion;
	public JPanel jpDescripcion;
	public JPanel jpUnidad;
	public JPanel jpTipoValor;
	public JPanel jpTipoInput;
	public JPanel JPListadoDeRegistros;
	public JPanel JPBuscar;
	public JPanel jpLargo;
	public JPanel jpParametro;
	
	// LABELS ----------
	private JLabel lblAltaModificacion;
	private JLabel jlDescripcion;
	private JLabel lblUnidad;
	private JLabel lblTipoValor;
	private JLabel lblTipoInput;
	private JLabel lblBuscar;
	private JLabel lblListadoDeRegistros;
	private JLabel jlLargo;
	private JLabel lblParametro;
	
	// CAMPOS DE TEXTOS ---------
	private JTextField txtDescripcion;
	private JTextField txtLargo;
	private JTextField txtBuscar;
	
	// BOTONES --------------------
	public JButton btnNuevoParametro;
	public JButton btnGuardar;
	public JButton btnNuevaUnidad;
	public JButton btnNuevoTipoValor;
	public JButton btnNuevoTipoInput;
	public JButton btnBuscar;
	public JButton btnEliminar;
	public JButton btnVolver;
	
	// COMBOBOX -------------------
	private JComboBox cbParametro;
	public JComboBox cbUnidad;
	public JComboBox cbTipoValor;
	public JComboBox cbTipoInput;
	
	// OTROS -------------
	public JTable jtListado;

	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public VisABMCasillas() {
		jf = new JFrame();
		jf.setMaximumSize(new Dimension(1920, 1080));
		jf.setFont(new Font("Open Sans", Font.PLAIN, 12));
		jf.setTitle("Mantenimiento de casillas");
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
		panel.setBounds(33, 11, 959, 639);
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
		panelAltaModificacion.setBounds(10, 48, 303, 512);
		panel.add(panelAltaModificacion);
		panelAltaModificacion.setLayout(null);

		jpDescripcion = new JPanel();
		jpDescripcion.setBackground(Color.WHITE);
		jpDescripcion.setBounds(10, 11, 284, 57);
		panelAltaModificacion.add(jpDescripcion);
		jpDescripcion.setLayout(null);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(0, 26, 284, 31);
		jpDescripcion.add(txtDescripcion);
		txtDescripcion.setColumns(10);

		jlDescripcion = new JLabel("Descripci\u00F3n");
		jlDescripcion.setBounds(0, 0, 87, 25);
		jpDescripcion.add(jlDescripcion);
		jlDescripcion.setForeground(Color.BLACK);
		jlDescripcion.setFont(new Font("Open Sans", Font.PLAIN, 14));
		
		jpLargo = new JPanel();
		jpLargo.setLayout(null);
		jpLargo.setBackground(Color.WHITE);
		jpLargo.setBounds(10, 80, 284, 57);
		panelAltaModificacion.add(jpLargo);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(0, 26, 284, 31);
		jpLargo.add(txtLargo);
		
		jlLargo = new JLabel("Largo");
		jlLargo.setForeground(Color.BLACK);
		jlLargo.setFont(new Font("Open Sans", Font.PLAIN, 14));
		jlLargo.setBounds(0, 0, 87, 25);
		jpLargo.add(jlLargo);
		
		jpParametro = new JPanel();
		jpParametro.setLayout(null);
		jpParametro.setBackground(Color.WHITE);
		jpParametro.setBounds(10, 149, 284, 57);
		panelAltaModificacion.add(jpParametro);
		
		lblParametro = new JLabel("Par\u00E1metro");
		lblParametro.setForeground(Color.BLACK);
		lblParametro.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblParametro.setBounds(0, 0, 181, 25);
		jpParametro.add(lblParametro);
		
		cbParametro = new JComboBox();
		cbParametro.setBounds(0, 26, 181, 31);
		jpParametro.add(cbParametro);
		
		
		btnNuevoParametro = new JButton("+");
		btnNuevoParametro.setFont(new Font("Roboto Black", Font.BOLD, 16));
		btnNuevoParametro.setBounds(195, 26, 89, 32);
		jpParametro.add(btnNuevoParametro);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(76, 434, 157, 46);
		panelAltaModificacion.add(btnGuardar);
		
		jpUnidad = new JPanel();
		jpUnidad.setLayout(null);
		jpUnidad.setBackground(Color.WHITE);
		jpUnidad.setBounds(10, 218, 284, 57);
		panelAltaModificacion.add(jpUnidad);
		
		lblUnidad = new JLabel("Unidad");
		lblUnidad.setForeground(Color.BLACK);
		lblUnidad.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblUnidad.setBounds(0, 0, 181, 25);
		jpUnidad.add(lblUnidad);
		
		cbUnidad = new JComboBox();
		cbUnidad.setBounds(0, 26, 181, 31);
		jpUnidad.add(cbUnidad);
		
		btnNuevaUnidad = new JButton("+");
		btnNuevaUnidad.setFont(new Font("Roboto Black", Font.BOLD, 16));
		btnNuevaUnidad.setBounds(195, 26, 89, 32);
		jpUnidad.add(btnNuevaUnidad);
		
		jpTipoValor = new JPanel();
		jpTipoValor.setLayout(null);
		jpTipoValor.setBackground(Color.WHITE);
		jpTipoValor.setBounds(10, 287, 284, 57);
		panelAltaModificacion.add(jpTipoValor);
		
		
		lblTipoValor = new JLabel("Tipo de valor");
		lblTipoValor.setForeground(Color.BLACK);
		lblTipoValor.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblTipoValor.setBounds(0, 0, 181, 25);
		jpTipoValor.add(lblTipoValor);
		
		cbTipoValor = new JComboBox();
		cbTipoValor.setBounds(0, 26, 181, 31);
		jpTipoValor.add(cbTipoValor);
		
		btnNuevoTipoValor = new JButton("+");
		btnNuevoTipoValor.setFont(new Font("Roboto Black", Font.BOLD, 16));
		btnNuevoTipoValor.setBounds(195, 26, 89, 32);
		jpTipoValor.add(btnNuevoTipoValor);
		
		jpTipoInput = new JPanel();
		jpTipoInput.setLayout(null);
		jpTipoInput.setBackground(Color.WHITE);
		jpTipoInput.setBounds(10, 356, 284, 57);
		panelAltaModificacion.add(jpTipoInput);
		
		lblTipoInput = new JLabel("Tipo de input");
		lblTipoInput.setForeground(Color.BLACK);
		lblTipoInput.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lblTipoInput.setBounds(0, 0, 181, 25);
		jpTipoInput.add(lblTipoInput);
		
		cbTipoInput = new JComboBox();
		cbTipoInput.setBounds(0, 26, 181, 31);
		jpTipoInput.add(cbTipoInput);
		
		btnNuevoTipoInput = new JButton("+");
		btnNuevoTipoInput.setFont(new Font("Roboto Black", Font.BOLD, 16));
		btnNuevoTipoInput.setBounds(195, 26, 89, 32);
		jpTipoInput.add(btnNuevoTipoInput);		
		
		JPListadoDeRegistros = new JPanel();
		JPListadoDeRegistros.setBackground(Color.WHITE);
		JPListadoDeRegistros.setBounds(323, 48, 605, 512);
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
		txtBuscar.setBounds(0, 26, 395, 31);
		JPBuscar.add(txtBuscar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(405, 26, 134, 31);
		JPBuscar.add(btnBuscar);
		
		jtListado = new JTable();
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
		btnVolver.setBounds(597, 571, 331, 31);
		panel.add(btnVolver);

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
