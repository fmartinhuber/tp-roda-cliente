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
public class ClienteModificar extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblCUIT;
	private JTextField txtCUIT;
	private JTextField txtRazonSocial;
	private JButton btnVolver;
	private JButton btnModificarCliente;
	private JTextField txtMail;
	private JLabel lblMail;
	private JLabel lblRazonSocial;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ClienteModificar inst = new ClienteModificar();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ClienteModificar() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Modificar Cliente");
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
				lblRazonSocial = new JLabel();
				getContentPane().add(lblRazonSocial);
				lblRazonSocial.setText("Razon Social: ");
				lblRazonSocial.setBounds(12, 45, 150, 25);
			}
			{
				txtRazonSocial = new JTextField();
				getContentPane().add(txtRazonSocial);
				txtRazonSocial.setBounds(180, 45, 180, 25);
			}
			{
				lblMail = new JLabel();
				getContentPane().add(lblMail);
				lblMail.setText("Mail: ");
				lblMail.setBounds(12, 75, 150, 25);
			}
			{
				txtMail = new JTextField();
				getContentPane().add(txtMail);
				txtMail.setBounds(180, 75, 180, 25);
			}
			{
				btnModificarCliente = new JButton();
				getContentPane().add(btnModificarCliente);
				btnModificarCliente.setText("Modificar Cliente");
				btnModificarCliente.setBounds(12, 185, 150, 65);
				btnModificarCliente.addActionListener(new ActionListener() {
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
