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
public class Menu extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnAdministracionCliente;
	private JButton btnSalir;
	private JButton btnAdministracionProveedores;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Menu inst = new Menu();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Menu() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				btnAdministracionCliente = new JButton();
				getContentPane().add(btnAdministracionCliente);
				btnAdministracionCliente.setText("Administración Cliente");
				btnAdministracionCliente.setBounds(12, 12, 250, 40);
				btnAdministracionCliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ClienteAdministracion ca = new ClienteAdministracion();
						ca.setVisible(true);
					}
				});
			}
			{
				btnAdministracionProveedores = new JButton();
				getContentPane().add(btnAdministracionProveedores);
				btnAdministracionProveedores.setText("Administración Proveedor");
				btnAdministracionProveedores.setBounds(12, 63, 250, 40);
				btnAdministracionProveedores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						ProveedorAdministracion pa = new ProveedorAdministracion();
						pa.setVisible(true);
					}
				});
			}
			{
				btnSalir = new JButton();
				getContentPane().add(btnSalir);
				btnSalir.setText("Salir de la Aplicación");
				btnSalir.setBounds(294, 210, 179, 40);
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.exit(0);
					}
				});
			}
			pack();
			setSize(500, 300);
			setTitle("Menú Principal - Sistema Rodamientos");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
