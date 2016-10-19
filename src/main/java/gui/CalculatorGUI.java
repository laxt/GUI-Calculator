
package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import otherclasses.Calculator;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CalculatorGUI {

	private JFrame frmSimpleCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtResult;
	private Calculator calculator=new Calculator();
	private NumberFormat df = new DecimalFormat("#.#########");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setFont(new Font("Arial", Font.BOLD, 15));
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.setBounds(100, 100, 450, 300);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Number1");
		lblNumber1.setBounds(15, 30, 69, 20);
		frmSimpleCalculator.getContentPane().add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Number2");
		lblNumber2.setBounds(15, 78, 69, 20);
		frmSimpleCalculator.getContentPane().add(lblNumber2);
		
		textField = new JTextField();
		textField.setBounds(104, 27, 146, 26);
		frmSimpleCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 75, 146, 26);
		frmSimpleCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(15, 186, 69, 20);
		frmSimpleCalculator.getContentPane().add(lblResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				double res=calculator.add(num1, num2);
				String resStr = df.format(res);
				txtResult.setText(resStr);
				
			}
		});
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd.setBounds(15, 123, 45, 29);
		frmSimpleCalculator.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				double res=calculator.subtract(num1, num2);
				String resStr = df.format(res);
				txtResult.setText(resStr);
			}
		});
		btnSub.setHorizontalAlignment(SwingConstants.LEFT);
		btnSub.setBounds(84, 123, 45, 29);
		frmSimpleCalculator.getContentPane().add(btnSub);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				double res=calculator.multiply(num1, num2);
				String resStr = df.format(res);
				txtResult.setText(resStr);

			}
		});
		btnMultiplication.setHorizontalAlignment(SwingConstants.LEFT);
		btnMultiplication.setBounds(160, 123, 45, 29);
		frmSimpleCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				double res=calculator.divide(num1, num2);
				String resStr = df.format(res);
				txtResult.setText(resStr);

			}
		});
		btnDivision.setHorizontalAlignment(SwingConstants.LEFT);
		btnDivision.setBounds(234, 123, 45, 29);
		frmSimpleCalculator.getContentPane().add(btnDivision);
		
		txtResult = new JTextField();
		txtResult.setForeground(Color.BLACK);
		txtResult.setEnabled(false);
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtResult.setBounds(104, 183, 146, 26);
		frmSimpleCalculator.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				txtResult.setText(null);
			}
		});
		btnNewButton.setBounds(304, 123, 75, 29);
		frmSimpleCalculator.getContentPane().add(btnNewButton);
	}
}
