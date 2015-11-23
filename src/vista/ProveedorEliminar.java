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
public class ProveedorEliminar extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton btnVolver;
	private JButton btnEliminar;
	private JTextField txtCUIT;
	private JLabel lblCUIT;
	
	private String auxCUIT;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ProveedorEliminar inst = new ProveedorEliminar();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ProveedorEliminar() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Eliminar Proveedor");
			getContentPane().setLayout(null);
			{
				lblCUIT = new JLabel();
				getContentPane().add(lblCUIT);
				lblCUIT.setText("CUIT: ");
				lblCUIT.setBounds(12, 15, 150, 25);
			}
			{
				txtCUIT = new JTextField();
				getContentPane().add(txtCUIT);
				txtCUIT.setBounds(180, 15, 180, 25);
			}
			{
				btnEliminar = new JButton();
				getContentPane().add(btnEliminar);
				btnEliminar.setText("Eliminar Proveedor");
				btnEliminar.setBounds(12, 180, 150, 70);
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {						
						//TODO add your code for btnEliminar.actionPerformed
						
						auxCUIT = txtCUIT.getText();						
						
						txtCUIT.setText("");						
						
						ProveedorDto proveedor = new ProveedorDto();
						proveedor.setCUIT(auxCUIT);
						
						try{
							//Delegado.getInstancia().crearCliente(cliente);							
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Error al eliminar un Proveedor");
						}
					}
				});
			}
			{
				btnVolver = new JButton();
				getContentPane().add(btnVolver);
				btnVolver.setText("Volver atrás");
				btnVolver.setBounds(192, 180, 150, 70);
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
