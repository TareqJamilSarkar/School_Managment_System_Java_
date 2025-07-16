import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

import java.awt.*;
import java.awt.event.*;

public class start extends JFrame implements ActionListener {

    private ImageIcon icon, icon2;

    // A container provides a space where a component can be located
    private Container c;// container to change background color,add button,add JLabel(for
                        // text,image),textfield...etc
    private JLabel welcome, bgpic;
    private JButton checkin, customer, checkout, admin;
    private JScrollBar scroll;
    private Font f1, f2;
    private Cursor cur;

    start() {

        // constructor e size thik na kore dile back korar somoy frame er size dekhabe
        // na
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("Aims School");
        initComponents();// method
    }

    public void initComponents() {
        // this part changes the bg color
        c = this.getContentPane();
        c.setLayout(null);

        // this part changes the icon
        icon = new ImageIcon(getClass().getResource("icon1.png"));
        this.setIconImage(icon.getImage());

        // fontstyle for welcome message
        f1 = new Font("modern", Font.BOLD, 30);

        // fontstyle for button
        f2 = new Font("Arial", Font.BOLD, 16);
        // welcome message

        welcome = new JLabel("Welcome to Aims School");
        welcome.setBounds(380, 160, 500, 30);
        welcome.setFont(f1);
        c.add(welcome);
        welcome.setForeground(Color.WHITE);

        // cursor for button
        cur = new Cursor(Cursor.HAND_CURSOR);
        // newCustomer button

        checkin = new JButton("ADDMISSION OFFICE");
        checkin.setBounds(310, 200, 500, 50);
        checkin.setFont(f2);
        checkin.setCursor(cur);
        c.add(checkin);
        checkin.addActionListener(this);

        // Customer button

        customer = new JButton("STUDENT");
        customer.setBounds(310, 260, 500, 50);
        customer.setFont(f2);
        customer.setCursor(cur);
        c.add(customer);
        customer.addActionListener(this);

        // checkout button

        checkout = new JButton("TEACHER");
        checkout.setBounds(310, 320, 500, 50);
        checkout.setFont(f2);
        checkout.setCursor(cur);
        c.add(checkout);
        checkout.addActionListener(this);
        // admin button

        // admin = new JButton("Admin");
        // admin.setBounds(310, 380, 500, 50);
        // admin.setFont(f2);
        // admin.setCursor(cur);
        // c.add(admin);
        // admin.addActionListener(this);

        // add background picture...JLabel er maddhome ekta pic add korbo then seta
        // frame er size onujai dibo
        icon2 = new ImageIcon("abc1.png");// pic->ImageIcon->JLabel
        bgpic = new JLabel("", icon2, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 700);

        c.add(bgpic);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(checkin)) {
            dispose();
            AdminLogin admin = new AdminLogin();
            admin.setVisible(true);
        } else if (e.getSource().equals(customer)) {
            dispose();
            studentLogin2 member = new studentLogin2();
            member.setVisible(true);
        } else {

            dispose();
            TeacherLogin employee = new TeacherLogin();
            employee.setVisible(true);
        }

    }

    public static void main(String[] args) {
        start frame = new start();
        frame.setVisible(true);
    }

}