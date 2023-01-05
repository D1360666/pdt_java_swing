package Helper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.security.MessageDigest;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.ConHome;

public class Auxiliar {
	/**
	 * Muestra avisos con JOptiopane
	 * 
	 * @param msj
	 * @param tipo
	 */
	public static void avisar(String msj, String tipo) {
		int alerta = JOptionPane.INFORMATION_MESSAGE;
		if (tipo.toLowerCase().equals("error")) {
			alerta = JOptionPane.ERROR_MESSAGE;
			JOptionPane.showMessageDialog(null, msj, "Error", alerta);
		}
		if (tipo.toLowerCase().equals("info")) {
			alerta = JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog(null, msj, "Información", alerta);
		}
		
	}

	/**
	 * Redimensiona imágenes
	 * 
	 * @param srcImg Imagen original
	 * @param w      Ancho deseado
	 * @param h      Alto deseado
	 * @return Imagen con nuevo tamaño
	 */
	public static Image redimensionarImagenes(Image srcImg, int w, int h) {
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();

		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();

		return resizedImg;
	}

	/**
	 * Función que cierra la ventana que se le indique y vuelve a abrir el menú ppal
	 * de la aplicación
	 * 
	 * @param jf JFrame que se desea cerrar
	 */
	public static void volverAlMenuPrincipal(JFrame jf) {
		ConHome cn = new ConHome();
		jf.dispose();
	}

	/**
	 * Recibe un texto y lo encripta por medio de MD5 Ideal para usar en contraseñas
	 * 
	 * @param passwordToHash Texto a encriptar
	 * @return String con el texto encriptado
	 */
	public static String passwordToHash(String passwordToHash) {
		String generatedPassword = null;

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(passwordToHash.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			generatedPassword = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return generatedPassword;
	}

	/**
	 * Valida formato de email dado
	 * 
	 * @param email String que contiene el correo a validar
	 * @return boolean True si el formato es válido, de lo contrario false
	 */
	public static boolean validarEmail(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		return email.matches(regex);
	}

	

}
