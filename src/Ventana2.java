import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSalario;
	private ButtonGroup botones=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(55, 37, 112, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 34, 243, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(55, 85, 46, 14);
		contentPane.add(lblEdad);
		
		JComboBox comboBoxEdad = new JComboBox();
		comboBoxEdad.setModel(new DefaultComboBoxModel(new String[] {"15-25", "26-35", "36-45", "46-55", "+55"}));
		comboBoxEdad.setBounds(134, 82, 57, 20);
		contentPane.add(comboBoxEdad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(55, 135, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(134, 131, 70, 23);
		contentPane.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(245, 131, 70, 23);
		contentPane.add(rdbtnMujer);
		
		botones.add(rdbtnHombre);
		botones.add(rdbtnMujer);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(55, 186, 46, 14);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(134, 183, 115, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensaje;
				String sex;
				if(rdbtnHombre.isSelected()) {
					sex="Hombre";
				}else {
					if(rdbtnMujer.isSelected()) {
						sex="Mujer";
					}else {
						sex="Forro";
					}
				}
				mensaje=txtNombre.getText()+", tiene una de edad de entre "+comboBoxEdad.getSelectedItem()+
						", es de sexo "+sex+" y gana "+txtSalario.getText();
				System.out.println(mensaje);
			}
		});
		btnNewButton.setBounds(288, 182, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(288, 216, 89, 23);
		contentPane.add(btnSalir);
	}
}
