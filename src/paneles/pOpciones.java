package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pOpciones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public pOpciones() {
		setLayout(null);
		
		JLabel lblOpciones = new JLabel("OPCIONES");
		lblOpciones.setBounds(297, 33, 52, 14);
		add(lblOpciones);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(pOpciones.class.getResource("/img1/chat.png")));
		lblNewLabel.setBounds(265, 120, 138, 96);
		add(lblNewLabel);

	}

}
