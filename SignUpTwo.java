import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{

	JRadioButton yesSenior, noSenior, yesExisting, noExisting;
	JTextField panTextField, aadharTextField;
	JComboBox<String> religionBox;
	JComboBox<String> categoryBox;
	JComboBox<String> incomeBox;
	JComboBox<String> educationBox;
	JComboBox<String> occupationBox;
	JButton next;
	String formno;


	public SignUpTwo(String formno) {
		this.formno = formno;
		
		setLayout(null);
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);

		JLabel religion = new JLabel("Religion:");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);

		String[] valReligion = {"Hindu", "Muslim", "Christian", "Other"};
		religionBox = new JComboBox<String>(valReligion);
		religionBox.setBounds(300, 140, 400, 30);
		religionBox.setFont(new Font("Raleway", Font.BOLD, 14));
		religionBox.setBackground(getForeground());
		add(religionBox);

		JLabel category = new JLabel("Category:");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 200, 30);
		add(category);

		String[] valCategory = {"General", "OBC", "SC/ST", "Other"};
		categoryBox = new JComboBox<String>(valCategory);
		categoryBox.setBounds(300, 190, 400, 30);
		categoryBox.setFont(new Font("Raleway", Font.BOLD, 14));
		categoryBox.setBackground(getForeground());
		add(categoryBox);

		JLabel income = new JLabel("Income:");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);

		String[] incomeCategory = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", " >=5,00,000"};
		incomeBox = new JComboBox<String>(incomeCategory);
		incomeBox.setBounds(300, 240, 400, 30);
		incomeBox.setFont(new Font("Raleway", Font.BOLD, 14));
		incomeBox.setBackground(getForeground());
		add(incomeBox);

		JLabel education = new JLabel("Educational");
		education.setFont(new Font("Raleway", Font.BOLD, 20));
		education.setBounds(100, 290, 200, 30);
		add(education);

		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);

		String[] educationValues = {"Non-Graduation", "Graduate", "Post-Graduate", "Doctorate", "Others"};
		educationBox = new JComboBox<String>(educationValues);
		educationBox.setBounds(300, 315, 400, 30);
		educationBox.setFont(new Font("Raleway", Font.BOLD, 14));
		educationBox.setBackground(getForeground());
		add(educationBox);

		JLabel occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);

		String[] occupationValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
		occupationBox = new JComboBox<String>(occupationValues);
		occupationBox.setBounds(300, 390, 400, 30);
		occupationBox.setFont(new Font("Raleway", Font.BOLD, 14));
		occupationBox.setBackground(getForeground());
		add(occupationBox);

		JLabel panNum = new JLabel("PAN Number:");
		panNum.setFont(new Font("Raleway", Font.BOLD, 20));
		panNum.setBounds(100, 440, 200, 30);
		add(panNum);

		panTextField = new JTextField();
		panTextField.setBounds(300, 440, 400, 30);
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(panTextField);

		JLabel aadharNum = new JLabel("Aadhar Number:");
		aadharNum.setFont(new Font("Raleway", Font.BOLD, 20));
		aadharNum.setBounds(100, 490, 200, 30);
		add(aadharNum);

		aadharTextField = new JTextField();
		aadharTextField.setBounds(300, 490, 400, 30);
		aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(aadharTextField);

		JLabel seniorCitizen = new JLabel("Senior Citizen:");
		seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorCitizen.setBounds(100, 540, 200, 30);
		add(seniorCitizen);

		yesSenior = new JRadioButton("Yes");
		yesSenior.setBounds(300, 540, 60, 30);
		yesSenior.setBackground(getForeground());
		add(yesSenior);

		noSenior = new JRadioButton("No");
		noSenior.setBounds(450, 540, 120, 30);
		noSenior.setBackground(getForeground());
		add(noSenior);

		ButtonGroup seniorGroup = new ButtonGroup();
		seniorGroup.add(yesSenior);
		seniorGroup.add(noSenior);

		JLabel existingAccount = new JLabel("Existing Account:");
		existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
		existingAccount.setBounds(100, 590, 200, 30);
		add(existingAccount);

		yesExisting = new JRadioButton("Yes");
		yesExisting.setBounds(300, 590, 100, 30);
		yesExisting.setBackground(getForeground());
		add(yesExisting);

		noExisting = new JRadioButton("No");
		noExisting.setBounds(450, 590, 100, 30);
		noExisting.setBackground(getForeground());
		add(noExisting);

		ButtonGroup existingGroup = new ButtonGroup();
		existingGroup.add(yesExisting);
		existingGroup.add(noExisting);

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
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
	}

	public void actionPerformed(ActionEvent ae) {
		String religion = religionBox.getSelectedItem().toString();
		String category = categoryBox.getSelectedItem().toString();
		String income = incomeBox.getSelectedItem().toString();
		String education = educationBox.getSelectedItem().toString();
		String occupation = occupationBox.getSelectedItem().toString();
		String panNum = panTextField.getText();
		String aadharNum = aadharTextField.getText();
		
		String senior = null;
		if (yesSenior.isSelected()) {
			senior = "Yes";
		} else if (noSenior.isSelected()) {
			senior = "No";
		}

		String existing = null;
		if (yesExisting.isSelected()) {
			existing = "Single";
		} else if (noExisting.isSelected()) {
			existing = "Married";
		}

		try {
			Conn c = new Conn();
			String query = "insert into signuptwo values ('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+panNum+"', '"+aadharNum+"', '"+senior+"', '"+existing+"')";
			c.s.executeUpdate(query);
			setVisible(false);
			new SignUpThree(formno);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new SignUpTwo("");
	}
}
