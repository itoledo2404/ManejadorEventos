import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Eventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventos frame = new Eventos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creo el manejador de eventos boton
		ManejoEventosBoton manejador = new ManejoEventosBoton();
		
		JButton btnBoton = new JButton("Boton1");
		btnBoton.setBounds(153, 108, 89, 23);
		contentPane.add(btnBoton);
		
		btnBoton.addActionListener(manejador);
		
			
		}
	//Clase interna para manejar los Eventos del Boton
	public class ManejoEventosBoton implements ActionListener{

		//Maneja el evonto del boton
		//@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showConfirmDialog(Eventos.this, String.format("Usted oprimio %s", e.getActionCommand()));
			
		}
		
	}
}
