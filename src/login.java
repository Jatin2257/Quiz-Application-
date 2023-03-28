import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class login extends JFrame implements ActionListener {
  JButton rules,back;
  JTextField tfname;
  login() {
    getContentPane().setBackground(Color.white);
    setLayout(null);
    String loc = "./image/login.jpeg";
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(loc));
    JLabel image = new JLabel(i1);
    image.setBounds(0, 0, 600, 500);
    add(image);

    JLabel heading = new JLabel("Simple Minds");
    heading.setBounds(750, 60, 300, 45);
    heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
    heading.setForeground(new Color(30, 144, 245));
    add(heading);

    JLabel name = new JLabel("Enter Your Name");
    name.setBounds(810, 150, 300, 20);
    name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
    name.setForeground(new Color(30, 144, 254));
    add(name);

    tfname = new JTextField();
    tfname.setBounds(735, 200, 300, 25);
    tfname.setFont(new Font("Time New Roman", Font.BOLD, 20));
    add(tfname);

    rules = new JButton("Rules");
    rules.setFont(new Font("Time New Roman", Font.BOLD, 20));
    rules.setBounds(735, 270, 120, 25);
    rules.setBackground(new Color(30, 144, 254));
    rules.setForeground(Color.WHITE);
    rules.addActionListener(this);
    add(rules);

    back = new JButton("Back");
    back.setFont(new Font("Time New Roman", Font.BOLD, 20));
    back.setBounds(915, 270, 120, 25);
    back.setBackground(new Color(30, 144, 254));
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    add(back);

    setSize(1200, 500);
    setLocation(200, 150);
    setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == rules) {
        String name = tfname.getText();
        setVisible(false);
        new Rules(name);
    }
    if (e.getSource() == back) {
      setVisible(false);
    }

  }

  public static void main(String[] args) {
    new login();
  }

}
