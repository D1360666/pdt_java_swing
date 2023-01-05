package Controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;
import javax.transaction.Transactional.TxType;

import com.exceptions.serviciosExcepciones;
import com.servicios.Formulario.CasillaBeanRemote;
import com.servicios.Formulario.FormularioBeanRemote;
import com.exceptions.serviciosExcepciones;
import Helper.Auxiliar;
import Helper.Globals;
import View.VisABMFormulario;
import model.Formulario;
import model.Casilla;

public class ConFormulario implements ActionListener{

	private VisABMFormulario visABMFormulario;
	private FormularioBeanRemote fbr;
	private CasillaBeanRemote cbr;
	
	
	public ConFormulario() throws NamingException, serviciosExcepciones{
		super();
			
		try {
			this.fbr = (FormularioBeanRemote) InitialContext.doLookup("FromTables/FormularioBean!com.servicios.FormularioBeanRemote");
			this.cbr = (CasillaBeanRemote) InitialContext.doLookup("FromTables/CasillaBean!com.servicios.CasillaBeanRemote");
		}catch(NamingException e) {
			Auxiliar.avisar(e.getMessage(), "Error");
		}
		this.visABMFormulario = new VisABMFormulario();
		this.visABMFormulario.btnGuardar.addActionListener(this);
		this.visABMFormulario.btnVolver.addActionListener(this);
		this.visABMFormulario.btnAgregarCasilla.addActionListener(this);
		this.visABMFormulario.btnGuardarCasillas.addActionListener(this);
		this.visABMFormulario.btnAgregar.addActionListener(this);
		this.visABMFormulario.btnCerrar.addActionListener(this);
		this.visABMFormulario.btnConfirmarCasilla.addActionListener(this);
		this.visABMFormulario.pnCasillas.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		Auxiliar.avisar(obj.toString(), "error");
		if(obj == visABMFormulario.btnVolver) {
			Auxiliar.volverAlMenuPrincipal(visABMFormulario.jf);
			
		}else if(obj == visABMFormulario.btnGuardar) {
			try {
				//GUARDAR FORMULARIO
				if(visABMFormulario.txtNombre.equals(null)||visABMFormulario.txtDescripcion.equals(null)) {
					Auxiliar.avisar("Debe completar los campos referidos a formulario", "Error");
				}else if(visABMFormulario.txtNombre.getDocument().getLength()>50 || visABMFormulario.txtDescripcion.getDocument().getLength() > 500) {
					Auxiliar.avisar("Se ha superado el total de caracteres de un campo, verifique.", "Error");
				}else {
					Formulario f = new Formulario();
					f.setNombre(visABMFormulario.txtNombre.getText());
					f.setDescripcion(visABMFormulario.txtDescripcion.getText());
					f.setUsuario(Globals.usuario);
					
					if(fbr.altaFormulario(f)==true) {
						Auxiliar.avisar("Formulario registrado", "info");
					}
				}	
				
			} catch (serviciosExcepciones e1) {
				Auxiliar.avisar(e1.getMessage(), "error");
				e1.printStackTrace();
			}
		}else if(obj == visABMFormulario.btnAgregarCasilla) {
			//ABRIR GRILLA DE CASILLAS
			try {
				//CARGANDO DATOS DE CASILLAS
				visABMFormulario.pnCasillas.setVisible(true);
				ArrayList<Casilla> listaCasillas = new ArrayList<Casilla>();
				listaCasillas = cbr.obtenerCasillas();
				DefaultTableModel modelo = new DefaultTableModel();
				
				ArrayList<Object>nombreColumna = new ArrayList<Object>();
				nombreColumna.add("ID");
				nombreColumna.add("NOMBRE");
				for (Object col : nombreColumna) {
					modelo.addColumn(col);
				}
				
				visABMFormulario.jtCasillas.setModel(modelo);
				
				for(Casilla ca : listaCasillas) {
					
				}
			
			} catch (serviciosExcepciones e1) {

				e1.printStackTrace();
			}
			
		}else if (obj == visABMFormulario.btnGuardarCasillas) {
			/*try {
				//GUARDAR Casillas
				
			} catch (serviciosExcepciones e1) {

				e1.printStackTrace();
			}*/
		}else if (obj == visABMFormulario.btnCerrar) {
			visABMFormulario.pnCasillas.setVisible(true);
		}else if (obj == visABMFormulario.btnAgregar) {
			
		}
	}

}
