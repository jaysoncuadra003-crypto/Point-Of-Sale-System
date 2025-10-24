package com.pos.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSystem extends JFrame implements ActionListener {
    
	private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton, resetButton;
    private JLabel messageLabel;


    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    public LoginSystem() {
        setTitle("Login System");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window

        // Panel setup
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        // Labels & Fields
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");
        messageLabel = new JLabel("", SwingConstants.CENTER);

        // Add listeners
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(resetButton);
        panel.add(new JLabel()); // filler
        panel.add(messageLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String user = userField.getText();
            String pass = String.valueOf(passField.getPassword());

            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                messageLabel.setForeground(Color.GREEN);
                messageLabel.setText("Login successful!");
                JOptionPane.showMessageDialog(this, "Welcome, " + user + "!");
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Invalid username or password!");
            }
        } else if (e.getSource() == resetButton) {
            userField.setText("");
            passField.setText("");
            messageLabel.setText("");
        }
    }
    }

