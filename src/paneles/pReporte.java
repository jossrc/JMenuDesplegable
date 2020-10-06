package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pReporte extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public pReporte() {
		setLayout(null);
		
		JLabel lblReporte = new JLabel("REPORTE ");
		lblReporte.setBounds(325, 25, 49, 14);
		add(lblReporte);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(pReporte.class.getResource("/img1/report.png")));
		lblNewLabel.setBounds(325, 169, 68, 52);
		add(lblNewLabel);

	}

}
