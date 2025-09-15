import javax.swing.*; // This is for the JFrame class
import java.awt.*; // This is for the Image class

public class Login extends JFrame {

  public Login() {
    setSize(800, 480); // Size of our window
    setVisible(true); // By default, the window is invisible
    setTitle("AUTOMATED TELLER MACHINE");
    setLayout(null); // By Default, the layout is border, which we do not want. By setting it as NULL, we now have a custom layout.
    getContentPane().setBackground(Color.WHITE);   

    // Below is code for adding an icon.
    
    // setLocation(350, 200); // Not required in replit
    // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon.png")); // This loads the icon. We do not have the icons on replit, check video if you need them
    // Image i2 = i1.getImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT); // To scale the previously loaded image into icon size
    // ImageIcon i3 = new ImageIcon(i2); // We cannot pass the i2 Image directly to our JLabel, so we convert it back to an icon.
    // JLabel label = new JLabel(i3); // This is meant to render a single, non-interactive piece of content on our window, the icon in our case.
    // label.setBounds(70, 10, 100, 100); // This places our icon on the window.
    // add(label); // Adds the label to our window.

    JLabel text = new JLabel("Welcome to ATM");
    text.setFont(new Font("Osward", Font.BOLD, 38));
    text.setBounds(200, 40, 400, 40);
    add(text);
    
    JLabel cardNo = new JLabel("Card No:");
    cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
    cardNo.setBounds(120, 150, 400, 40);
    add(cardNo);
    
    JLabel pin = new JLabel("PIN:");
    pin.setFont(new Font("Raleway", Font.BOLD, 28));
    pin.setBounds(120, 220, 400, 40);
    add(pin);
    System.out.println("Frame initialized successfully");
  }
  
  public static void main(String args[]) {
    Login login = new Login();
  }
}