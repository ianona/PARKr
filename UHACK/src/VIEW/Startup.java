package VIEW;

import java.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javafx.scene.paint.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Startup 
{	
	private static JTextField textField;
	private static JPasswordField passwordField;
	public static void main(String[] args)
	{
		String type = "yo";
		
		JFrame mF = new JFrame("QUICKr");
		
		
		mF.setSize(250, 525);
		mF.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type.equals(textField.getText());
				if(type.equals("admin"))
				{
					//Business.main(args);
				}
				else
				{
					//Client.main(args);
				}
			}
		});
		btnLogin.setBounds(62, 274, 117, 29);
		mF.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(62, 409, 117, 29);
		mF.getContentPane().add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(101, 195, 130, 26);
		mF.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 222, 130, 26);
		mF.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JLabel bgimage = new JLabel("");
		bgimage.setIcon(new ImageIcon(Startup.class.getResource("/RESOURCES/Signin.jpg")));
		bgimage.setBounds(0, -17, 262, 550);
		mF.getContentPane().add(bgimage);
		
		mF.setVisible(true);
		
		mF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
