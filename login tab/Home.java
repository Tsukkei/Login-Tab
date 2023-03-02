package feb23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;

public class Home implements ActionListener  {

	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		JFrame frmHttpswwwfacebookcomhomephp = new JFrame();
		frmHttpswwwfacebookcomhomephp.setTitle("https://www.facebook.com/home.php");
		frmHttpswwwfacebookcomhomephp.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmHttpswwwfacebookcomhomephp.setSize(450, 390);
		frmHttpswwwfacebookcomhomephp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHttpswwwfacebookcomhomephp.getContentPane().add(panel);
		panel.setLayout(null);
		
		userlabel = new JLabel("Username:");
		userlabel.setBounds(10, 132, 80, 25);
		panel.add(userlabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 132, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 168, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 168, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(290, 146, 80, 25);
		button.addActionListener(new Home());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		JLabel lblNewLabel = new JLabel("FACEBOOK");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(41, 41, 206, 39);
		panel.add(lblNewLabel);
		
		frmHttpswwwfacebookcomhomephp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  String user = userText.getText();
		  String password = passwordText.getText(); 
		  
		  if(user.equals("Admin") && password.equals("password1")) {
			  success.setText("Welcome User!");
		  }
		  else if
		  (user.equals("Secretary") && password.equals("password2")) {
			  success.setText("Welcome User!");
		  }
		  else {
		  success.setText("Incorrect username and password");
		  }
	}
}
