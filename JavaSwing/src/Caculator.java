import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caculator extends JFrame {
	String operandl = "";
	String operator = "";
	
	boolean isEqualsPress = false;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Caculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(550, 10, 90, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 38, 630, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(10, 10, 610, 40);
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 108, 630, 290);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 5, 5));
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnDiv);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if(cmd.equals("sqrt")) {
						value = Math.sqrt(value);
					}
					txtResult.setText("" + value);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnSqrt);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnMul);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if (cmd.equals("%")) {
						value = value * 0.01;
					}
					txtResult.setText("" + value);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnPlus);
		
		JButton btnFraction = new JButton("1/X");
		btnFraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if(cmd.equals("1/X")) {
						value = 1/value;
					}
					txtResult.setText("" + value);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnFraction.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnFraction);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					txtResult.setText("");
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		panel_1.add(btn0);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				String text = txtResult.getText();
				if(text.equals("")) {
					return;
				}
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnNewButton_15);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				operator = "";
				operandl = "";
				isEqualsPress = false;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnClear);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnSub);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("") || operandl.equals("")) {
					return;
				}
				
				try {
					double operand1 = Double.parseDouble(operandl);
					double operand2 = Double.parseDouble(txtResult.getText());
					double result = 0;
					if(operator.equals("+")) {
						result = operand1 + operand2;
					} else if(operator.equals("-")) {
						result = operand1 - operand2;
					} else if(operator.equals("*")) {
						result = operand1 * operand2;
					} else if(operator.equals("/")) {
						result = operand1 / operand2;
					}
					
					txtResult.setText("" + result);
					isEqualsPress = true;
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnEquals);
	}
}
