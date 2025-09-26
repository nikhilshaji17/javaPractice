import javax.swing.*; // This is for the JFrame class
import java.awt.*; // This is for the Image class
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

	JButton login, clear, signUp;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	public Login() {
	setTitle("AUTOMATED TELLER MACHINE");
	setLayout(null); // By Default, the layout is border, which we do not want. By setting it as NULL, we now have a custom layout.   
	setLocation(350, 200);

	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // This loads the icon. We do not have the icons on replit, check video if you need them
	Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // To scale the previously loaded image into icon size
	ImageIcon i3 = new ImageIcon(i2); // We cannot pass the i2 Image directly to our JLabel, so we convert it back to an icon.
	JLabel label = new JLabel(i3); // This is meant to render a single, non-interactive piece of content on our window, the icon in our case.
	label.setBounds(70, 10, 100, 100); // This places our icon on the window.
	add(label); // Adds the label to our window.

	JLabel text = new JLabel("Welcome to ATM");
	text.setFont(new Font("Osward", Font.BOLD, 38));
	text.setBounds(200, 40, 400, 40);
	add(text);

	JLabel cardNo = new JLabel("Card No:");
	cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
	cardNo.setBounds(120, 150, 150, 30);
	add(cardNo);

	cardTextField = new JTextField();
	cardTextField.setBounds(300, 150, 230, 30);
	cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
	add(cardTextField);

	JLabel pin = new JLabel("PIN:");
	pin.setFont(new Font("Raleway", Font.BOLD, 28));
	pin.setBounds(120, 220, 250, 30);
	add(pin);

	pinTextField = new JPasswordField();
	pinTextField.setBounds(300, 220, 230, 30);
	pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
	add(pinTextField);

	login = new JButton("SIGN IN");
	login.setBounds(300, 300, 100, 30);
	login.setBackground(Color.BLACK);
	login.setForeground(Color.WHITE);
	login.addActionListener(this);
	add(login);

	clear = new JButton("CLEAR");
	clear.setBounds(430, 300, 100, 30);
	clear.setBackground(Color.BLACK);
	clear.setForeground(Color.WHITE);
	clear.addActionListener(this);
	add(clear);

	signUp = new JButton("SIGN UP");
	signUp.setBounds(300, 350, 230, 30);
	signUp.setBackground(Color.BLACK);
	signUp.setForeground(Color.WHITE);
	signUp.addActionListener(this);
	add(signUp);

	getContentPane().setBackground(Color.WHITE);
	setSize(800, 480); // Size of our window
	setVisible(true); // By default, the window is invisible
	System.out.println("Frame initialized successfully");
  }

  public void actionPerformed(ActionEvent ae) {
	if (ae.getSource() == clear)
	{
		cardTextField.setText(null);
		pinTextField.setText(null);
	}
	else if (ae.getSource() == login)
	{

	}
	else if (ae.getSource() == signUp)
	{
		setVisible(false);
		new SignUpOne();
	}
  }
  
  public static void main(String args[]) {
	Login login = new Login();
  }
}