import javax.swing.* ;
import java.awt.*;
import java.util.*; // For the random number generator
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {

	JTextField nameTextField, fNameTextField, emailTextField;
	JTextField cityTextField, stateTextField, pinTextField, addressTextField;

	public SignUpOne() {
		
		setLayout(null);

		Random ran = new Random(); // We create an object of type random
		int random = Math.abs(ran.nextInt(1000, 100000)); // Using the previous object, we create a value for our form

		JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		JLabel personDetails = new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personDetails.setBounds(290, 80, 400, 30);
		add(personDetails);

		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setBounds(300, 140, 400, 30);
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(nameTextField);

		JLabel fName = new JLabel("Father's Name:");
		fName.setFont(new Font("Raleway", Font.BOLD, 20));
		fName.setBounds(100, 190, 200, 30);
		add(fName);

		fNameTextField = new JTextField();
		fNameTextField.setBounds(300, 190, 400, 30);
		fNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(fNameTextField);

		JLabel dob = new JLabel("Date of Birth");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 200, 30);
		add(dateChooser);

		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		JLabel email = new JLabel("Email:");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);

		emailTextField = new JTextField();
		emailTextField.setBounds(300, 340, 400, 30);
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(emailTextField);

		JLabel maritalStatus = new JLabel("Marital Status:");
		maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		maritalStatus.setBounds(100, 390, 200, 30);
		add(maritalStatus);

		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);

		addressTextField = new JTextField();
		addressTextField.setBounds(300, 440, 400, 30);
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(addressTextField);

		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setBounds(300, 490, 400, 30);
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(cityTextField);

		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);

		stateTextField = new JTextField();
		stateTextField.setBounds(300, 540, 400, 30);
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(stateTextField);

		JLabel pinCode = new JLabel("PIN Code:");
		pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
		pinCode.setBounds(100, 590, 200, 30);
		add(pinCode);

		pinTextField = new JTextField();
		pinTextField.setBounds(300, 590, 400, 30);
		pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(pinTextField);

		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);


		setTitle("SIGNUP");
	}

	public static void main(String[] args) {
		new SignUpOne();
	}
}
