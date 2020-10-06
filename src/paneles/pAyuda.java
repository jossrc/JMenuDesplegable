package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pAyuda extends JPanel {

	private static final long serialVersionUID = 1L;

	public pAyuda() {
		setLayout(null);
		
		JLabel lblAyuda = new JLabel("AYUDA");
		lblAyuda.setBounds(292, 34, 46, 14);
		add(lblAyuda);
		
		JLabel lblElMejorGrupo = new JLabel("EL MEJOR GRUPO");
		lblElMejorGrupo.setBounds(268, 83, 86, 14);
		add(lblElMejorGrupo);
		
		JLabel lblByRobles = new JLabel("BY ROBLES");
		lblByRobles.setBounds(292, 166, 53, 14);
		add(lblByRobles);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(pAyuda.class.getResource("/img1/help.png")));
		lblNewLabel.setBounds(292, 265, 77, 37);
		add(lblNewLabel);

	}

}
