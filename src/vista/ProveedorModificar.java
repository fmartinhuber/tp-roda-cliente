package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class ProveedorModificar extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton btnVolver;
	private JButton btnModificarProveedor;
	private JTextField txtNombre;
	private JTextField txtCUIT;
	private JLabel lblNombre;
	private JLabel lblCUIT;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ProveedorModificar inst = new ProveedorModificar();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ProveedorModificar() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Modificar Proveedor");
			getContentPane().setLayout(null);
			{
				lblCUIT = new JLabel();
				getContentPane().add(lblCUIT);
				lblCUIT.setText("CUIT: ");
				lblCUIT.setBounds(12, 15, 150, 25);
			}
			{
				lblNombre = new JLabel();
				getContentPane().add(lblNombre);
				lblNombre.setText("Nombre: ");
				lblNombre.setBounds(12, 45, 150, 25);
			}
			{
				txtCUIT = new JTextField();
				getContentPane().add(txtCUIT);
				txtCUIT.setBounds(180, 15, 180, 25);
			}
			{
				txtNombre = new JTextField();
				getContentPane().add(txtNombre);
				txtNombre.setBounds(180, 45, 180, 25);
			}
			{
				btnModificarProveedor = new JButton();
				getContentPane().add(btnModificarProveedor);
				btnModificarProveedor.setText("Modificar Proveedor");
				btnModificarProveedor.setBounds(12, 185, 150, 65);
				btnModificarProveedor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("Implementar el modificar");
						//TODO add your code for btnModificarProveedor.actionPerformed
					}
				});
			}
			{
				btnVolver = new JButton();
				getContentPane().add(btnVolver);
				btnVolver.setText("Volver atrás");
				btnVolver.setBounds(223, 185, 150, 65);
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
