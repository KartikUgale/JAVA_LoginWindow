import javax.swing.*;

import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

class LoginWindow extends JFrame {

    JLabel l1, l2, l3, l4;
    JTextField t1;      // text box
    JButton b1, b2, b3;     // button
    JPasswordField t2;  // for hide characters ***

    LoginWindow(String s1) {
        super(s1);
    }

    LoginWindow() {

    }

    void setComponents() {
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c2 = new Cursor(Cursor.TEXT_CURSOR);
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);

        l1 = new JLabel("-- Welcome Back --");
        l2 = new JLabel("USERNAME :");
        l3 = new JLabel("PASSWORD :");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("login");
        b2 = new JButton("clear");
        b3 = new JButton("add");

        b1.setCursor(c1);
        b2.setCursor(c1);
        b3.setCursor(c1);

        t1.setCursor(c2);

        l1.setFont(f1);

        l1.setForeground(Color.BLUE);

        b3.setBackground(Color.ORANGE);

        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);

        l1.setBounds(270, 50, 200, 30);
        l2.setBounds(220, 170, 80, 30);
        l3.setBounds(220, 250, 80, 30);
        l4.setBounds(300, 550, 200, 30);
        t1.setBounds(340, 170, 150, 30);
        t2.setBounds(340, 250, 150, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(550, 500, 70, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new clr());
        b3.addActionListener(new Add());

        t1.addMouseListener(new MouseL1());
        t2.addMouseListener(new MouseL2());
        b2.addMouseListener(new MouseL3());
        
    }

    class MouseL1 implements MouseListener {
        public void mouseEntered(MouseEvent e1) {
            l2.setForeground(Color.RED);
        }
        public void mouseExited(MouseEvent e1) {
            l2.setForeground(Color.BLACK);
        }
        public void mouseClicked(MouseEvent e1) {
            l4.setText("");
        }
        public void mouseReleased(MouseEvent e1) {

        }
        public void mousePressed(MouseEvent e1) {

        }
    }

    class MouseL2 implements MouseListener {
        public void mouseEntered(MouseEvent e1) {
            l3.setForeground(Color.RED);
            l3.setText("Enter Pass :");
        }
        public void mouseExited(MouseEvent e1) {
            l3.setForeground(Color.BLACK);
            l3.setText("PASSWORD :");
        }
        public void mouseClicked(MouseEvent e1) {
            l4.setText("");
        }
        public void mouseReleased(MouseEvent e1) {

        }
        public void mousePressed(MouseEvent e1) {

        }
    }

    class MouseL3 implements MouseListener {
        public void mouseEntered(MouseEvent e1) {
            
        }
        public void mouseExited(MouseEvent e1) {
            
        }
        public void mouseClicked(MouseEvent e1) {
            
        }
        public void mousePressed(MouseEvent e1) {
            b2.setBackground(Color.RED);
        }
        public void mouseReleased(MouseEvent e1) {
            b2.setBackground(getBackground());
        }
        
    }

    public static void main(String[] args) {
        LoginWindow s1 = new LoginWindow("window");
        s1.setVisible(true);
        s1.setSize(700, 700);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if(s1.equals("Kartik") && s2.equals("123Pass")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                l4.setText("Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username or Password");
                l4.setText("Login Unsuccessful !");
            }
        }
    }

    class clr implements ActionListener {
        public void actionPerformed(ActionEvent e2) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e3) {
            try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            int ans = a + b;
            l4.setText("Addition is = "+ans);

            } catch(Exception e1) {
                l4.setText("add number only !!");
            }
        }
    }
}