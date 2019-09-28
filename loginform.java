import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class loginform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/*private void findaname()
	{
		try {
		String query = "Select name from log where userid = "+username.getText()+";";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		if(rs.next())
		{
		name = rs.getString(1);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return name ;
		
	}*/
	Connection conn = null ;
	public loginform() {
		conn = login.dbconnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1294, 775);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(180, 5, 1091, 123);
		panel.setBackground(new Color(102, 255, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 168, 718);
		panel_1.setBackground(new Color(102, 255, 0));
		panel.setLayout(null);
		contentPane.setLayout(null);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		contentPane.add(panel);
		
		JButton btnSignIn = new JButton("SIGN IN ");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(new Color(255, 255, 255));
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignIn.setBounds(909, 210, 115, 62);
		contentPane.add(btnSignIn);
		
		JButton btnNewButton = new JButton("SIGN UP ");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(1025, 210, 122, 62);
		contentPane.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(265, 173, 632, 507);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUserId = new JLabel("USER ID : ");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUserId.setBounds(35, 153, 193, 46);
		panel_2.add(lblUserId);
		
		JLabel lblPassword = new JLabel("PASSWORD : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(35, 231, 193, 46);
		panel_2.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(233, 153, 193, 46);
		panel_2.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(233, 234, 193, 46);
		panel_2.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="select * from useraccount where userid='"+textField.getText()+"'AND password1 ='"+passwordField.getText()+"';";
					Statement st=conn.createStatement();
					ResultSet rs = st.executeQuery(query);
					if(rs.next())
					{
						mainpage m1 = new mainpage();
						m1.setVisible(true);
						dispose();
					}
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
			
			}});
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(290, 314, 136, 46);
		panel_2.add(btnLogin);

}
}
