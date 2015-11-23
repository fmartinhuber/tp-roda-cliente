package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
public class ClienteAdministracion extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnCrearCliente;
	private JButton btnVolver;
	private JButton btnModificarCliente;
	private JButton btnEliminarCliente;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ClienteAdministracion inst = new ClienteAdministracion();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	
	public ClienteAdministracion() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				btnCrearCliente = new JButton();
				getContentPane().add(btnCrearCliente);
				btnCrearCliente.setText("Crear Cliente");
				btnCrearCliente.setBounds(12, 12, 190, 50);
				btnCrearCliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ClienteCrear crear = new ClienteCrear();
						crear.setVisible(true);
					}
				});
			}
			{
				btnEliminarCliente = new JButton();
				getContentPane().add(btnEliminarCliente);
				btnEliminarCliente.setText("Eliminar Cliente");
				btnEliminarCliente.setBounds(12, 73, 190, 50);
				btnEliminarCliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ClienteEliminar eliminar = new ClienteEliminar();
						eliminar.setVisible(true);
					}
				});
			}
			{
				btnModificarCliente = new JButton();
				getContentPane().add(btnModificarCliente);
				btnModificarCliente.setText("Modificar Cliente");
				btnModificarCliente.setBounds(12, 134, 190, 50);
				btnModificarCliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ClienteModificar modificar = new ClienteModificar();
						modificar.setVisible(true);
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
			pack();
			setSize(400, 300);
			setTitle("Administración Cliente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
