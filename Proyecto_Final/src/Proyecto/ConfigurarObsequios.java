package Proyecto;

//import java.awt.BorderLayout;
//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JDialog implements ActionListener {
	private static final long serialVersionUID = 32705407359759148L;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    // 1. PRIMERO: Configuramos el estilo visual de Windows
	    try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (Throwable e) {
	        e.printStackTrace();
	    }

	    // 2. SEGUNDO: Abrimos la ventana
	    try {
	        ConfigurarObsequios dialog = new ConfigurarObsequios();
	        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	        dialog.setVisible(true);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setResizable(false);
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 165);
		getContentPane().setLayout(null);
		{
			lblObsequio1 = new JLabel("1 Unidad");
			lblObsequio1.setBounds(20, 31, 102, 13);
			getContentPane().add(lblObsequio1);
		}
		{
			lblObsequio2 = new JLabel("2 a 5 unidades");
			lblObsequio2.setBounds(20, 54, 102, 13);
			getContentPane().add(lblObsequio2);
		}
		{
			lblObsequio3 = new JLabel("6 a m\u00E1s unidades");
			lblObsequio3.setBounds(20, 77, 102, 13);
			getContentPane().add(lblObsequio3);
		}
		{
			txtObsequio1 = new JTextField();
			txtObsequio1.setBounds(147, 28, 96, 19);
			getContentPane().add(txtObsequio1);
			txtObsequio1.setColumns(10);
			txtObsequio1.setText(Menu_Principal.Obsequio1);
		}
		{
			txtObsequio2 = new JTextField();
			txtObsequio2.setBounds(147, 51, 96, 19);
			getContentPane().add(txtObsequio2);
			txtObsequio2.setColumns(10);
			txtObsequio2.setText(Menu_Principal.Obsequio2);
		}
		{
			txtObsequio3 = new JTextField();
			txtObsequio3.setBounds(147, 74, 96, 19);
			getContentPane().add(txtObsequio3);
			txtObsequio3.setColumns(10);
			txtObsequio3.setText(Menu_Principal.Obsequio3);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(341, 27, 85, 21);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(341, 50, 85, 21);
			getContentPane().add(btnCancelar);
		}
	}
	
	
	
	
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) 
	{
		
		// 1. Reemplazamos los valores de las variables globales en Menu_Principal
		
		Menu_Principal.Obsequio1 = txtObsequio1.getText();
		Menu_Principal.Obsequio2 = txtObsequio2.getText();
		Menu_Principal.Obsequio3 = txtObsequio3.getText();

		// 2. Cerramos la caja de diálogo
		dispose();
		
		
	}
}
