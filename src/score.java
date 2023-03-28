import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener{
    JButton submit;
    score(String name,int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        String loc = "./image/score.png";
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(loc));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank You " + name + " For playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel mark = new JLabel("Your Score is " + score);
        mark.setBounds(350, 200, 300, 30);
        mark.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(mark);

        submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {
        new score("User",0);
    }
}
