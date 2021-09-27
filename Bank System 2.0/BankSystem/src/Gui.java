import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class Gui {

	Color frameColor = new Color(24, 15, 31);
	Data data = new Data(); 
	public Gui() {
		Frame frame2 = new Frame("Login");
		JLabel labelna = new JLabel("user name");
		JTextField username = new JTextField(30);
		JLabel labelpass = new JLabel("password");
		JTextField password = new JTextField(30);
		JButton button3 = new JButton("submit");
		JLabel signUpLabel = new JLabel("Don't have an account?");
		JButton sButton = new JButton("Sign up");
		ActionListener action2 = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// "log in button "
				String name = username.getText();
				String pw = password.getText();
				int id = 0;
				if (data.isAuthorized(name, pw)) {
					for (int i = 0; i < data.accounts.length; i++) {
						if (data.accounts[i] != null) {
							String username = data.accounts[i].getName();
							String password = data.accounts[i].getPassword();
							if (username.equals(name) && password.equals(pw)) {
								id = data.accounts[i].getID()-1;
							}
						} else {
							break;
						}
					} 
					if (data.accounts[id].isBlocked()) {
						infoMess("Your account is bloked \nplease pay your credit", "Error");
						try {
							String input = JOptionPane.showInputDialog(null, "Please enter amount");
							double money = Double.parseDouble(input);
							data.payCredit(id,money);
						} catch (NumberFormatException ex) {
							infoMess("Invalid entry!", "Error");
						}
					} else {
						Program1(id);
						data.creditMsg(id);
					}
					
				} else {
					infoMess("Invalid username or password", "Error");
				}
				
			}
		};
		// sign up
		ActionListener action3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame frame3 = new Frame("Sign Up");
				JLabel labelna = new JLabel("user name");
				JTextField username = new JTextField(30);
				JLabel labelpass = new JLabel("password");
				JTextField password = new JTextField(30);
				ImageIcon signUplogo = new ImageIcon("BankSystem/Images/logo.png");
				JLabel signUpIcon = new JLabel(signUplogo);
				JButton button4 = new JButton("sign up");
				String accountType [] = {"VIP", "Personal"};
				JComboBox types = new JComboBox(accountType); 
				types.setSelectedIndex(1);
				JLabel acTypes = new JLabel("choose account type:");

				ActionListener action4 = new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String name = username.getText();
						if (data.isExist(name)) {
							infoMess("Unavalible username", "Error");
						} else {
							String pw = password.getText();
							String type = (String) types.getSelectedItem();
							if(name.isBlank()  || pw.isBlank()  || type.isBlank() ){
								infoMess("Please fill all fields", "Error");
							}else if(name.length() < 3 ){
								infoMess("Please enter username at least 3 characters", "Error");
							}
							else if( pw.length() < 6 ){
								infoMess("Please enter password at least 6 characters", "Error");
							}
							else{
								
								data.createAcc(name,pw,type);
								frame3.dispose();
								if( type == "VIP" ){
									infoMess("Please pay VIP fees", "Message");
								}
								infoMess("Account created", "Done");
								
							}
							
						}
						// "sing up "
					}
				};

				signUpIcon.setBounds(60, 70, 350, 315);
				username.setBounds(31, 50, 150, 20);
				labelna.setBounds(30, 30, 80, 20);
				labelna.setForeground(Color.WHITE);
				password.setBounds(31, 100, 150, 20);
				labelpass.setBounds(30, 80, 80, 20);
				labelpass.setForeground(Color.WHITE);
				button4.addActionListener(action4);
				button4.setBounds(200, 50, 90, 20);
				types.setBounds(35, 155, 80, 20);
				
				acTypes.setBounds(30, 130, 150, 20);
				acTypes.setForeground(Color.white);


				frame3.setBounds(500, 100, 500, 500);
		        frame3.add(username);
				frame3.add(labelna);
				frame3.add(password);
				frame3.add(labelpass);
				frame3.add(button4);
				frame3.add(signUpIcon);
				frame3.add(types);
				frame3.add(acTypes);
				frame3.getContentPane().setBackground(frameColor);
				frame3.setLayout(null);
			}
		};

		ImageIcon loginlogo = new ImageIcon("BankSystem/Images/logo.png");
		JLabel loginIcon= new JLabel(loginlogo);
		loginIcon.setBounds(50, 60, 350, 315);
		frame2.add(loginIcon);
		
		username.setBounds(31, 50, 150, 20);
		labelna.setBounds(30, 30, 80, 20);
		labelna.setForeground(Color.white);
		password.setBounds(31, 100, 150, 20);
		labelpass.setBounds(30, 80, 80, 20);
		labelpass.setForeground(Color.white);
		button3.addActionListener(action2);
		button3.setBounds(200, 50, 90, 20);
		signUpLabel.setBounds(31, 150, 150, 18);
		signUpLabel.setForeground(Color.white);
		sButton.addActionListener(action3);
		sButton.setBounds(30, 170, 80, 20);
		
		frame2.setBounds(500, 100, 500, 500);
		frame2.getContentPane().setBackground(frameColor);
		frame2.setBackground(frameColor);
		frame2.add(labelna);
		frame2.add(username);
		frame2.add(labelpass);
		frame2.add(password);
		frame2.add(button3);
		frame2.add(signUpLabel);
		frame2.add(sButton);
		frame2.setLayout(null);
	}
    

	public void Program1(int id) {
		Frame frame = new Frame("acount page");
		ImageIcon logo = new ImageIcon("BankSystem/Images/logo.png");
		JLabel icon= new JLabel(logo);
		JLabel welcome = new JLabel("WELCOME " + data.accounts[id].getName().toUpperCase());
		JButton buttonPC = new JButton("pay CreditCard");
		JButton buttonSt = new JButton("status");
		JButton buttonDe = new JButton("deposit");
		JButton buttonIN = new JButton("INFO");
		JButton buttonTr = new JButton("transfer");
		JButton buttonEx = new JButton("Log out");
		JButton buttonWi = new JButton("withdraw");
		
		// pay credit
		ActionListener actionPC = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				try {
					String input = JOptionPane.showInputDialog(null, "Please enter amount");
					double money = Double.parseDouble(input);
					data.payCredit(id,money);
				} catch (NumberFormatException ex) {
					infoMess("Invalid entry!", "Error");
				}
				
				//  " pay credit card"
			}
		};
		// status
		ActionListener actionSt = new ActionListener() {
				
			
			public void actionPerformed(ActionEvent e) {
				Account acc = data.accounts[id];
				if (acc.getStatus()) {
					String msg = String.format("You owe the bank by %d$",(int) acc.getCredit());
					String exDate = String.format("\nYou should pay it before %s", acc.getExpirDate());
					infoMess(msg+exDate, "Status");
				} else {
					String msg = "You aren't indebt with the Bank";
					infoMess(msg, "Status");
				}
				//  depend on the backend " Status"
			}
		};
		// deposit
		ActionListener actionde = new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					try {
						String input = JOptionPane.showInputDialog(null, "Please enter deposit amount");
						double money = Double.parseDouble(input);
						data.deposit(id,money);
					} catch (NumberFormatException ex) {
						infoMess("Invalid entry!", "Error");
					}
					
					//  depend on the backend " deposit"
				}
			};
		// info
		ActionListener actionIN = new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				Account acc = data.accounts[id];
				String name = String.format("Name: %s\n", acc.getName());
				String accNo = String.format("Account number: %d\n", acc.getID());
				String accType = String.format("Account type: %s\n", acc.getType());
				String balance = String.format("Balance: %d$\n",(int) acc.getBalance());
				String credit = String.format("Credit: %d$\n",(int) acc.getCredit());
				String creditex = String.format("Credit expire on: %s\n", acc.getExpirDate());
				infoMess(name+accNo+accType+balance+credit+creditex, "info");

				//  depend on the backend "account information"
			}
		};
		// transfer
		ActionListener actionTr = new ActionListener() {		
			
			public void actionPerformed(ActionEvent e) {
				Frame frame2 = new Frame("transfer");
				JLabel lableAc = new JLabel("Enter account No:");
				JTextField no = new JTextField(30);
				JLabel lableMo = new JLabel("Enter the money:");
				JTextField moneytr = new JTextField(30);	
				JButton buttonTR = new JButton("transfer");
				
				ActionListener actionTR = new ActionListener() {

					
					public void actionPerformed(ActionEvent e) {
						try {
							int rId =Integer.parseInt(no.getText()) ;
							double money = Double.parseDouble(moneytr.getText());
							data.transfer(id, rId-1, money);
							frame2.dispose();
						} catch (NumberFormatException ex) {
							infoMess("Invalid entry!", "Error");
						}

					}
				};
				
				ImageIcon logotr = new ImageIcon("BankSystem/Images/logo.png");
				JLabel icontr = new JLabel(logotr);
				icontr.setBounds(50, 60, 350, 315);
				lableAc.setBounds(20, 360, 150, 20);
				lableAc.setForeground(Color.white);
				lableMo.setBounds(20, 400, 150, 20);
				lableMo.setForeground(Color.white);
				no.setBounds(190, 360, 80, 20);
				moneytr.setBounds(190, 400, 80, 20);
				buttonTR.setBounds(300, 360, 80, 20);
				buttonTR.addActionListener(actionTR);

				frame2.setBounds(500, 100, 500, 500);
				frame2.getContentPane().setBackground(frameColor);
				frame2.add(lableAc);
				frame2.add(no);
				frame2.add(lableMo);
				frame2.add(moneytr);
				frame2.add(buttonTR);
				frame2.add(icontr);
				frame2.setLayout(null);
			}
			};
        
		// withdrawal
		ActionListener actionWi = new ActionListener() {
				
			
			public void actionPerformed(ActionEvent e) {
					Frame frame1 = new Frame("Withdrawal");
					JLabel message = new JLabel("please, enter the amount");
					JTextField moneyF = new JTextField(30);
					JLabel choose = new JLabel("choose way for withdraw:");
					JButton buttonC = new JButton("continue");
					String ways [] = { "From balance", "From credit card"};
					JComboBox way = new JComboBox(ways);
					
					
					ActionListener actionC = new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							try {
								String input = moneyF.getText();
								double money = Double.parseDouble(input);
								String withdrawalMethod = (String) way.getSelectedItem();
								if (withdrawalMethod == "From credit card") {
									data.creditCard(id, money);
								} else {
									data.withdrawal(id, money);
								}
								frame1.dispose();
							} catch (NumberFormatException ex) {
								infoMess("Invalid entry!", "Error");
							}
							
							
						}
					};

					ImageIcon logowi = new ImageIcon("BankSystem/Images/logo.png");
					JLabel iconwi = new JLabel(logowi);
					iconwi.setBounds(50, 60, 350, 315);
					frame1.add(iconwi);
					buttonC.addActionListener(actionC);
					buttonC.setBounds(200, 400, 150, 20);
					moneyF.setBounds(35, 340, 100, 20);
					message.setBounds(30, 320, 150, 20);
					message.setForeground(Color.white);
					choose.setBounds(30, 380, 150, 20);
					choose.setForeground(Color.white);
					way.setBounds(30, 400, 150, 20);
					frame1.setBounds(500, 100, 500, 500);
					frame1.getContentPane().setBackground(frameColor);
					frame1.add(buttonC);
					frame1.add(moneyF);
					frame1.add(iconwi);
					frame1.add(message);
					frame1.add(choose);
					frame1.add(way);
					frame1.setLayout(null);
					
				}
			};
		// log out
		ActionListener actionEx = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		};	
	
			buttonPC.addActionListener(actionPC);
			buttonSt.addActionListener(actionSt);
			buttonDe.addActionListener(actionde);
			buttonIN.addActionListener(actionIN);
			buttonTr.addActionListener(actionTr);
			buttonEx.addActionListener(actionEx);
			buttonWi.addActionListener(actionWi);
			
			icon.setBounds(60, 70, 350, 315);
			welcome.setBounds(190, 20, 200, 20);
		    welcome.setForeground(Color.white);
		    buttonSt.setBounds(23, 100, 80, 20);
			buttonPC.setBounds(23, 275, 120, 20);
			buttonDe.setBounds(23, 185, 80, 20);
			buttonIN.setBounds(390, 100, 80, 20);
			buttonTr.setBounds(390, 180, 80, 20);
			buttonWi.setBounds(370, 270, 100, 20);
			buttonEx.setBounds(190, 370, 100, 20);			
			
			frame.setBounds(500, 100, 500, 500);
			frame.getContentPane().setBackground(frameColor);
			
			frame.add(welcome);
			frame.add(buttonPC);
			frame.add(buttonWi);
			frame.add(buttonDe);
			frame.add(buttonSt);
			frame.add(buttonTr);
			frame.add(buttonEx);
			frame.add(buttonIN);
			frame.add(icon);
			frame.setLayout(null);
	}

	public void infoMess(String message, String title){
        JOptionPane.showMessageDialog(null, message, title , JOptionPane.INFORMATION_MESSAGE);
    }
}
