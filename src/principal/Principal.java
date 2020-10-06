package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Animacion.Animacion;
import paneles.CambiaPanel;
import paneles.pAyuda;
import paneles.pMantenimiento;
import paneles.pOpciones;
import paneles.pPrincipal;
import paneles.pReporte;
import rsbuttom.RSButtonMetro;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pAside;
	private JPanel pMain;

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				} catch (Throwable e) {
					e.printStackTrace();
				}
				
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pBody = new JPanel();
		pBody.setBackground(new Color(230, 230, 230));
		pBody.setBounds(0, 0, 904, 537);
		contentPane.add(pBody);
		pBody.setLayout(null);
		
		JPanel pHeader = new JPanel();
		pHeader.setBounds(0, 0, 905, 69);
		pHeader.setBackground(new Color(241, 71, 38));
		pBody.add(pHeader);
		pHeader.setLayout(null);
		
		JButton btnHamburguesa = new JButton("");
		btnHamburguesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int posicion = pAside.getX();
				if (posicion > -1) {
					Animacion.mover_izquierda(0, -188, 2, 2, pAside);
				} else {
					Animacion.mover_derecha(-188, 0, 2, 2, pAside);
				}
			}
		});
		btnHamburguesa.setBorder(null);
		btnHamburguesa.setIcon(new ImageIcon(Principal.class.getResource("/img/menu (1).png")));
		btnHamburguesa.setBackground(new Color(241,71,38));
		btnHamburguesa.setBounds(10, 11, 67, 47);
		pHeader.add(btnHamburguesa);
		
		pAside = new JPanel();
		pAside.setBounds(0, 68, 192, 469);
		pAside.setBorder(null);
		pAside.setBackground(new Color(153, 153, 153));
		pBody.add(pAside);
		pAside.setLayout(null);
		
		JPanel pTextoPri = new JPanel();
		pTextoPri.setBackground(new Color(153,153,153));
		pTextoPri.setBounds(0, 0, 193, 60);
		pAside.add(pTextoPri);
		pTextoPri.setLayout(null);
		
		JLabel lblPrincipal = new JLabel("Principal");
		lblPrincipal.setForeground(new Color(128,128,128));
		lblPrincipal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrincipal.setBounds(10, 31, 79, 22);
		pTextoPri.add(lblPrincipal);
		
		RSButtonMetro btnMantenimiento = new RSButtonMetro();
		btnMantenimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CambiaPanel(pMain, new pMantenimiento());
			}
		});
		btnMantenimiento.setHorizontalAlignment(SwingConstants.LEFT);
		btnMantenimiento.setIcon(new ImageIcon(Principal.class.getResource("/img1/venta.png")));
		btnMantenimiento.setText("Mantenimiento");
		btnMantenimiento.setIconTextGap(25);
		btnMantenimiento.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnMantenimiento.setColorTextNormal(Color.WHITE);
		btnMantenimiento.setColorNormal(new Color(153, 153, 153));
		btnMantenimiento.setColorHover(new Color(172, 172, 172));
		btnMantenimiento.setBounds(10, 111, 183, 35);
		pAside.add(btnMantenimiento);
		
		RSButtonMetro btnHome = new RSButtonMetro();		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CambiaPanel(pMain, new pPrincipal());
			}
		});
		btnHome.setMargin(new Insets(0, 100, 0, 0));
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIcon(new ImageIcon(Principal.class.getResource("/img1/home.png")));
		btnHome.setText("Home");
		btnHome.setIconTextGap(25);
		btnHome.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHome.setColorTextNormal(Color.WHITE);
		btnHome.setColorNormal(new Color(153, 153, 153));
		btnHome.setColorHover(new Color(172, 172, 172));
		btnHome.setBounds(10, 71, 183, 35);
		pAside.add(btnHome);
		
		RSButtonMetro btnOpciones = new RSButtonMetro();
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CambiaPanel(pMain, new pOpciones());
			}
		});
		btnOpciones.setHorizontalAlignment(SwingConstants.LEFT);
		btnOpciones.setIcon(new ImageIcon(Principal.class.getResource("/img1/opciones.png")));
		btnOpciones.setText("Opciones");
		btnOpciones.setIconTextGap(25);
		btnOpciones.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnOpciones.setColorTextNormal(Color.WHITE);
		btnOpciones.setColorNormal(new Color(153, 153, 153));
		btnOpciones.setColorHover(new Color(172, 172, 172));
		btnOpciones.setBounds(10, 203, 183, 35);
		pAside.add(btnOpciones);
		
		RSButtonMetro btnAyuda = new RSButtonMetro();
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CambiaPanel(pMain, new pAyuda());
			}
		});
		btnAyuda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAyuda.setIcon(new ImageIcon(Principal.class.getResource("/img1/help.png")));
		btnAyuda.setText("Ayuda");
		btnAyuda.setIconTextGap(25);
		btnAyuda.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAyuda.setColorTextNormal(Color.WHITE);
		btnAyuda.setColorNormal(new Color(153, 153, 153));
		btnAyuda.setColorHover(new Color(172, 172, 172));
		btnAyuda.setBounds(10, 245, 183, 35);
		pAside.add(btnAyuda);
		
		RSButtonMetro btnReporte = new RSButtonMetro();
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CambiaPanel(pMain, new pReporte());
			}
		});
		btnReporte.setHorizontalAlignment(SwingConstants.LEFT);
		btnReporte.setIcon(new ImageIcon(Principal.class.getResource("/img1/report.png")));
		btnReporte.setText("Reporte");
		btnReporte.setIconTextGap(25);
		btnReporte.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnReporte.setColorTextNormal(Color.WHITE);
		btnReporte.setColorNormal(new Color(153, 153, 153));
		btnReporte.setColorHover(new Color(172, 172, 172));
		btnReporte.setBounds(10, 157, 183, 35);
		pAside.add(btnReporte);
		
		RSButtonMetro btnCerrar = new RSButtonMetro();
		btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrar.setIcon(new ImageIcon(Principal.class.getResource("/img1/cerrar.png")));
		btnCerrar.setText("Cerrar Sesi\u00F3n");
		btnCerrar.setIconTextGap(25);
		btnCerrar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCerrar.setColorTextNormal(Color.WHITE);
		btnCerrar.setColorNormal(new Color(153, 153, 153));
		btnCerrar.setColorHover(new Color(172, 172, 172));
		btnCerrar.setBounds(10, 421, 183, 35);
		pAside.add(btnCerrar);
		
		JPanel effectHome = new JPanel();
		effectHome.setBackground(new Color(153,153,153));
		effectHome.setBounds(0, 71, 10, 35);
		pAside.add(effectHome);
		
		JPanel effectMantenimiento = new JPanel();
		effectMantenimiento.setBackground(new Color(153,153,153));
		effectMantenimiento.setBounds(0, 111, 10, 35);
		pAside.add(effectMantenimiento);
		
		JPanel effectReporte = new JPanel();
		effectReporte.setBackground(new Color(153,153,153));
		effectReporte.setBounds(0, 157, 10, 35);
		pAside.add(effectReporte);
		
		JPanel effectOpciones = new JPanel();
		effectOpciones.setBackground(new Color(153,153,153));
		effectOpciones.setBounds(0, 203, 10, 35);
		pAside.add(effectOpciones);
		
		JPanel effectAyuda = new JPanel();
		effectAyuda.setBackground(new Color(153,153,153));
		effectAyuda.setBounds(0, 245, 10, 35);
		pAside.add(effectAyuda);
		
		hover(btnHome, effectHome);
		hover(btnMantenimiento, effectMantenimiento);
		hover(btnReporte, effectReporte);
		hover(btnOpciones, effectOpciones);
		hover(btnAyuda, effectAyuda);
		
		pMain = new JPanel();
		pMain.setBounds(191, 68, 714, 469);
		pMain.setBorder(null);
		pBody.add(pMain);
		pMain.setLayout(new CardLayout(0, 0));
		
		setLocationRelativeTo(this);
		
		
		
		new CambiaPanel(pMain, new pPrincipal() );
		
	}
	
	private void hover(RSButtonMetro btn, JPanel eff) {		
		btn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				eff.setBackground(new Color(172, 172, 172));				
			}
			
			public void mouseExited(MouseEvent e) {
				eff.setBackground(new Color(153, 153, 153));
			}
		});
	}
}
