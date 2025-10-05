import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;
import java.util.*; // For the random number generator
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{

	JTextField nameTextField, fNameTextField, emailTextField;
	JTextField cityTextField, stateTextField, pinTextField, addressTextField;
	JRadioButton male, female, single, married, other;
	JDateChooser dateChooser;
	JButton next;
	int random;

	public SignUpOne() {
		
		setLayout(null);

		Random ran = new Random(); // We create an object of type random
		random = Math.abs(ran.nextInt(1000, 100000)); // Using the previous object, we create a value for our form

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

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(getForeground());
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(getForeground());
		add(female);

		ButtonGroup genderGroup = new ButtonGroup(); // This class makes it so that by adding these buttons to the same group, only one can be selected at a time.
		genderGroup.add(male);
		genderGroup.add(female);

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

		single = new JRadioButton("Single");
		single.setBounds(300, 390, 100, 30);
		single.setBackground(getForeground());
		add(single);

		married = new JRadioButton("Married");
		married.setBounds(450, 390, 100, 30);
		married.setBackground(getForeground());
		add(married);

		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(getForeground());
		add(other);

		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(single);
		maritalGroup.add(married);
		maritalGroup.add(other);

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

		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);


		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
	}

	public void actionPerformed(ActionEvent ae) {
		String formno = "" + random;
		String name = nameTextField.getText();
		String fname = fNameTextField.getText();
		String email = emailTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		}
		else if (female.isSelected()) {
			gender = "Female";
		}

		String marital = null;
		if (single.isSelected()) {
			marital = "Single";
		} else if (married.isSelected()) {
			marital = "Married";
		} else if (other.isSelected()) {
			marital = "Other";
		}

		// The try catch block below is used to handle any error that occurs during runtime. 
		try {
			if (name.equals(""))
				JOptionPane.showMessageDialog(null, "Name is required"); // Display error messages for empty fields.
			else if (fname.equals(""))
				JOptionPane.showMessageDialog(null, "Father's name is required");
			else if (dob.equals(""))
				JOptionPane.showMessageDialog(null, "Date of birth is required");
			else if (gender == null)
				JOptionPane.showMessageDialog(null, "Gender is required");
			else if (email.equals(""))
				JOptionPane.showMessageDialog(null, "Email is required");
			else if (marital == null)
				JOptionPane.showMessageDialog(null, "Marital Status is required");
			else if (address.equals(""))
				JOptionPane.showMessageDialog(null, "Address is required");
			else if (city.equals(""))
				JOptionPane.showMessageDialog(null, "City is required");
			else if (state.equals(""))
				JOptionPane.showMessageDialog(null, "State is required");
			else if (pin.equals(""))
				JOptionPane.showMessageDialog(null, "PIN is required");
			else {
				Conn c = new Conn();
				String query = "insert into signup values ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
				c.s.executeUpdate(query);
				setVisible(false);
				new SignUpTwo(formno);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new SignUpOne();
	}
}
