package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Helper.Auxiliar;
import View.VisABMCasillas;

public class ConCasillas implements ActionListener {
	private VisABMCasillas visABMCasillas;
	
	public ConCasillas() {
		super();
		this.visABMCasillas = new VisABMCasillas();

		this.visABMCasillas.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == visABMCasillas.btnVolver) { // BOTON PARA VER OPCIONES DE GEOGRAFIA -----------------------
			Auxiliar.volverAlMenuPrincipal(visABMCasillas.jf);
		}

	}

}
