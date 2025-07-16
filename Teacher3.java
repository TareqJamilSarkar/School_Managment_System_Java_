
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teacher3 extends JFrame implements ActionListener {
    private ImageIcon icon, icon2, image;
    private Container c;
    private JTable table;
    private String path;

    private DefaultTableModel model;

    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gndLabel, nidLabel,
            daysPerWeekLabel, positionLabel, incomeLabel, bgpic;

    private JButton backButton;
    private JTextField titleTf, fnTf, lnTf, phoneTf, gndTf, nidTf,
            daysPerWeekTf, positionTf, incomeTf;

    Teacher3() {

        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("Teacher Panel");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        // this part changes the icon
        icon = new ImageIcon(getClass().getResource("icon1.png"));
        this.setIconImage(icon.getImage());

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Teacher Profile Panel");
        titleLabel.setFont(font);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(80, 10, 250, 50);
        c.add(titleLabel);

        // JLabels Start
        fnLabel = new JLabel("Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setText("Aziz");
        fnTf.setEditable(false);
        fnTf.setFont(font);
        c.add(fnTf);

        lnLabel = new JLabel("ID ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(font);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setText("22-3456-79");
        lnTf.setEditable(false);
        lnTf.setFont(font);
        c.add(lnTf);

        // Phone
        phoneLabel = new JLabel("Subject ");
        phoneLabel.setBounds(10, 180, 140, 30);
        phoneLabel.setFont(font);
        phoneLabel.setForeground(Color.WHITE);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setText("English");
        phoneTf.setEditable(false);
        phoneTf.setFont(font);
        c.add(phoneTf);

        // Gender
        gndLabel = new JLabel("Section");
        gndLabel.setBounds(10, 230, 140, 30);
        gndLabel.setFont(font);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(110, 230, 200, 30);
        gndTf.setText("C");
        gndTf.setEditable(false);
        gndTf.setFont(font);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Phone ");
        nidLabel.setBounds(10, 280, 140, 30);
        nidLabel.setFont(font);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(110, 280, 200, 30);
        nidTf.setText("0123456799");
        nidTf.setEditable(false);
        nidTf.setFont(font);
        c.add(nidTf);

        daysPerWeekLabel = new JLabel("Number of Student");
        daysPerWeekLabel.setBounds(410, 80, 200, 30);
        daysPerWeekLabel.setFont(font);
        daysPerWeekLabel.setForeground(Color.WHITE);
        c.add(daysPerWeekLabel);

        daysPerWeekTf = new JTextField("40");
        daysPerWeekTf.setBounds(600, 80, 140, 30);
        daysPerWeekTf.setEditable(false);
        daysPerWeekTf.setFont(font);

        c.add(daysPerWeekTf);

        positionLabel = new JLabel("Tution Hour");
        positionLabel.setBounds(410, 130, 140, 30);
        positionLabel.setFont(font);
        positionLabel.setForeground(Color.WHITE);
        c.add(positionLabel);

        positionTf = new JTextField("3.5Hours");
        positionTf.setBounds(510, 130, 140, 30);
        positionTf.setFont(font);
        positionTf.setEditable(false);

        c.add(positionTf);

        incomeLabel = new JLabel("Class Day");
        incomeLabel.setBounds(410, 180, 140, 30);
        incomeLabel.setFont(font);
        incomeLabel.setForeground(Color.WHITE);
        c.add(incomeLabel);

        incomeTf = new JTextField("Sun,Tue,Thu");
        incomeTf.setBounds(510, 180, 140, 30);
        incomeTf.setFont(font);
        incomeTf.setEditable(false);

        c.add(incomeTf);

        // Cursor cur=new Cursor();

        backButton = new JButton("Back");
        backButton.setBounds(850, 180, 120, 30);
        // backButton.setCursor(cur);
        backButton.setFont(font);
        c.add(backButton);
        backButton.addActionListener(this);

        icon2 = new ImageIcon("a9.png");// pic->ImageIcon->JLabel
        bgpic = new JLabel("", icon2, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 700);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource().equals(backButton)) {
            this.dispose();
            new TeacherLogin().setVisible(true);
        }
    }

    public static void main(String[] args) {
        Teacher1 frame = new Teacher1();
        frame.setVisible(true);
    }
}
