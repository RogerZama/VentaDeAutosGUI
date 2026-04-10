package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class DialogoAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	// PASO 1 Usamos nuestra clase personalizada aquí
	private final PanelDegradado contentPanel = new PanelDegradado();
	private JLabel lblTienda;
	private JButton btnCerrar;
	private JLabel lblAutor;
	private JLabel lblAño;
	private JLabel lblLimaPeru;
	private JLabel lblJenniffer;
	private JLabel lblBruce;
	private JLabel lblRuby;
	private JLabel lblMarlon;
	private JLabel lblJhonny;
	private JLabel lblGeraldine;
	private JLabel lblFoto;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DialogoAcercaDeTienda() {
		setResizable(false);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 500, 400);
		getContentPane().setLayout(new BorderLayout());
		
		// PASO 2 Importante: Hacer el panel transparente para que se vea el degradado
		contentPanel.setOpaque(false);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("VENTA DE AUTOS");
		lblTienda.setForeground(Color.WHITE); // Texto en blanco
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTienda.setBounds(162, 11, 199, 57);
		contentPanel.add(lblTienda);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(196, 317, 89, 23);
		contentPanel.add(btnCerrar);

		lblAutor = new JLabel("AUTORES:");
		lblAutor.setForeground(Color.WHITE);
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutor.setBounds(26, 54, 106, 44);
		contentPanel.add(lblAutor);

		lblAño = new JLabel("2026");
		lblAño.setForeground(Color.WHITE);
		lblAño.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAño.setBounds(320, 235, 40, 15);
		contentPanel.add(lblAño);

		lblLimaPeru = new JLabel("Lima, Perú");
		lblLimaPeru.setForeground(Color.WHITE);
		lblLimaPeru.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLimaPeru.setBounds(307, 261, 94, 15);
		contentPanel.add(lblLimaPeru);
		
		lblJenniffer = new JLabel("Jenniffer Mejía");
		lblJenniffer.setForeground(Color.WHITE);
		lblJenniffer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJenniffer.setBounds(26, 93, 137, 23);
		contentPanel.add(lblJenniffer);
		
		lblBruce = new JLabel("Bruce Oré");
		lblBruce.setForeground(Color.WHITE);
		lblBruce.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBruce.setBounds(26, 127, 80, 17);
		contentPanel.add(lblBruce);
		
		lblRuby = new JLabel("Ruby Fenco");
		lblRuby.setForeground(Color.WHITE);
		lblRuby.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRuby.setBounds(26, 154, 89, 17);
		contentPanel.add(lblRuby);
		
		lblMarlon = new JLabel("Marlon Lara");
		lblMarlon.setForeground(Color.WHITE);
		lblMarlon.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMarlon.setBounds(26, 181, 75, 23);
		contentPanel.add(lblMarlon);
		
		lblJhonny = new JLabel("Jhonny Yataco");
		lblJhonny.setForeground(Color.WHITE);
		lblJhonny.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJhonny.setBounds(26, 214, 94, 23);
		contentPanel.add(lblJhonny);
		
		lblGeraldine = new JLabel("Geraldine Alcocer");
		lblGeraldine.setForeground(Color.WHITE);
		lblGeraldine.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGeraldine.setBounds(27, 247, 136, 23);
		contentPanel.add(lblGeraldine);

		lblFoto = new JLabel("");
		lblFoto.setBounds(228, 54, 223, 222);
		contentPanel.add(lblFoto);
		
		// Cargar imagen
		ImageIcon imgIcono = new ImageIcon("img/img0.png");
		Image imgEscalada = imgIcono.getImage().getScaledInstance(225, 187, Image.SCALE_SMOOTH);
		lblFoto.setIcon(new ImageIcon(imgEscalada));
		
	}

	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

		
	// PASO 3 Clase para hacer el degradado
	class PanelDegradado extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			int width = getWidth();
			int height = getHeight();

			Color color1 = new Color(204, 153, 0); // Azul oscuro
			Color color2 = Color.BLACK;

			GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, width, height);
		}
	}
}