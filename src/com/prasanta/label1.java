package com.prasanta;

import java.awt.*;
import java.applet.*;
import javax.swing.JPasswordField;
import java.sql.*;
import javax.swing.JOptionPane;


public class label1 extends Applet
{
	public void init()
	{
		setLayout(null);
		setBackground(new Color(168,168,213));
		setSize(569,524);
		add(textField1);
		textField1.setBackground(Color.white);
		textField1.setBounds(120,24,410,18);
		
		
		label1.setText("Name :");
		add(label1);
		label1.setFont(new Font("Dialog", Font.PLAIN, 11));
		label1.setBounds(80,12,36,38);
		add(textField2);
		textField2.setBackground(Color.white);
		textField2.setBounds(120,48,180,18);
		label2.setText("NRIC / Passport :");
		add(label2);
		label2.setFont(new Font("Dialog", Font.PLAIN, 11));
		label2.setBounds(32,48,87,21);
		add(textField3);
		textField3.setBackground(Color.white);
		textField3.setBounds(396,48,40,18);
		label3.setText("Age :");
		add(label3);
		label3.setFont(new Font("Dialog", Font.PLAIN, 11));
		label3.setBounds(360,46,32,20);
		add(textField4);
		textField4.setBackground(Color.white);
		textField4.setBounds(120,72,180,18);
		label4.setText("Occupation :");
		add(label4);
		label4.setFont(new Font("Dialog", Font.PLAIN, 11));
		label4.setBounds(52,72,70,18);
		label5.setText("Postal Address");
		add(label5);
		label5.setFont(new Font("Dialog", Font.ITALIC, 12));
		label5.setBounds(24,96,96,24);
		add(textField5);
		textField5.setBackground(Color.white);
		textField5.setBounds(120,120,410,18);
		label6.setText("Address 1 :");
		add(label6);
		label6.setFont(new Font("Dialog", Font.PLAIN, 11));
		label6.setBounds(54,120,63,21);
		add(textField6);
		textField6.setBackground(Color.white);
		textField6.setBounds(120,144,410,18);
		label7.setText("Address 2 :");
		add(label7);
		label7.setFont(new Font("Dialog", Font.PLAIN, 11));
		label7.setBounds(54,144,63,21);
		add(textField7);
		textField7.setBackground(Color.white);
		textField7.setBounds(120,168,180,18);
		add(textField8);
		textField8.setBackground(Color.white);
		textField8.setBounds(120,192,180,18);
		add(textField9);
		textField9.setBackground(Color.white);
		textField9.setBounds(120,216,180,18);
		label8.setText("Postcode :");
		add(label8);
		label8.setFont(new Font("Dialog", Font.PLAIN, 11));
		label8.setBounds(60,168,52,21);
		label9.setText("City  :");
		add(label9);
		label9.setFont(new Font("Dialog", Font.PLAIN, 11));
		label9.setBounds(84,192,36,19);
		label10.setText("State :");
		add(label10);
		label10.setFont(new Font("Dialog", Font.PLAIN, 11));
		label10.setBounds(80,216,33,19);
		list1.add("Afganistan");
		list1.add("Albania");
		list1.add("Algeria");
		list1.add("American Samoa");
		list1.add("Andorra");
		list1.add("Angola");
		list1.add("Anguilla");
		list1.add("Antartica");
		list1.add("Antigua and Barbuda");
		list1.add("Arctic Ocean");
		list1.add("Argentina");
		list1.add("Armenia");
		list1.add("Aruba");
		list1.add("Ashmore and Cartier Islands");
		list1.add("Atlantic Ocean");
		list1.add("Australia");
		list1.add("Austria");
		list1.add("Azerbaijan");
		list1.add("Bahamas, The");
		list1.add("Bahrain");
		list1.add("Baker Island");
		list1.add("Bangladesh");
		list1.add("Barbados");
		list1.add("Bassas da India");
		list1.add("Belarus");
		list1.add("Belgium");
		list1.add("Belize");
		list1.add("Benin");
		list1.add("Bermuda");
		list1.add("Bhutan");
		list1.add("Bolivia");
		list1.add("Bosnia and Herzegovina");
		list1.add("Botswana");
		list1.add("Bouvet Island");
		list1.add("Brazil");
		list1.add("British Indian Ocean Trritory ");
		list1.add("British Virgin Islands");
		list1.add("Brunei");
		list1.add("Bulgaria");
		list1.add("Burkina Faso");
		list1.add("Burma");
		list1.add("Bunundi");
		list1.add("Cambodia");
		list1.add("Cameroon");
		list1.add("Canada");
		list1.add("Cape verde");
		list1.add("Cayman Islands");
		list1.add("Central African Republic");
		list1.add("Chad");
		list1.add("Chile");
		list1.add("China");
		list1.add("Christmas Island");
		list1.add("Clipperton Island");
		list1.add("Coco (Keeling) Islands");
		list1.add("Colombia");
		list1.add("Comoros");
		list1.add("Congo, Deomocratic Replublic of the ");
		list1.add("Congo, Republic of the");
		list1.add("Cook Islands");
		list1.add("Coral Sea Islands");
		list1.add("Costa Rica");
		list1.add("Cote d'Ivoire");
		list1.add("Croatia");
		list1.add("Cuba");
		list1.add("Cyprus");
		list1.add("Czech Republic");
		list1.add("Denmark");
		list1.add("Djibouti");
		list1.add("Dominica");
		list1.add("Dominican Republic");
		list1.add("Ecuador");
		list1.add("Egypt");
		list1.add("El Salvador");
		list1.add("Equatorial Guinea");
		list1.add("Eritrea");
		list1.add("Estonia");
		list1.add("Ethiopia");
		list1.add("Europa Island");
		list1.add("Falkland Islands");
		list1.add("Faroe Islands");
		list1.add("Fiji");
		list1.add("Finland");
		list1.add("France");
		list1.add("French Guina");
		list1.add("French Polynesia");
		list1.add("French Southern and Antarctic Lands ");
		list1.add("Gabon");
		list1.add("Gambia, The");
		list1.add("Gaza Strip");
		list1.add("Georgia");
		list1.add("Germany");
		list1.add("Ghana");
		list1.add("Gibraltar");
		list1.add("Glorioso Islands");
		list1.add("Greece");
		list1.add("Greenland");
		list1.add("Grenada");
		list1.add("Guadeloupe");
		list1.add("Guam");
		list1.add("Guatemala");
		list1.add("Guemsey");
		list1.add("Guinea");
		list1.add("Guinea-Bissau");
		list1.add("Guyana");
		list1.add("Haiti");
		list1.add("Heard Island and McDonald Islnads");
		list1.add("Holy See (Vatican City)");
		list1.add("Honduras");
		list1.add("Hong Kong");
		list1.add("Howland Island");
		list1.add("Hungary");
		list1.add("Iceland");
		list1.add("India");
		list1.add("Indonesia");
		list1.add("Iran");
		list1.add("Iraq");
		list1.add("Ireland");
		list1.add("Israel");
		list1.add("Italy");
		list1.add("Jamaica");
		list1.add("Jan Mayen");
		list1.add("Japan");
		list1.add("Jarvis island");
		list1.add("Jersey");
		list1.add("Johmston Attol");
		list1.add("Jordan");
		list1.add("Juan de Nova Island");
		list1.add("Kazakhstan");
		list1.add("Kenya");
		list1.add("Kingman Reef");
		list1.add("Kiribati");
		list1.add("Korea, North");
		list1.add("Korea, South");
		list1.add("Kuwait");
		list1.add("Kyrgystan");
		list1.add("Laos");
		list1.add("Latvia");
		list1.add("Lebanon");
		list1.add("Lesotho");
		list1.add("Liberia");
		list1.add("Libya");
		list1.add("Liechtenstein");
		list1.add("Lithuania");
		list1.add("Luxembourg");
		list1.add("Macau");
		list1.add("Macedonia");
		list1.add("Madagascar");
		list1.add("Malawi");
		list1.add("Malaysia");
		list1.add("Maldives");	
		list1.add("Mali");
		list1.add("Malta");
		list1.add("Marshall Islands");
		list1.add("Martinique");
		list1.add("Mauritius");
		list1.add("Mayotte");
		list1.add("Mexico");
		list1.add("Micronesia");
		list1.add("Midway Islands");
		list1.add("Moldova");
		list1.add("Monaco");
		list1.add("Mongolia");	
		list1.add("Montserrat");
		list1.add("Morocco");
		list1.add("Mozambique");
		list1.add("Nambia");
		list1.add("Nauru");
		list1.add("Navassa Island");
		list1.add("Nepal");
		list1.add("Netherlands");
		list1.add("New Caledonia");
		list1.add("New Zealand");
		list1.add("Nicaragua");
		list1.add("Niger");
		list1.add("Nigeria");
		list1.add("Niue");
		list1.add("Norway");
		list1.add("Oman");
		list1.add("Pakistan");
		list1.add("Palau");
		list1.add("Panama");
		list1.add("Papua New Guinea");
		list1.add("Paraguay");
		list1.add("Peru");
		list1.add("Philippines");
		list1.add("Poland");
		list1.add("Portugal");
		list1.add("Puerto Reco");
		list1.add("Qatar");
		list1.add("Reunion");
		list1.add("Romania");
		list1.add("Rwanda");
		list1.add("Saudi Arabia");
		list1.add("Senegal");
		list1.add("Serbia and Montenegro");
		list1.add("Seychelles");
		list1.add("Sierra Leone");
		list1.add("Singapore");
		list1.add("Slovakia");
		list1.add("Slovenia");
		list1.add("Solomon Islands");
		list1.add("Somalia");
		list1.add("South Africa");
		list1.add("Spain");
		list1.add("Sril Lanka");
		list1.add("Sudan");
		list1.add("Suriname");
		list1.add("Svalbard");
		list1.add("Swaziland");
		list1.add("Sweden");
		list1.add("Switzerland");
		list1.add("Syria");
		list1.add("Tajikistan");
		list1.add("Tanzania");
		list1.add("Thiland");
		list1.add("Tongo");
		list1.add("Trinidad and Tobago");
		list1.add("Tunisia");
		list1.add("Turkey");
		list1.add("Turkmenistan");
		list1.add("Uganda");
		list1.add("Ukrain");
		list1.add("United Arab Emirates");
		list1.add("United Kingdom");
		list1.add("United States");
		list1.add("Uruguay");
		list1.add("Uzbekistan");
		list1.add("Venuatu");
		list1.add("Venezuela");
		list1.add("Vietnam");
		list1.add("Virgin Islands");
		list1.add("Wake Island");
		list1.add("Wallis and Futuna");
		list1.add("West Bank");
		list1.add("Yemen");
		list1.add("Zaire");
		list1.add("Zambia");
		list1.add("Zimbabwe");




		list1.setFont(new Font("Dialog", Font.PLAIN, 11));
		add(list1);
		list1.setBounds(384,168,148,66);
		label11.setText("Country :");
		add(label11);
		label11.setFont(new Font("Dialog", Font.PLAIN, 11));
		label11.setBounds(330,168,44,24);
		label12.setText("Contact ");
		add(label12);
		label12.setFont(new Font("Dialog", Font.ITALIC, 12));
		label12.setBounds(36,252,60,24);
		add(textField10);
		textField10.setBackground(Color.white);
		textField10.setBounds(120,276,180,18);
		label13.setText("Telephone :");
		add(label13);
		label13.setFont(new Font("Dialog", Font.PLAIN, 11));
		label13.setBounds(54,276,60,20);
		label14.setText("Email :");
		add(label14);
		label14.setFont(new Font("Dialog", Font.PLAIN, 11));
		label14.setBounds(81,300,33,21);
		label15.setText("User Login");
		add(label15);
		label15.setFont(new Font("Dialog", Font.ITALIC, 12));
		label15.setBounds(36,336,96,24);
		add(textField12);
		textField12.setBackground(Color.white);
		textField12.setBounds(120,360,180,22);
		label16.setText("User ID :");
		add(label16);
		label16.setFont(new Font("Dialog", Font.PLAIN, 11));
		label16.setBounds(70,360,45,24);
		label17.setText("Password :");
		add(label17);
		label17.setFont(new Font("Dialog", Font.PLAIN, 11));
		label17.setBounds(318,360,56,24);
		label18.setText("Reenter Password :");
		add(label18);
		label18.setFont(new Font("Dialog", Font.PLAIN, 11));
		label18.setBounds(278,396,98,20);
		add(JPasswordField1);
		JPasswordField1.setBounds(380,360,150,22);
		add(JPasswordField2);
		JPasswordField2.setBounds(380,394,150,22);
		button1.setLabel("Submit");
		add(button1);
		button1.setBackground(Color.lightGray);
		button1.setBounds(120,432,91,37);
		button2.setLabel("Reset");
		add(button2);
		button2.setBackground(Color.lightGray);
		button2.setBounds(432,432,91,37);
		add(textField11);
		textField11.setBackground(Color.white);
		textField11.setBounds(120,300,410,18);
		add(label19);
		label19.setFont(new Font("Dialog", Font.BOLD, 16));
		label19.setForeground(new Color(213,110,213));
		label19.setBounds(84,500,400,20);

				
		
		//{{REGISTER LISTENERS
		SymAction lSymAction = new SymAction();
		button1.addActionListener(lSymAction);
		button2.addActionListener(lSymAction);
		//}}

	}
	
	TextField textField1 = new TextField();
	Button button1 = new Button();
	JPasswordField JPasswordField1 = new JPasswordField();
	JPasswordField JPasswordField2 = new JPasswordField();
	Label label1 = new Label();
	TextField textField2 = new TextField();
	Label label2 = new Label();
	TextField textField3 = new TextField();
	Label label3 = new Label();
	TextField textField4 = new TextField();
	Label label4 = new Label();
	Label label5 = new Label();
	TextField textField5 = new TextField();
	Label label6 = new Label();
	TextField textField6 = new TextField();
	Label label7 = new Label();
	TextField textField7 = new TextField();
	TextField textField8 = new TextField();
	TextField textField9 = new TextField();
	Label label8 = new Label();
	Label label9 = new Label();
	Label label10 = new Label();
	List list1 = new List(4);
	Label label11 = new Label();
	Label label12 = new Label();
	TextField textField10 = new TextField();
	Label label13 = new Label();
	Label label14 = new Label();
	Label label15 = new Label();
	Label label16 = new Label();
	Label label17 = new Label();
	Label label18 = new Label();
	Button button2 = new Button();
	TextField textField11 = new TextField();
	TextField textField12 = new TextField();
	Label label19 = new Label();
	

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if(object==button1)
				button1_ActionPerformed(event);
			else
				button2_ActionPerformed(event);
		}
	}
	void button1_ActionPerformed(java.awt.event.ActionEvent event)
	{	
		

	try {
		Class.forName("com.ms.jdbc.odbc.JdbcOdbcDriver");
		String url = "jdbc:odbc:Register";
		Connection con = DriverManager.getConnection(url);
		Statement stmt = con.createStatement();

		String pswd1= (JPasswordField1.getText() );
		String pswd2= (JPasswordField2.getText() );
		
		if( list1.getSelectedItem()==null)
		{
			JOptionPane.showMessageDialog( null, "Select a country from the list " );		
		}
		else if( pswd1.equalsIgnoreCase(pswd2) )
		{
			String customerSQL = "INSERT INTO Register VALUES ('" + textField1.getText() + "' , '" + textField2.getText()+ "', '" +textField3.getText() + "' , '" + textField4.getText()+ "' , '" + textField5.getText()+ "', '" + textField6.getText()+ "' , '" + textField7.getText()+ "' , '" + textField8.getText()+ "' , '" + textField9.getText()+ "', '"+ list1.getSelectedItem()+ "' , '" + textField10.getText()+ "' , '" + textField11.getText()+ "' , '" + textField12.getText()+ "', '" +JPasswordField1.getText()+ "'  )";
			stmt.executeUpdate(customerSQL);
			label19.setText("Registration Successful");
		}
		else {
			JOptionPane.showMessageDialog( null, " You Have Entered Two Different Passwords!" );
		}


		stmt.close();
		con.close();
	    }

		catch (ClassNotFoundException e) {
		label19.setText("ClassException: " + e.getMessage());
		}

		catch(SQLException e) 
		{
		JOptionPane.showMessageDialog( null, " Error ! : Data in some text fields are not acceptable " );
		
		}
	
	}

	void button2_ActionPerformed(java.awt.event.ActionEvent event)
	{	
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		textField4.setText("");
		textField5.setText("");
		textField6.setText("");
		textField7.setText("");
		textField8.setText("");
		textField9.setText("");
		textField10.setText("");
		textField11.setText("");
		textField12.setText("");
		label19.setText("");
		JPasswordField1.setText("");
		JPasswordField2.setText("");
		int selIndex = list1.getSelectedIndex();
		list1.deselect(selIndex);
		
	}



}