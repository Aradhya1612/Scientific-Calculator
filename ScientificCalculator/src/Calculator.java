import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {
	
	private JFrame frame;
	private JTextField textField;
	boolean num=false;  
	boolean dot=false;
	double first,second,result;
	String operation,answer,expression="";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 323, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(29, 0, 269, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 255, 0));
		textField.setBackground(Color.BLACK);
		textField.setBounds(10, 31, 288, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setForeground(Color.ORANGE);
		btnR.setBackground(Color.BLACK);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnR.setBounds(10, 139, 59, 38);
		frame.getContentPane().add(btnR);
		
		JButton btn1X = new JButton("1/X");
		btn1X.setForeground(Color.ORANGE);
		btn1X.setBackground(Color.BLACK);
		btn1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1X.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn1X.setBounds(10, 184, 59, 38);
		frame.getContentPane().add(btn1X);
		
		JButton btnXY = new JButton("X^Y");
		btnXY.setForeground(Color.ORANGE);
		btnXY.setBackground(Color.BLACK);
		btnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXY.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnXY.setBounds(10, 232, 59, 38);
		frame.getContentPane().add(btnXY);
		
		JButton btnX3 = new JButton("X^3");
		btnX3.setForeground(Color.ORANGE);
		btnX3.setBackground(Color.BLACK);
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX3.setBounds(10, 280, 59, 38);
		frame.getContentPane().add(btnX3);
		
		JButton btnX2 = new JButton("X^2");
		btnX2.setForeground(Color.ORANGE);
		btnX2.setBackground(Color.BLACK);
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX2.setBounds(10, 328, 59, 38);
		frame.getContentPane().add(btnX2);
		
		JButton btnN = new JButton("n!");
		btnN.setForeground(Color.ORANGE);
		btnN.setBackground(Color.BLACK);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);

			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnN.setBounds(10, 376, 59, 38);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setForeground(Color.ORANGE);
		btnPlusMinus.setBackground(Color.BLACK);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPlusMinus.setBounds(10, 424, 59, 38);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btneX = new JButton("e^X");
		btneX.setForeground(Color.ORANGE);
		btneX.setBackground(Color.BLACK);
		btneX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btneX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btneX.setBounds(68, 138, 59, 38);
		frame.getContentPane().add(btneX);
		
		JButton btnLog = new JButton("log");
		btnLog.setForeground(Color.ORANGE);
		btnLog.setBackground(Color.BLACK);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLog.setBounds(68, 184, 59, 38);
		frame.getContentPane().add(btnLog);
		
		JButton btnMod = new JButton("%");
		btnMod.setForeground(Color.ORANGE);
		btnMod.setBackground(Color.BLACK);
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnMod.setBounds(68, 232, 59, 38);
		frame.getContentPane().add(btnMod);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.ORANGE);
		btn7.setBackground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn7.setBounds(68, 280, 59, 38);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.ORANGE);
		btn4.setBackground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn4.setBounds(68, 328, 59, 38);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.ORANGE);
		btn1.setBackground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn1.setBounds(68, 376, 59, 38);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.ORANGE);
		btn0.setBackground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn0.setBounds(68, 424, 117, 38);
		frame.getContentPane().add(btn0);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setForeground(Color.ORANGE);
		btnSinh.setBackground(Color.BLACK);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSinh.setBounds(126, 184, 59, 38);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(Color.ORANGE);
		btnClear.setBackground(Color.BLACK);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnClear.setBounds(126, 232, 59, 38);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.ORANGE);
		btn8.setBackground(Color.BLACK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);

			}
		});
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn8.setBounds(126, 280, 59, 38);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.ORANGE);
		btn5.setBackground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);

			}
		});
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn5.setBounds(126, 328, 59, 38);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.ORANGE);
		btn2.setBackground(Color.BLACK);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);

			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn2.setBounds(126, 376, 59, 38);
		frame.getContentPane().add(btn2);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setForeground(Color.ORANGE);
		btnCosh.setBackground(Color.BLACK);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCosh.setBounds(184, 184, 59, 38);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setForeground(Color.ORANGE);
		btnBack.setBackground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btnBack.setBounds(184, 232, 59, 38);
		frame.getContentPane().add(btnBack);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.ORANGE);
		btn9.setBackground(Color.BLACK);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);

			}
		});
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn9.setBounds(184, 280, 59, 38);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.ORANGE);
		btn6.setBackground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);

			}
		});
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn6.setBounds(184, 328, 59, 38);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.ORANGE);
		btn3.setBackground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);

			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn3.setBounds(184, 376, 59, 38);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.ORANGE);
		btnDot.setBackground(Color.BLACK);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				if(s.charAt(s.length()-1)!= '.') 
				{
					if(num && dot==false) 
					{
						expression+=".";
						s += ".";
					}
					else if(num==false && dot ==false){
						expression+=",.";
						s += ".";
					}
				}
				num=true;
				dot=true;
				textField.setText(s);
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDot.setBounds(184, 424, 59, 38);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setForeground(Color.ORANGE);
		btnTan.setBackground(Color.BLACK);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTan.setBounds(242, 138, 56, 38);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setForeground(Color.ORANGE);
		btnTanh.setBackground(Color.BLACK);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(242, 184, 56, 38);
		frame.getContentPane().add(btnTanh);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(Color.ORANGE);
		btnAdd.setBackground(Color.BLACK);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBounds(242, 232, 56, 38);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.ORANGE);
		btnSub.setBackground(Color.BLACK);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSub.setBounds(242, 280, 56, 38);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setForeground(Color.ORANGE);
		btnMul.setBackground(Color.BLACK);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnMul.setBounds(242, 328, 56, 38);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setForeground(Color.ORANGE);
		btnDivide.setBackground(Color.BLACK);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDivide.setBounds(242, 376, 56, 38);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setForeground(Color.ORANGE);
		btnEqual.setBackground(Color.BLACK);
		btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    second = Double.parseDouble(textField.getText());
                    if (operation != null) {
                        if (operation.equals("+")) {
                            result = first + second;
                        } else if (operation.equals("-")) {
                            result = first - second;
                        } else if (operation.equals("*")) {
                            result = first * second;
                        } else if (operation.equals("/")) {
                            if (second == 0) {
                                textField.setText("Error: Division by zero");
                                return;
                            }
                            result = first / second;
                        }
                        // Handle other operations like "%", "X^Y", etc.

                        textField.setText(String.format("%.2f", result));
                        num = true;
                        operation = null;
                        dot = false;
                    }
                } catch (NumberFormatException ex) {
                    textField.setText("Error: Invalid input");
                }
            }
        });
		btnEqual.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnEqual.setBounds(242, 424, 56, 38);
		frame.getContentPane().add(btnEqual);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setForeground(Color.ORANGE);
		btnCos.setBackground(Color.BLACK);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCos.setBounds(184, 138, 59, 38);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setForeground(Color.ORANGE);
		btnSin.setBackground(Color.BLACK);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSin.setBounds(126, 138, 61, 38);
		frame.getContentPane().add(btnSin);
		
		rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setSelected(true);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnX2.setEnabled(true);
				btnX3.setEnabled(true);
				btnXY.setEnabled(true);
				btnMod.setEnabled(true);
				btnClear.setEnabled(true);
				btnBack.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btn1X.setEnabled(true);
				btnLog.setEnabled(true);
				btnR.setEnabled(true);
				btneX.setEnabled(true);
				btnEqual.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(98, 99, 60, 33);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnX2.setEnabled(false);
				btnX3.setEnabled(false);
				btnXY.setEnabled(false);
				btnMod.setEnabled(false);
				btnClear.setEnabled(false);
				btnBack.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btn1X.setEnabled(false);
				btnLog.setEnabled(false);
				btnR.setEnabled(false);
				btneX.setEnabled(false);
				btnEqual.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOff.setBounds(160, 99, 59, 33);
		frame.getContentPane().add(rdbtnOff);
	}
}
