package com.pos.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class MENU3 {

	private JFrame frmIcytea;
	private JLayeredPane layeredPane;
	private JPanel panel1tea;
	private JPanel panel3cakes;
	private JPanel panel4breads;
	private JTextField jtxttax;
	private JTextField jtxtsubtotal;
	private JTextField jtxttotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;
	private JTable table;
	private JComboBox jcboPayment;

	
	
	
	public static void main(String[] args) {
		
		 SwingUtilities.invokeLater(LoginSystem::new);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENU3 window = new MENU3();
					window.frmIcytea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MENU3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//======================================================FUNCTIONS=================================================================
	 	
	public void Itemcost()
	{
		double sum = 0;
		double tax = 3.9;
		
		for (int i = 0; i < table.getRowCount(); i++)
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		jtxtsubtotal.setText(Double.toString(sum));
		
		double cTotal = Double.parseDouble(jtxtsubtotal.getText());
		double cTax = (cTotal * tax)/100;
		
		String iTaxTotal = String.format("$ %.2f", cTax);
		jtxttax.setText(iTaxTotal);
		
		String iSubTotal = String.format("$ %.2f", cTotal);
		jtxtsubtotal.setText(iSubTotal);
		
		String iTotal = String.format("$ %.2f", cTotal + cTax);
		jtxttotal.setText(iTotal);
		
		
	}

	
	//======================================================FUNCTIONS=================================================================
	
	public void Change()
	{
		double sum = 0;
		double tax = 3.9;
		double cash = Double.parseDouble(jtxtDisplay.getText());
		
		for (int i = 0; i < table.getRowCount(); i++)
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		double cTax = (tax * sum)/100;
		double cChange = (cash -(sum + cTax));
		String ChangeGiven = String.format("$ %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
		
	}
	
	//======================================================FUNCTIONS=================================================================
	private void initialize() {
		frmIcytea = new JFrame();
		frmIcytea.setTitle("ICyTEA");
		frmIcytea.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\drink54.png"));
		frmIcytea.getContentPane().setBackground(new Color(64, 0, 0));
		frmIcytea.setForeground(new Color(0, 0, 0));
		frmIcytea.setBackground(new Color(0, 0, 0));
		frmIcytea.setBounds(0, 0, 1450, 750);
		frmIcytea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIcytea.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 1350, 50);
		frmIcytea.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ICyTEA");
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\drink54.png"));
		lblNewLabel_4.setBounds(10, 11, 767, 28);
		lblNewLabel_4.setIconTextGap(30);
		panel.add(lblNewLabel_4);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 0));
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBounds(10, 258, 1106, 35);
		frmIcytea.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TAX");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 24, 14);
		panel2.add(lblNewLabel);
		
		jtxttax = new JTextField();
		jtxttax.setBounds(36, 8, 328, 20);
		panel2.add(jtxttax);
		jtxttax.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SUBTOTAL");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(374, 11, 58, 14);
		panel2.add(lblNewLabel_1);
		
		jtxtsubtotal = new JTextField();
		jtxtsubtotal.setBounds(442, 8, 295, 20);
		panel2.add(jtxtsubtotal);
		jtxtsubtotal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(747, 11, 46, 14);
		panel2.add(lblNewLabel_2);
		
		jtxttotal = new JTextField();
		jtxttotal.setBounds(803, 8, 293, 20);
		panel2.add(jtxttotal);
		jtxttotal.setColumns(10);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0, 0, 0));
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel3.setBounds(10, 304, 190, 396);
		frmIcytea.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JButton jbtnTea = new JButton("TEAS");
		jbtnTea.setFont(new Font("Times New Roman", Font.BOLD, 24));
		jbtnTea.setForeground(new Color(255, 255, 255));
		jbtnTea.setBackground(new Color(128, 0, 0));
		jbtnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel1tea);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		jbtnTea.setBounds(10, 10, 170, 118);
		panel3.add(jbtnTea);
		
		JButton jbtnCakes = new JButton("CAKES");
		jbtnCakes.setFont(new Font("Times New Roman", Font.BOLD, 24));
		jbtnCakes.setForeground(new Color(255, 255, 255));
		jbtnCakes.setBackground(new Color(64, 0, 64));
		jbtnCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel3cakes);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		jbtnCakes.setBounds(10, 139, 170, 118);
		panel3.add(jbtnCakes);
		
		JButton jbtnPastries = new JButton("PASTRIES");
		jbtnPastries.setBackground(new Color(128, 0, 64));
		jbtnPastries.setForeground(new Color(255, 255, 255));
		jbtnPastries.setFont(new Font("Times New Roman", Font.BOLD, 22));
		jbtnPastries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel4breads);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		jbtnPastries.setBounds(10, 268, 170, 118);
		panel3.add(jbtnPastries);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(0, 0, 0));
		panel4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel4.setBounds(1126, 304, 234, 396);
		frmIcytea.getContentPane().add(panel4);
		panel4.setLayout(null);
		
		JButton jbtnPay = new JButton("PAY");
		jbtnPay.setForeground(new Color(255, 255, 255));
		jbtnPay.setBackground(new Color(0, 255, 255));
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (jcboPayment.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnPay.setBounds(10, 301, 214, 84);
		panel4.add(jbtnPay);
		
		JButton jbtnRemove = new JButton("REMOVE ITEM");
		jbtnRemove.setForeground(new Color(255, 255, 255));
		jbtnRemove.setBackground(new Color(0, 255, 255));
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				
				if (RemoveItem >= 0)
				{
					model.removeRow(RemoveItem);
				}
				
				Itemcost();
				
				if (jcboPayment.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
				
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbtnRemove.setBounds(10, 206, 214, 84);
		panel4.add(jbtnRemove);
		
		JButton jbtnReset = new JButton("RESET");
		jbtnReset.setForeground(new Color(255, 255, 255));
		jbtnReset.setBackground(new Color(0, 255, 255));
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxttax.setText(null);
				jtxtsubtotal.setText(null);
				jtxttotal.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
				
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbtnReset.setBounds(10, 111, 102, 84);
		panel4.add(jbtnReset);
		
		JButton jbtnExit = new JButton("EXIT");
		jbtnExit.setForeground(new Color(255, 255, 255));
		jbtnExit.setBackground(new Color(0, 255, 255));
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmIcytea = new JFrame("Exit");
				
				if (JOptionPane.showConfirmDialog(frmIcytea, "CONFIRM IF YOU WANT TO EXIT","ICyTea (-_-)",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbtnExit.setBounds(122, 111, 102, 84);
		panel4.add(jbtnExit);
		
		JLabel lblNewLabel_3 = new JLabel("PAY METHOD");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 11, 77, 25);
		panel4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CASH");
		lblNewLabel_3_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_3_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(10, 37, 77, 25);
		panel4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("CHANGE");
		lblNewLabel_3_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_3_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_2.setBounds(10, 63, 77, 25);
		panel4.add(lblNewLabel_3_2);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setBounds(97, 39, 127, 20);
		panel4.add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		jtxtChange = new JTextField();
		jtxtChange.setBounds(97, 65, 127, 20);
		panel4.add(jtxtChange);
		jtxtChange.setColumns(10);
		
		jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Visa Cash", "Master Card"}));
		jcboPayment.setBounds(97, 12, 127, 22);
		panel4.add(jcboPayment);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(0, 0, 0));
		panel6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel6.setBounds(1126, 72, 234, 218);
		frmIcytea.getContentPane().add(panel6);
		panel6.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.setBackground(new Color(0, 255, 255));
		jbtn7.setForeground(new Color(255, 255, 255));
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn7.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
				
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn7.setBounds(10, 11, 65, 42);
		panel6.add(jbtn7);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.setForeground(new Color(255, 255, 255));
		jbtn4.setBackground(new Color(0, 255, 255));
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn4.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn4.setBounds(10, 64, 65, 42);
		panel6.add(jbtn4);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.setForeground(new Color(255, 255, 255));
		jbtn3.setBackground(new Color(0, 255, 255));
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn3.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn3.setBounds(10, 117, 65, 42);
		panel6.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.setForeground(new Color(255, 255, 255));
		jbtn0.setBackground(new Color(0, 255, 255));
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn0.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn0.setBounds(10, 170, 65, 42);
		panel6.add(jbtn0);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.setForeground(new Color(255, 255, 255));
		jbtn8.setBackground(new Color(0, 255, 255));
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn8.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn8.setBounds(85, 11, 65, 42);
		panel6.add(jbtn8);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.setForeground(new Color(255, 255, 255));
		jbtn5.setBackground(new Color(0, 255, 255));
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn5.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn5.setBounds(85, 64, 65, 42);
		panel6.add(jbtn5);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.setBackground(new Color(0, 255, 255));
		jbtn2.setForeground(new Color(255, 255, 255));
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn2.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn2.setBounds(85, 117, 65, 42);
		panel6.add(jbtn2);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.setForeground(new Color(255, 255, 255));
		jbtnDot.setBackground(new Color(0, 255, 255));
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! jtxtDisplay.getText().contains("."))
				{
					jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
				}
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtnDot.setBounds(85, 170, 65, 42);
		panel6.add(jbtnDot);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.setForeground(new Color(255, 255, 255));
		jbtn9.setBackground(new Color(0, 255, 255));
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn9.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn9.setBounds(159, 11, 65, 42);
		panel6.add(jbtn9);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.setForeground(new Color(255, 255, 255));
		jbtn6.setBackground(new Color(0, 255, 255));
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn6.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn6.setBounds(159, 64, 65, 42);
		panel6.add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.setForeground(new Color(255, 255, 255));
		jbtn1.setBackground(new Color(0, 255, 255));
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if (Enternumber == "")
				{
					jtxtDisplay.setText(jbtn1.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn1.setBounds(159, 117, 65, 42);
		panel6.add(jbtn1);
		
		JButton jbtnClear = new JButton("C");
		jbtnClear.setForeground(new Color(255, 255, 255));
		jbtnClear.setBackground(new Color(0, 255, 255));
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		jbtnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtnClear.setBounds(159, 170, 65, 42);
		panel6.add(jbtnClear);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(210, 304, 906, 396);
		frmIcytea.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel1tea = new JPanel();
		panel1tea.setBackground(new Color(128, 0, 0));
		panel1tea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.add(panel1tea, "name_837408487269900");
		panel1tea.setLayout(null);
		
		JButton AguaDeJamaicaTea = new JButton("");
		AguaDeJamaicaTea.setBackground(new Color(128, 128, 128));
		AguaDeJamaicaTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"AguaDeJamaicaTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		AguaDeJamaicaTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Agua-De-Jamaica-Tea.png.jpg"));
		AguaDeJamaicaTea.setBounds(10, 11, 139, 118);
		panel1tea.add(AguaDeJamaicaTea);
		
		JButton IcedHoneydewMintTea = new JButton("");
		IcedHoneydewMintTea.setBackground(new Color(128, 128, 128));
		IcedHoneydewMintTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"IcedHoneydewMintTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		IcedHoneydewMintTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Iced-Honeydew-Mint-Tea7.jpg"));
		IcedHoneydewMintTea.setBounds(10, 140, 139, 118);
		panel1tea.add(IcedHoneydewMintTea);
		
		JButton RaspberryIcedTea = new JButton("");
		RaspberryIcedTea.setBackground(new Color(128, 128, 128));
		RaspberryIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"RaspberryIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		RaspberryIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Raspberry-Iced-Tea13.jpg"));
		RaspberryIcedTea.setBounds(10, 267, 139, 118);
		panel1tea.add(RaspberryIcedTea);
		
		JButton ApricotLemonadeIcedTea = new JButton("");
		ApricotLemonadeIcedTea.setBackground(new Color(128, 128, 128));
		ApricotLemonadeIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"ApricotLemonadeIcedTea","1",PriceOfItem});
				Itemcost();
			}
		});
		ApricotLemonadeIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Apricot-Lemonade-Iced-Tea.gif.jpg"));
		ApricotLemonadeIcedTea.setBounds(159, 11, 139, 118);
		panel1tea.add(ApricotLemonadeIcedTea);
		
		JButton IcedMelonMoroccanMintTea = new JButton("");
		IcedMelonMoroccanMintTea.setBackground(new Color(128, 128, 128));
		IcedMelonMoroccanMintTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"IcedMelonMoroccanMintTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		IcedMelonMoroccanMintTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Iced-Melon-Moroccan-Mint-Tea8.jpg"));
		IcedMelonMoroccanMintTea.setBounds(159, 140, 139, 118);
		panel1tea.add(IcedMelonMoroccanMintTea);
		
		JButton RhubarbMintTea = new JButton("");
		RhubarbMintTea.setBackground(new Color(128, 128, 128));
		RhubarbMintTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"RhubarbMintTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		RhubarbMintTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Rhubarb-Mint-Tea14.jpg"));
		RhubarbMintTea.setBounds(159, 267, 139, 118);
		panel1tea.add(RhubarbMintTea);
		
		JButton BellaBasilRaspberryTea = new JButton("");
		BellaBasilRaspberryTea.setBackground(new Color(128, 128, 128));
		BellaBasilRaspberryTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"BellaBasilRaspberryTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		BellaBasilRaspberryTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Bella-Basil-Raspberry-Tea3.jpg"));
		BellaBasilRaspberryTea.setBounds(308, 11, 139, 118);
		panel1tea.add(BellaBasilRaspberryTea);
		
		JButton LemonadeIcedTea = new JButton("");
		LemonadeIcedTea.setBackground(new Color(128, 128, 128));
		LemonadeIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"LemonadeIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		LemonadeIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Lemonade-Iced-Tea9.jpg"));
		LemonadeIcedTea.setBounds(308, 140, 139, 118);
		panel1tea.add(LemonadeIcedTea);
		
		JButton SmoothSweetTea = new JButton("");
		SmoothSweetTea.setBackground(new Color(128, 128, 128));
		SmoothSweetTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"SmoothSweetTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		SmoothSweetTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Smooth-Sweet-Tea15.jpg"));
		SmoothSweetTea.setBounds(308, 267, 139, 118);
		panel1tea.add(SmoothSweetTea);
		
		JButton CherryLimeadeSweetTea = new JButton("");
		CherryLimeadeSweetTea.setBackground(new Color(128, 128, 128));
		CherryLimeadeSweetTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"CherryLimeadeSweetTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		CherryLimeadeSweetTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Cherry-Limeade-Sweet-Tea.4.jpg"));
		CherryLimeadeSweetTea.setBounds(457, 11, 139, 118);
		panel1tea.add(CherryLimeadeSweetTea);
		
		JButton LemonLimeAlmondTea = new JButton("");
		LemonLimeAlmondTea.setBackground(new Color(128, 128, 128));
		LemonLimeAlmondTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"LemonLimeAlmondTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		LemonLimeAlmondTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Lemon-Lime-Almond-Tea10.jpg"));
		LemonLimeAlmondTea.setBounds(457, 140, 139, 118);
		panel1tea.add(LemonLimeAlmondTea);
		
		JButton SummertimeTea = new JButton("");
		SummertimeTea.setBackground(new Color(128, 128, 128));
		SummertimeTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"SummertimeTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		SummertimeTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Summertime-Tea16.jpg"));
		SummertimeTea.setBounds(457, 267, 139, 118);
		panel1tea.add(SummertimeTea);
		
		JButton HibiscusIcedTea = new JButton("");
		HibiscusIcedTea.setBackground(new Color(128, 128, 128));
		HibiscusIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HibiscusIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		HibiscusIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Hibiscus-Iced-Tea.png.jpg"));
		HibiscusIcedTea.setBounds(606, 11, 139, 118);
		panel1tea.add(HibiscusIcedTea);
		
		JButton LemonyPineappleIcedTea = new JButton("");
		LemonyPineappleIcedTea.setBackground(new Color(128, 128, 128));
		LemonyPineappleIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"LemonyPineappleIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		LemonyPineappleIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Lemony-Pineapple-Iced-Tea11.jpg"));
		LemonyPineappleIcedTea.setBounds(606, 140, 139, 118);
		panel1tea.add(LemonyPineappleIcedTea);
		
		JButton SweetTeaBoysenberryShandy = new JButton("");
		SweetTeaBoysenberryShandy.setBackground(new Color(128, 128, 128));
		SweetTeaBoysenberryShandy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"SweetTeaBoysenberryShandy","1",PriceOfItem});
				Itemcost();
				
			}
		});
		SweetTeaBoysenberryShandy.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Sweet-Tea-Boysenberry-Shandy17.jpg"));
		SweetTeaBoysenberryShandy.setBounds(606, 267, 139, 118);
		panel1tea.add(SweetTeaBoysenberryShandy);
		
		JButton HoneyCitrusIcedTea = new JButton("");
		HoneyCitrusIcedTea.setBackground(new Color(128, 128, 128));
		HoneyCitrusIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HoneyCitrusIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		HoneyCitrusIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Honey-Citrus-Iced-Tea6.jpg"));
		HoneyCitrusIcedTea.setBounds(755, 11, 139, 118);
		panel1tea.add(HoneyCitrusIcedTea);
		
		JButton PineappleIcedTea = new JButton("");
		PineappleIcedTea.setBackground(new Color(128, 128, 128));
		PineappleIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"PineappleIcedTea","1",PriceOfItem});
				Itemcost();
				
			}
		});
		PineappleIcedTea.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Pineapple-Iced-Tea12.jpg"));
		PineappleIcedTea.setBounds(755, 140, 139, 118);
		panel1tea.add(PineappleIcedTea);
		
		JButton SweetTeaConcentrate = new JButton("");
		SweetTeaConcentrate.setBackground(new Color(128, 128, 128));
		SweetTeaConcentrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"SweetTeaConcentrate","1",PriceOfItem});
				Itemcost();
				
			}
		});
		SweetTeaConcentrate.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\Sweet-Tea-Concentrate18.jpg"));
		SweetTeaConcentrate.setBounds(755, 267, 139, 118);
		panel1tea.add(SweetTeaConcentrate);
		
		panel3cakes = new JPanel();
		panel3cakes.setBackground(new Color(64, 0, 64));
		panel3cakes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.add(panel3cakes, "name_837491997916500");
		panel3cakes.setLayout(null);
		
		JButton BerryAngelFoodCake = new JButton("");
		BerryAngelFoodCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 13.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"BerryAngelFoodCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		BerryAngelFoodCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\BerryAngelFoodCake1.jpg"));
		BerryAngelFoodCake.setBounds(10, 11, 139, 118);
		panel3cakes.add(BerryAngelFoodCake);
		
		JButton BlackForestCake = new JButton("");
		BlackForestCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 12.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"BlackForestCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		BlackForestCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\BlackForestCake2.jpg"));
		BlackForestCake.setBounds(10, 140, 139, 118);
		panel3cakes.add(BlackForestCake);
		
		JButton BundtCakes = new JButton("");
		BundtCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 9.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"BundtCakes","1",PriceOfItem});
				Itemcost();
				
			}
		});
		BundtCakes.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\BundtCakes3.jpg"));
		BundtCakes.setBounds(10, 267, 139, 118);
		panel3cakes.add(BundtCakes);
		
		JButton ButterCake = new JButton("");
		ButterCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 8.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"ButterCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		ButterCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\ButterCake4.jpg"));
		ButterCake.setBounds(159, 11, 139, 118);
		panel3cakes.add(ButterCake);
		
		JButton CarrotCake = new JButton("");
		CarrotCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 11.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"CarrotCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		CarrotCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\CarrotCake5.jpg"));
		CarrotCake.setBounds(159, 140, 139, 118);
		panel3cakes.add(CarrotCake);
		
		JButton ChiffonCake = new JButton("");
		ChiffonCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 9.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"ChiffonCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		ChiffonCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\ChiffonCake6.jpg"));
		ChiffonCake.setBounds(159, 267, 139, 118);
		panel3cakes.add(ChiffonCake);
		
		JButton ChocolateCake = new JButton("tea");
		ChocolateCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 15.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"ChocolateCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		ChocolateCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\ChocolateCake7.jpg"));
		ChocolateCake.setBounds(308, 11, 139, 118);
		panel3cakes.add(ChocolateCake);
		
		JButton CoffeeCakes = new JButton("");
		CoffeeCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 10.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"CoffeeCakes","1",PriceOfItem});
				Itemcost();
				
			}
		});
		CoffeeCakes.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\CoffeeCakes8.jpg"));
		CoffeeCakes.setBounds(308, 140, 139, 118);
		panel3cakes.add(CoffeeCakes);
		
		JButton DevilsFoodCake = new JButton("");
		DevilsFoodCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 17.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"DevilsFoodCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		DevilsFoodCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\DevilsFoodCake9.jpg"));
		DevilsFoodCake.setBounds(308, 267, 139, 118);
		panel3cakes.add(DevilsFoodCake);
		
		JButton HummingbirdCake = new JButton("");
		HummingbirdCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 13.75;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HummingbirdCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		HummingbirdCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\HummingbirdCake10.jpg"));
		HummingbirdCake.setBounds(457, 11, 139, 118);
		panel3cakes.add(HummingbirdCake);
		
		JButton IceboxCake = new JButton("");
		IceboxCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 12.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"IceboxCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		IceboxCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\IceboxCake11.jpg"));
		IceboxCake.setBounds(457, 140, 139, 118);
		panel3cakes.add(IceboxCake);
		
		JButton IceCreamCakes = new JButton("");
		IceCreamCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 14.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"IceCreamCakes","1",PriceOfItem});
				Itemcost();
				
			}
		});
		IceCreamCakes.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\IceCreamCakes12.jpg"));
		IceCreamCakes.setBounds(457, 267, 139, 118);
		panel3cakes.add(IceCreamCakes);
		
		JButton JelloCake = new JButton("");
		JelloCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"JelloCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		JelloCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\JelloCake13.jpg"));
		JelloCake.setBounds(606, 11, 139, 118);
		panel3cakes.add(JelloCake);
		
		JButton NoBakeCheesecake = new JButton("");
		NoBakeCheesecake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"NoBakeCheesecake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		NoBakeCheesecake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\NoBakeCheesecake14.jpg"));
		NoBakeCheesecake.setBounds(606, 140, 139, 118);
		panel3cakes.add(NoBakeCheesecake);
		
		JButton OperaCake = new JButton("");
		OperaCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 14.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"OperaCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		OperaCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\OperaCake15.jpg"));
		OperaCake.setBounds(606, 267, 139, 118);
		panel3cakes.add(OperaCake);
		
		JButton RedVelvetCake = new JButton("");
		RedVelvetCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 20.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"RedVelvetCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		RedVelvetCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\RedVelvetCake16.jpg"));
		RedVelvetCake.setBounds(755, 11, 139, 118);
		panel3cakes.add(RedVelvetCake);
		
		JButton SpongeCakes = new JButton("");
		SpongeCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 9.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"SpongeCakes","1",PriceOfItem});
				Itemcost();
				
			}
		});
		SpongeCakes.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\SpongeCakes17.jpg"));
		SpongeCakes.setBounds(755, 140, 139, 118);
		panel3cakes.add(SpongeCakes);
		
		JButton UpsideDownCake = new JButton("");
		UpsideDownCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 11.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"UpsideDownCake","1",PriceOfItem});
				Itemcost();
				
			}
		});
		UpsideDownCake.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\CAKES JAVA\\UpsideDownCake18.jpg"));
		UpsideDownCake.setBounds(755, 267, 139, 118);
		panel3cakes.add(UpsideDownCake);
		
		panel4breads = new JPanel();
		panel4breads.setBackground(new Color(128, 0, 64));
		panel4breads.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.add(panel4breads, "name_837494756667300");
		panel4breads.setLayout(null);
		
		JButton Apfelstrudel = new JButton("");
		Apfelstrudel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Apfelstrudel","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Apfelstrudel.setBackground(new Color(128, 0, 64));
		Apfelstrudel.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Apfelstrudel1.jpg"));
		Apfelstrudel.setBounds(10, 11, 139, 118);
		panel4breads.add(Apfelstrudel);
		
		JButton Bomboloni = new JButton("");
		Bomboloni.setBackground(new Color(128, 0, 64));
		Bomboloni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Bomboloni","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Bomboloni.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Bomboloni2.0.jpg"));
		Bomboloni.setBounds(10, 140, 139, 118);
		panel4breads.add(Bomboloni);
		
		JButton Bougatsa = new JButton("tea");
		Bougatsa.setBackground(new Color(128, 0, 64));
		Bougatsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Bougatsa","1",PriceOfItem});
				Itemcost();
			}
		});
		Bougatsa.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Bougatsa3.jpg"));
		Bougatsa.setBounds(10, 267, 139, 118);
		panel4breads.add(Bougatsa);
		
		JButton Briouat = new JButton("tea");
		Briouat.setBackground(new Color(128, 0, 64));
		Briouat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 4.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Briouat","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Briouat.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Briouat4.jpg"));
		Briouat.setBounds(159, 11, 139, 118);
		panel4breads.add(Briouat);
		
		JButton Burek = new JButton("tea");
		Burek.setBackground(new Color(128, 0, 64));
		Burek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Burek","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Burek.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Burek5.jpg"));
		Burek.setBounds(159, 140, 139, 118);
		panel4breads.add(Burek);
		
		JButton Chouquette = new JButton("tea");
		Chouquette.setBackground(new Color(128, 0, 64));
		Chouquette.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Chouquette","1",PriceOfItem});
				Itemcost();
			}
		});
		Chouquette.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Chouquette6.jpg"));
		Chouquette.setBounds(159, 267, 139, 118);
		panel4breads.add(Chouquette);
		
		JButton CinnamonRolls = new JButton("tea");
		CinnamonRolls.setBackground(new Color(128, 0, 64));
		CinnamonRolls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"CinnamonRolls","1",PriceOfItem});
				Itemcost();
				
			}
		});
		CinnamonRolls.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\CinnamonRolls7.jpg"));
		CinnamonRolls.setBounds(308, 11, 139, 118);
		panel4breads.add(CinnamonRolls);
		
		JButton Croissant = new JButton("tea");
		Croissant.setBackground(new Color(128, 0, 64));
		Croissant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double PriceOfItem = 2.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Croissant","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Croissant.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Croissant8.jpg"));
		Croissant.setBounds(308, 140, 139, 118);
		panel4breads.add(Croissant);
		
		JButton EmpanadasTucumanas = new JButton("tea");
		EmpanadasTucumanas.setBackground(new Color(128, 0, 64));
		EmpanadasTucumanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"EmpanadasTucumanas","1",PriceOfItem});
				Itemcost();
			}
		});
		EmpanadasTucumanas.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\EmpanadasTucumanas9.jpg"));
		EmpanadasTucumanas.setBounds(308, 267, 139, 118);
		panel4breads.add(EmpanadasTucumanas);
		
		JButton GraffeNapoletane = new JButton("tea");
		GraffeNapoletane.setBackground(new Color(128, 0, 64));
		GraffeNapoletane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.75;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"GraffeNapoletane","1",PriceOfItem});
				Itemcost();
				
			}
		});
		GraffeNapoletane.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\GraffeNapoletane10.jpg"));
		GraffeNapoletane.setBounds(457, 11, 139, 118);
		panel4breads.add(GraffeNapoletane);
		
		JButton Kanelbulle = new JButton("tea");
		Kanelbulle.setBackground(new Color(128, 0, 64));
		Kanelbulle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Kanelbulle","1",PriceOfItem});
				Itemcost();
			}
		});
		Kanelbulle.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Kanelbulle11.jpg"));
		Kanelbulle.setBounds(457, 140, 139, 118);
		panel4breads.add(Kanelbulle);
		
		JButton Karipap = new JButton("tea");
		Karipap.setBackground(new Color(128, 0, 64));
		Karipap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Karipap","1",PriceOfItem});
				Itemcost();
			}
		});
		Karipap.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Karipap12.jpg"));
		Karipap.setBounds(457, 267, 139, 118);
		panel4breads.add(Karipap);
		
		JButton Katmer = new JButton("tea");
		Katmer.setBackground(new Color(128, 0, 64));
		Katmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3.25;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Katmer","1",PriceOfItem});
				Itemcost();
				
			}
		});
		Katmer.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Katmer13.jpg"));
		Katmer.setBounds(606, 11, 139, 118);
		panel4breads.add(Katmer);
		
		JButton Kunafah = new JButton("tea");
		Kunafah.setBackground(new Color(128, 0, 64));
		Kunafah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Kunafah","1",PriceOfItem});
				Itemcost();
			}
		});
		Kunafah.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Kunafah14.jpg"));
		Kunafah.setBounds(606, 140, 139, 118);
		panel4breads.add(Kunafah);
		
		JButton Mekica = new JButton("tea");
		Mekica.setBackground(new Color(128, 0, 64));
		Mekica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.50;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Mekica","1",PriceOfItem});
				Itemcost();
			}
		});
		Mekica.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\Mekica15.jpg"));
		Mekica.setBounds(606, 267, 139, 118);
		panel4breads.add(Mekica);
		
		JButton PainAuChocolat = new JButton("tea");
		PainAuChocolat.setBackground(new Color(128, 0, 64));
		PainAuChocolat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"PainAuChocolat","1",PriceOfItem});
				Itemcost();
				
			}
		});
		PainAuChocolat.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\PainAuChocolat16.jpg"));
		PainAuChocolat.setBounds(755, 11, 139, 118);
		panel4breads.add(PainAuChocolat);
		
		JButton PastelDeNata = new JButton("tea");
		PastelDeNata.setBackground(new Color(128, 0, 64));
		PastelDeNata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 1.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"PastelDeNata","1",PriceOfItem});
				Itemcost();
			}
		});
		PastelDeNata.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\PastelDeNata17.jpg"));
		PastelDeNata.setBounds(755, 140, 139, 118);
		panel4breads.add(PastelDeNata);
		
		JButton PolishDoughnuts = new JButton("tea");
		PolishDoughnuts.setBackground(new Color(128, 0, 64));
		PolishDoughnuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"PolishDoughnuts","1",PriceOfItem});
				Itemcost();
			}
		});
		PolishDoughnuts.setIcon(new ImageIcon("C:\\Users\\leovi\\OneDrive\\Desktop\\ICONS JAVA\\PASTRIES JAVA\\PolishDoughnuts18.jpg"));
		PolishDoughnuts.setBounds(755, 267, 139, 118);
		panel4breads.add(PolishDoughnuts);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 1106, 175);
		frmIcytea.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ITEMS", "QTY", "AMOUNT"
			}
		));
		scrollPane.setViewportView(table);
	}
}
