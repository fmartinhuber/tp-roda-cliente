package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ProveedorAdministracion extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnVolver;
	private JButton btnEliminarProveedor;
	private JButton btnModificarProveedor;
	private JButton btnCrearProveedor;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ProveedorAdministracion inst = new ProveedorAdministracion();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ProveedorAdministracion() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Administración Proveedor");
			getContentPane().setLayout(null);
			{
				btnCrearProveedor = new JButton();
				getContentPane().add(btnCrearProveedor);
				btnCrearProveedor.setText("Crear Proveedor");
				btnCrearProveedor.setBounds(12, 12, 190, 50);
				btnCrearProveedor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ProveedorCrear pc = new ProveedorCrear();
						pc.setVisible(true);
					}
				});
			}
			{
				btnModificarProveedor = new JButton();
				getContentPane().add(btnModificarProveedor);
				btnModificarProveedor.setText("Modificar Proveedor");
				btnModificarProveedor.setBounds(12, 134, 190, 50);
				btnModificarProveedor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ProveedorModificar pm = new ProveedorModificar();
						pm.setVisible(true);
					}
				});
			}
			{
				btnEliminarProveedor = new JButton();
				getContentPane().add(btnEliminarProveedor);
				btnEliminarProveedor.setText("Eliminar Proveedor");
				btnEliminarProveedor.setBounds(12, 73, 190, 50);
				btnEliminarProveedor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ProveedorEliminar pe = new ProveedorEliminar();
						pe.setVisible(true);
					}
				});
			}
			{
				btnVolver = new JButton();
				getContentPane().add(btnVolver);
				btnVolver.setText("Volver al Menú Principal");
				btnVolver.setBounds(152, 200, 221, 50);
				btnVolver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						dispose();
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
