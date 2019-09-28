import java.awt.BorderLayout;

import java.awt.EventQueue;

import java.util.logging.Level;
import java.util.logging.Logger;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_5;
	private JPasswordField passwordField_1;
	Connection conn = null ;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void showuid()
	{
		try {
			String s = "select userid from useraccount where username = '"+textField_2.getText()+"' ; ";
			java.sql.PreparedStatement pst =co.prepareStatement(s);
			ResultSet  rs1 =  pst.executeQuery(s);
			while(rs1.next())
			{
				int a = rs1.getInt(1);
				JOptionPane.showMessageDialog(null, "Your User Id is = "+ a );
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	Connection co = null ;
	public signup() {
		co = login.dbconnector();
		conn = login.dbconnector();
		//this.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 81, 436, 557);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("USER ID");
		lblName.setBounds(40, 52, 96, 19);
		panel.add(lblName);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(40, 318, 79, 20);
		panel.add(lblAddress);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setBounds(40, 93, 146, 26);
		panel.add(textField);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(241, 51, 108, 20);
		panel.add(lblUserName);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 93, 146, 26);
		panel.add(textField_2);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(40, 233, 96, 20);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(40, 266, 146, 26);
		panel.add(passwordField_1);
		passwordField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmPassword.setBounds(241, 233, 178, 20);
		panel.add(lblConfirmPassword);
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 266, 146, 26);
		panel.add(passwordField);
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblTypeOfUser = new JLabel("PHONE NO");
		lblTypeOfUser.setBounds(178, 143, 136, 20);
		panel.add(lblTypeOfUser);
		lblTypeOfUser.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 176, 146, 26);
		panel.add(textField_5);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_5.setColumns(10);
		
		JButton btnAddRecord = new JButton("SIGN UP");
		btnAddRecord.setBackground(new Color(51, 255, 0));
		btnAddRecord.setForeground(new Color(255, 255, 255));
		btnAddRecord.setBounds(137, 416, 155, 29);
		panel.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Sitka Text", Font.BOLD, 16));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(51, 255, 0));
		btnReset.setBounds(40, 485, 115, 29);
		panel.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnExit = new JButton("BACK");
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(102, 255, 0));
		btnExit.setBounds(264, 485, 115, 29);
		panel.add(btnExit);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(50, 354, 361, 49);
		panel.add(textArea);
		
		JLabel lblAddNewUser = new JLabel("SIGN UP");
		lblAddNewUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewUser.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAddNewUser.setForeground(new Color(255, 255, 255));
		lblAddNewUser.setBounds(0, 17, 436, 51);
		contentPane.add(lblAddNewUser);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				loginform v=new loginform();
				v.setVisible(true);
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				//textField_1.setText("");
				textField_2.setText("");
				passwordField_1.setText("");
				//textField_4.setText("");
				textField_5.setText("");
				textArea.setText("");
				
			}
		});
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String p1= passwordField_1.getText();
					String p2=passwordField.getText();
					String p3= textField.getText();
					//String p4= textField_1.getText();
					String p5= textField_2.getText();
					//String p6= textField_4.getText();
					String p7= textField_5.getText();
					String s1 = textArea.getText();
					if(p1.contentEquals("") || p2.equals("") || p3.contentEquals("") ||p5.contentEquals("") || s1.contentEquals("") || p7.equals("")){
						JOptionPane.showMessageDialog(null, " please enter all the details");}
					else {
						boolean flag = true;
						String check="select username from useraccount";
						Statement st=conn.createStatement();
						ResultSet rs=st.executeQuery(check);
						while(rs.next()) {
							String n=rs.getString("username");
							//String n1=rs.getString("email_id");
							if(n.contentEquals(textField_2.getText())){
								flag=false;
								JOptionPane.showMessageDialog(null, " User Name alredy exists");
								textField_2.setText("");
								break;}
							/*if(n1.contentEquals(textField_4.getText())){
								flag=false;
								JOptionPane.showMessageDialog(null, "  Email_id alredy exists");
								textField_4.setText("");
								break;}*/
						}
						if(flag) {
							if(p1.contentEquals(p2)) {
								String s7 = textField.getText() ;
								String s2 = textField_2.getText() ;
								String s3 = passwordField_1.getText() ;
								String s4 = textField_5.getText() ;
								String s5 = textArea.getText() ;

								String sql = "INSERT INTO useraccount values('"+s7+"', '"+s2+"' , '"+s3+"' , '"+s4+"' , '"+s5+"')";
								PreparedStatement statement = conn.prepareStatement(sql);
								/*statement.setString(1,textField.getText() );
								statement.setString(2,textField_1.getText() );
								statement.setString(3,textField_2.getText());
								statement.setString(4, passwordField_1.getText());
								statement.setString(5, textField_5.getText());
								statement.setString(6, textField_4.getText());
								statement.executeUpdate();
								*/
								statement.executeUpdate();

								JOptionPane.showMessageDialog(null, " Record added Successfully");
								showuid();
								textField.setText("");
								//textField_1.setText("");
								textField_2.setText("");
								passwordField_1.setText("");
								//textField_4.setText("");
								textField_5.setText("");
								textArea.setText("");
								passwordField.setText("");

							}
							else {
								JOptionPane.showMessageDialog(null, " Password Mismatched");}
					}
					}

				}
				catch (SQLException ex) {
		            ex.printStackTrace();
		        }
				
			}
		});
	}
}
