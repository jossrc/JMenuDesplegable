package paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class pMantenimiento extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTable tblSalida;
	private DefaultTableModel model;
	private JTextField txtCodigo;

	public pMantenimiento() {
		setLayout(null);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(26, 44, 42, 14);
		add(lblNombres);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(26, 82, 37, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(26, 117, 18, 14);
		add(lblDni);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(26, 142, 42, 14);
		add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(26, 176, 43, 14);
		add(lblDireccion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(83, 41, 180, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(83, 79, 180, 20);
		add(txtApellido);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(83, 114, 180, 20);
		add(txtDNI);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(83, 142, 180, 20);
		add(txtTelefono);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(83, 173, 180, 20);
		add(txtDireccion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 204, 547, 242);
		add(scrollPane);
		
		tblSalida = new JTable();
		model = new DefaultTableModel();
		tblSalida.setModel(model);
		model.addColumn("C\u00F3digo");
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("DNI");
		model.addColumn("Telefono");
		model.addColumn("Direccion");
		scrollPane.setViewportView(tblSalida);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(26, 11, 33, 14);
		add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("CLI00000001");
		txtCodigo.setEnabled(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(83, 8, 180, 20);
		add(txtCodigo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(579, 204, 110, 41);
		add(btnAgregar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(349, 7, 110, 41);
		add(btnLimpiar);
		
		JButton btnVerTodo = new JButton("Ver Todo");
		btnVerTodo.setBounds(349, 78, 110, 41);
		add(btnVerTodo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(579, 266, 110, 41);
		add(btnEditar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(579, 324, 110, 41);
		add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(579, 387, 110, 41);
		add(btnEliminar);

	}
}
