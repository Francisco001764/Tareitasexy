package ids;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true); 
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());
		this.repaint();
	}
	
	public JPanel login()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();
		
		ImageIcon imagen2 = new ImageIcon("imagen1.jpg");
		JLabel imagen1 = new JLabel();
		imagen1.setBounds(0, 0, 800, 500);
		imagen1.setIcon(new ImageIcon((imagen2.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH))));
		mipanel.add(imagen1);
		

		//mipanel.setBackground(Color.decode("#48cae4"));
		mipanel.setOpaque(true);
		mipanel.setSize(800, 500);
		mipanel.setLocation(0, 0);
		imagen1.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(150, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		imagen1.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Ingrese su email: ");
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
		imagen1.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 160);
		email.setFont(fuente);
		imagen1.add(email);
		
		JLabel password_tag = new JLabel("Ingrese su contraseña: ");
		password_tag.setForeground(Color.WHITE);
		password_tag.setSize(250, 30);
		password_tag.setLocation(40, 210);
		password_tag.setFont(fuente);
		imagen1.add(password_tag);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(38, 240, 300, 30);
		password.setFont(fuente);
		imagen1.add(password);
		
		JCheckBox terms = new JCheckBox("Acepto los términos",false);
		terms.setForeground(Color.WHITE);
		terms.setSize(250, 30);
		terms.setLocation(40, 280); 
		imagen1.add(terms);
		
		JLabel forgot_tag = new JLabel("¿Olvidó su contraseña?");
		forgot_tag.setForeground(Color.WHITE);
		forgot_tag.setSize(250, 30);
		forgot_tag.setLocation(200, 310); 
		imagen1.add(forgot_tag);
		
		JButton access = new JButton("ACCEDER");
		access.setBounds(100, 350, 200, 50);
		access.setFont(fuente);
		access.setOpaque(true);
		access.setBackground(Color.red);
		imagen1.add(access);
		
		return mipanel;
	}

}