package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


import delegate.Delegado;
import dto.ClienteDto;


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
public class ClienteCrear extends javax.swing.JFrame {


	private static final long serialVersionUID = 1L;
	private JLabel lblRazonSocial;
	private JTextField txtRazonSocial;
	private JButton btnVolver;
	private JButton btnAceptar;
	private JTextField txtCUIT;
	private JLabel lblCUIT;
	private JTextField txtMail;
	private JLabel lblMail;
	
	private String auxCUIT, auxMail, auxRazonSocial;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ClienteCrear inst = new ClienteCrear();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ClienteCrear() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
			setTitle("Crear Cliente");
			getContentPane().setLayout(null);
			{
				lblRazonSocial = new JLabel();
				getContentPane().add(lblRazonSocial);
				lblRazonSocial.setText("Razón Social: ");
				lblRazonSocial.setBounds(12, 15, 140, 25);
			}
			{
				txtRazonSocial = new JTextField();
				getContentPane().add(txtRazonSocial);
				txtRazonSocial.setBounds(170, 15, 190, 25);
			}
			{
				lblMail = new JLabel();
				getContentPane().add(lblMail);
				lblMail.setText("Mail:");
				lblMail.setBounds(12, 45, 140, 25);
			}
			{
				txtMail = new JTextField();
				getContentPane().add(txtMail);
				txtMail.setBounds(170, 45, 190, 25);
			}
			{
				lblCUIT = new JLabel();
				getContentPane().add(lblCUIT);
				lblCUIT.setText("CUIT: ");
				lblCUIT.setBounds(12, 75, 140, 25);
			}
			{
				txtCUIT = new JTextField();
				getContentPane().add(txtCUIT);
				txtCUIT.setBounds(170, 75, 190, 25);
			}
			{
				btnAceptar = new JButton();
				getContentPane().add(btnAceptar);
				btnAceptar.setText("Crear Cliente");
				btnAceptar.setBounds(12, 185, 150, 65);
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//TODO: 
						
//						ClienteDto cliente = new ClienteDto();
//						cliente.setCUIT(lblCUIT.toString());
//						cliente.setMail(lblMail.toString());
//						cliente.setRazonSocial(lblRazonSocial.toString());
						
						auxCUIT = txtCUIT.getText();
						auxMail = txtMail.getText();
						auxRazonSocial = txtRazonSocial.getText();
						
						txtCUIT.setText("");
						txtMail.setText("");
						txtRazonSocial.setText("");
						
						ClienteDto cliente = new ClienteDto();
						cliente.setCUIT(auxCUIT);
						cliente.setMail(auxMail);
						cliente.setRazonSocial(auxRazonSocial);
						
						try{
							Delegado.getInstancia().crearCliente(cliente);
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Error al crear un Cliente");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
