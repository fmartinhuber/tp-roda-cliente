package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import dto.ProveedorDto;


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
public class ProveedorCrear extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCUIT;
	private JLabel lblCUIT;
	private JTextField txtNombre;
	private JLabel lblNombre;
	private JButton btnVolver;
	private JButton btnCrear;
	
	private String auxCUIT, auxNombre;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ProveedorCrear inst = new ProveedorCrear();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ProveedorCrear() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Crear Proveedor");
			getContentPane().setLayout(null);
			{
				btnCrear = new JButton();
				getContentPane().add(btnCrear);
				btnCrear.setText("Crear Proveedor");
				btnCrear.setBounds(12, 185, 150, 65);
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {						
						//TODO 
						
						auxCUIT = txtCUIT.getText();
						auxNombre = txtNombre.getText();
						
						txtCUIT.setText("");
						txtNombre.setText("");
						
						ProveedorDto proveedor = new ProveedorDto();
						proveedor.setCUIT(auxCUIT);
						proveedor.setNombre(auxNombre);
						
						try{
							//Delegado.getInstancia().crearCliente(cliente);							
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Error al crear un Proveedor");
						}
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
			{
				lblNombre = new JLabel();
				getContentPane().add(lblNombre);
				lblNombre.setText("Nombre: ");
				lblNombre.setBounds(12, 15, 140, 25);
			}
			{
				txtNombre = new JTextField();
				getContentPane().add(txtNombre);
				txtNombre.setBounds(170, 15, 190, 25);
			}
			{
				lblCUIT = new JLabel();
				getContentPane().add(lblCUIT);
				lblCUIT.setText("CUIT:");
				lblCUIT.setBounds(12, 45, 140, 25);
			}
			{
				txtCUIT = new JTextField();
				getContentPane().add(txtCUIT);
				txtCUIT.setBounds(170, 45, 190, 25);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
