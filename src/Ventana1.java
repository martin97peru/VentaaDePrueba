import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUsuario;
	public static JPasswordField pssContraseña;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */ 
	public Ventana1() {
		setTitle("Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(93, 79, 89, 14);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(226, 76, 155, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(93, 123, 89, 14);
		contentPane.add(lblPassword);
		
		pssContraseña = new JPasswordField();
		pssContraseña.setBounds(226, 120, 155, 20);
		contentPane.add(pssContraseña);
		
		final DatosUsuario data=new DatosUsuario();
		final Ventana2 window2 = new Ventana2();
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(data.probarPass()==1) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Hola", 1);
					window2.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Error, algo esta mal", "Wrong", 0);
				}
			}
		});
		btnEntrar.setBounds(93, 205, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(247, 205, 89, 23);
		contentPane.add(btnSalir);
	}
}
