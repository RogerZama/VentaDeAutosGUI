package Proyecto;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;

public class DialogoListar extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane scp;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListar() {
		setResizable(false);
		setTitle("Listar");
		setBounds(100, 100, 466, 392);
		getContentPane().setLayout(null);

		scp = new JScrollPane();
		scp.setBounds(10, 11, 430, 294);
		getContentPane().add(scp);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scp.setViewportView(txtS);

		panel = new JPanel();
		panel.setBounds(128, 316, 188, 23);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(99, 0, 89, 23);
		panel.add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(0, 0, 89, 23);
		panel.add(btnListar);
		btnCerrar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		
		//1ra Marca de auto	
		txtS.setText("LISTADO DE AUTOS:" + "\n\n");
		txtS.append("Marca \t \t: " + Menu_Principal.marca0 + "\n");
		txtS.append("Modelo \t \t: " + Menu_Principal.modelo0 + "\n");
		txtS.append("Precio \t \t: " + Menu_Principal.precio0 + "\n");
		txtS.append("Torque \t \t: " + Menu_Principal.torque0 + "\n");
		txtS.append("Stock \t \t: " + Menu_Principal.stock0 + "\n");
		txtS.append("Garantia\t: " + Menu_Principal.garantia0 + "\n\n");
		
		//2da Marca de auto
		txtS.append("Marca \t \t: " + Menu_Principal.marca1 + "\n");
		txtS.append("Modelo \t \t: " + Menu_Principal.modelo1 + "\n");
		txtS.append("Precio \t \t: " + Menu_Principal.precio1 + "\n");
		txtS.append("Torque \t \t: " + Menu_Principal.torque1 + "\n");
		txtS.append("Stock \t \t: " + Menu_Principal.stock1 + "\n");
		txtS.append("Garantia\t: " + Menu_Principal.garantia1 + "\n\n");
		
		//3ra Marca de auto
		txtS.append("Marca \t \t: " + Menu_Principal.marca2 + "\n");
		txtS.append("Modelo \t \t: " + Menu_Principal.modelo2 + "\n");
		txtS.append("Precio \t \t: " + Menu_Principal.precio2 + "\n");
		txtS.append("Torque \t \t: " + Menu_Principal.torque2 + "\n");
		txtS.append("Stock \t \t: " + Menu_Principal.stock2 + "\n");
		txtS.append("Garantia\t: " + Menu_Principal.garantia2 + "\n\n");
		
		//4ta Marca de auto
		txtS.append("Marca \t \t: " + Menu_Principal.marca3 + "\n");
		txtS.append("Modelo \t \t: " + Menu_Principal.modelo3 + "\n");
		txtS.append("Precio \t \t: " + Menu_Principal.precio3 + "\n");
		txtS.append("Torque \t \t: " + Menu_Principal.torque3 + "\n");
		txtS.append("Stock \t \t: " + Menu_Principal.stock3 + "\n");
		txtS.append("Garantia\t: " + Menu_Principal.garantia3 + "\n\n");
		
		//5ta Marca de auto		
		txtS.append("Marca \t \t: " + Menu_Principal.marca4 + "\n");
		txtS.append("Modelo \t \t: " + Menu_Principal.modelo4 + "\n");
		txtS.append("Precio \t \t: " + Menu_Principal.precio4 + "\n");
		txtS.append("Torque \t \t: " + Menu_Principal.torque4 + "\n");
		txtS.append("Stock \t \t: " + Menu_Principal.stock4 + "\n");
		txtS.append("Garantia\t: " + Menu_Principal.garantia4 + "\n\n");
		
		txtS.setCaretPosition(0);
		
	
		
		
	}
}
