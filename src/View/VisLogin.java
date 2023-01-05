package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Panel;
import javax.swing.SwingConstants;

public class VisLogin {

	private JPanel contentPane;
	public JTextField txtEmail;
	public JPasswordField txtPass;
	public JButton btnLogin;
	public JFrame jf;
	private JLabel lblEmail;
	private JLabel lblPass;

	/**
	 * Create the frame.
	 */
	public VisLogin() {
		jf = new JFrame();
		
		jf.setTitle("Acceso de usuarios");
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 400, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);

		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblEmail.setBounds(10, 203, 46, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField("leandro@correo.com");
		txtEmail.setBounds(10, 220, 361, 47);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblPass.setBounds(10, 280, 100, 14);
		contentPane.add(lblPass);

		txtPass = new JPasswordField("1234");
		txtPass.setBounds(10, 297, 361, 47);
		contentPane.add(txtPass);

		btnLogin = new JButton("Entrar");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Roboto", Font.BOLD, 14));
		btnLogin.setBackground(new Color(0, 102, 204));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(132, 366, 145, 47);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VisLogin.class.getResource("/Resources/Imgs/Home/logoFront.png")));
		lblNewLabel.setBounds(67, 11, 243, 175);
		contentPane.add(lblNewLabel);
		
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
}
