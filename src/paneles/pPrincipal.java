package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class pPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public pPrincipal() {
		setLayout(null);
		
		JLabel lblPrincipal = new JLabel("PRINCIPAL");
		lblPrincipal.setBounds(271, 62, 53, 14);
		add(lblPrincipal);

	}

}
