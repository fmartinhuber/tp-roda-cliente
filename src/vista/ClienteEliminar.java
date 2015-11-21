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
public class ClienteEliminar extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblCUIT;
	private JTextField txtCUIT;
	private JButton btnEliminarCliente;
	private JButton btnVolver;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ClienteEliminar inst = new ClienteEliminar();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ClienteEliminar() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Eliminar Cliente");
			getContentPane().setLayout(null);
			{
				lblCUIT = new JLabel();
				getContentPane().add(lblCUIT);
				lblCUIT.setText("CUIT:");
				lblCUIT.setBounds(12, 15, 150, 25);
			}
			{
				txtCUIT = new JTextField();
				getContentPane().add(txtCUIT);
				txtCUIT.setBounds(180, 15, 180, 25);
			}
			{
				btnEliminarCliente = new JButton();
				getContentPane().add(btnEliminarCliente);
				btnEliminarCliente.setText("Eliminar Cliente");
				btnEliminarCliente.setBounds(12, 180, 150, 70);
				btnEliminarCliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//TODO: 
						System.out.println("Implementar logica");
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
