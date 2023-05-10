package basic_calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected JTextField input;
	protected double answer;
	protected double number;
	char operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	
	
	public void calculate() {
		switch(operation) {
		case '+':
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case '-':
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case '*':
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case '/':
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBackground(Color.DARK_GRAY);
		screen.setBounds(10, 11, 364, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(Color.WHITE);
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Consolas", Font.BOLD, 20));
		input.setBounds(0, 21, 364, 39);
		screen.add(input);
		input.setColumns(10);
		
		JLabel labelShowInput = new JLabel("");
		labelShowInput.setEnabled(false);
		labelShowInput.setBounds(262, 0, 102, 23);
		screen.add(labelShowInput);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(Color.DARK_GRAY);
		controlPanel.setBounds(10, 82, 364, 368);
		contentPane.add(controlPanel);
		controlPanel.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1_1 = new JButton("7");
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_3 = new JButton("+");
		btnNewButton_1_1_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_1_3.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = '+';
				input.setText("");
				labelShowInput.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_3.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_3);
		
		JButton btnNewButton_1_1_1_1 = new JButton("6");
		btnNewButton_1_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_2.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("-");
		btnNewButton_1_1_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = '-';
				input.setText("");
				labelShowInput.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_2.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_3_1 = new JButton("3");
		btnNewButton_1_1_1_3_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_3_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_3_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_3_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("2");
		btnNewButton_1_1_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_3 = new JButton("1");
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(Color.DARK_GRAY);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1_3_2 = new JButton("*");
		btnNewButton_1_1_1_3_2.setForeground(Color.WHITE);
		btnNewButton_1_1_1_3_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = '*';
				input.setText("");
				labelShowInput.setText(number + " " + e.getActionCommand());
				
			}
		});
		btnNewButton_1_1_1_3_2.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_1_3_2);
		
		JButton btnNewButton_1_1_2 = new JButton("=");
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("0");
		btnNewButton_1_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_3.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_4 = new JButton("C");
		btnNewButton_1_4.setForeground(Color.WHITE);
		btnNewButton_1_4.setBackground(Color.DARK_GRAY);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				labelShowInput.setText("");
			}
		});
		btnNewButton_1_4.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("/");
		btnNewButton_1_5.setForeground(Color.WHITE);
		btnNewButton_1_5.setBackground(Color.DARK_GRAY);
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = '/';
				input.setText("");
				labelShowInput.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_5.setFont(new Font("Consolas", Font.BOLD, 20));
		controlPanel.add(btnNewButton_1_5);
	}
}
