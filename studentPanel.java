import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javax.swing.JCheckBox;

import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;

public class studentPanel extends JFrame implements ActionListener {
    private ImageIcon icon, icon2, image;
    private Container c;
    private JTable table;
    private String path;

    private DefaultTableModel model;

    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, ocpLabel, gndLabel, nidLabel,
            membShowLabel, checkInTimeLabel, checkInTimeShowLabel, daysLabel, roomsLabel,
            rtLabel, rnLabel,
            adLabel, arLabel, rbLabel, rbShowLabel, paidLabel, paidShowLabel, dueLabel, dueShowLabel, passLabel,
            bgpic;

    private JButton backButton;
    private JTextField fnTf, lnTf, phoneTf, ocpTf, gndTf, nidTf, membTf,
            checkInTimeTf, daysTf, roomsTf,
            rtTf, rnTf,
            adTf, arTf, rbTf, paidTf, dueTf, passTf;

    private JSpinner fishSpinner, beefSpinner, muttonSpinner, porkSpinner, riceSpinner,
            apSpinner, mkSpinner, ltSpinner, ckSpinner, ccSpinner, tSpinner, cSpinner, ojSpinner,
            mjSpinner, csSpinner;
    private JCheckBox fishCheckBox, beefCheckBox, muttonCheckBox, porkCheckBox, riceCheckBox,
            applePieCheckBox, malaiKulfiCheckBox, lemonTartCheckBox, coconutKheerCheckBox, cupCakeCheckBox, tCheckBox,
            cCheckBox, ojCheckBox,
            mjCheckBox, csCheckBox;

    private SpinnerNumberModel valueOfFish, valueOfBeef, valueOfMutton, valueOfPork, valueOfRice, valueOfAp, valueOfMk,
            valueOfLt, valueOfCk, valueOfCc, valueOfT, valueOfC, valueOfOj, valueOfMj, valueOfCs;

    private JScrollBar scroll;
    private Font f1, font, font2;
    private Cursor cur;

    private String[] cols = { "Name", "Father Name", "Mother Name", "Date Of Birth", "Gender",
            "Address", "Standard", "Group", "Total Fee", "Paid ", "Due amount", "ID Number", "Password" };

    studentPanel(String path) {
        this.path = path;
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Panel");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        // this part changes the icon
        icon = new ImageIcon(getClass().getResource("icon1.png"));
        this.setIconImage(icon.getImage());

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Student Profile Panel");
        titleLabel.setFont(font);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(80, 10, 250, 50);
        c.add(titleLabel);

        // table
        table = new JTable();

        TableReader tt5 = new TableReader();
        model = new DefaultTableModel();
        File f = new File(path);
        if (f.length() != 0) {
            model = tt5.createModel(path);
        }
        model.setColumnIdentifiers(cols);
        table.setModel(model);

        // JLabels Start
        fnLabel = new JLabel("Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        lnLabel = new JLabel("Father Name ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(font);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setFont(font);
        c.add(lnTf);

        // Occupation
        ocpLabel = new JLabel("Mother Name");
        ocpLabel.setBounds(10, 180, 140, 30);
        ocpLabel.setFont(font);
        ocpLabel.setForeground(Color.WHITE);
        c.add(ocpLabel);

        ocpTf = new JTextField();
        ocpTf.setBounds(110, 180, 200, 30);
        ocpTf.setFont(font);
        c.add(ocpTf);

        // Gender
        gndLabel = new JLabel("Date Of Birth");
        gndLabel.setBounds(10, 230, 140, 30);
        gndLabel.setFont(font);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(110, 230, 200, 30);
        gndTf.setFont(font);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Gender");
        nidLabel.setBounds(10, 280, 140, 30);
        nidLabel.setFont(font);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(110, 280, 200, 30);
        nidTf.setFont(font);
        c.add(nidTf);
        // ID Number
        passLabel = new JLabel("ID Number");
        passLabel.setBounds(10, 330, 150, 30);
        passLabel.setFont(font);
        passLabel.setForeground(Color.WHITE);
        c.add(passLabel);

        passTf = new JTextField();
        passTf.setBounds(110, 330, 200, 30);
        passTf.setFont(font);
        c.add(passTf);
        // Standard

        rnLabel = new JLabel("Standard");
        rnLabel.setBounds(10, 380, 150, 30);
        rnLabel.setFont(font);
        rnLabel.setForeground(Color.WHITE);
        c.add(rnLabel);

        rnTf = new JTextField();
        rnTf.setBounds(110, 380, 200, 30);
        rnTf.setFont(font);
        c.add(rnTf);

        // Group

        rbLabel = new JLabel("Group");
        rbLabel.setBounds(410, 80, 150, 30);
        rbLabel.setFont(font);
        rbLabel.setForeground(Color.WHITE);
        c.add(rbLabel);

        rbTf = new JTextField();
        rbTf.setBounds(510, 80, 200, 30);
        rbTf.setFont(font);
        c.add(rbTf);

        // Total Fee

        paidLabel = new JLabel("Total Amount");
        paidLabel.setBounds(410, 130, 150, 30);
        paidLabel.setFont(font);
        paidLabel.setForeground(Color.WHITE);
        c.add(paidLabel);

        paidTf = new JTextField();
        paidTf.setBounds(510, 130, 200, 30);
        paidTf.setFont(font);
        c.add(paidTf);
        // due
        phoneLabel = new JLabel("Due Amount");
        phoneLabel.setBounds(410, 180, 140, 30);
        phoneLabel.setFont(font);
        phoneLabel.setForeground(Color.WHITE);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(510, 180, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);
        // paid
        dueLabel = new JLabel("Paid Amount");
        dueLabel.setBounds(410, 230, 150, 30);
        dueLabel.setFont(font);
        dueLabel.setForeground(Color.WHITE);
        c.add(dueLabel);

        dueTf = new JTextField();
        dueTf.setBounds(510, 230, 200, 30);
        dueTf.setFont(font);
        c.add(dueTf);
        // Address
        daysLabel = new JLabel("Address");
        daysLabel.setBounds(410, 280, 150, 30);
        daysLabel.setFont(font);
        daysLabel.setForeground(Color.WHITE);
        c.add(daysLabel);

        daysTf = new JTextField();
        daysTf.setBounds(510, 280, 200, 30);
        daysTf.setFont(font);
        c.add(daysTf);

        // JLabels End

        // JTextField Start

        String f_name = model.getValueAt(0, 0).toString();
        String l_name = model.getValueAt(0, 1).toString();

        String ocp = model.getValueAt(0, 2).toString();
        String gnd = model.getValueAt(0, 3).toString();
        String nid = model.getValueAt(0, 4).toString();
        // String checkInTime = model.getValueAt(0, 6).toString();
        String days = model.getValueAt(0, 5).toString();
        String r_no = model.getValueAt(0, 6).toString();
        String r_bill = model.getValueAt(0, 7).toString();
        String paid = model.getValueAt(0, 8).toString();
        String due = model.getValueAt(0, 9).toString();
        String phone = model.getValueAt(0, 10).toString();
        String pass = model.getValueAt(0, 11).toString();

        fnTf.setText(f_name);
        lnTf.setText(l_name);

        ocpTf.setText(ocp);

        gndTf.setText(gnd);
        nidTf.setText(nid);
        // checkInTimeTf.setText(checkInTime);
        daysTf.setText(days);
        rnTf.setText(r_no);
        rbTf.setText(r_bill);
        paidTf.setText(paid);
        dueTf.setText(due);
        phoneTf.setText(phone);
        passTf.setText(pass);

        /*
         * int num = table.getRowCount();
         * String tnum = String.valueOf(num);
         * totalMembersTextField.setText(tnum);
         * 
         * String aString = reader("absbill.txt");
         * absoluteBillTextField.setText(aString);
         * 
         * String bString = reader("dmc.txt");
         * dailyMealTextField.setText(bString);
         * 
         * String cString = reader("immc.txt");
         * indiMonthlyMTextField.setText(cString);
         * 
         * String dString = reader("indiuti.txt");
         * individualUtilityTextField.setText(dString);
         * 
         * String eString = reader("mmc.txt");
         * monthlyMealTextField.setText(eString);
         * 
         * String fString = reader("utility.txt");
         * utilyTextField.setText(fString);
         * 
         * File imgFile = new File(profile);
         * if (imgFile.exists()) {
         * image = new ImageIcon(getClass().getResource(profile));
         * profilePhoto = new JLabel(image);
         * profilePhoto.setBounds(950, 100, 300, 300);
         * profilePhoto.setVisible(true);
         * c.add(profilePhoto);
         * } else {
         * profilePhoto = new JLabel("Photo Not Found");
         * profilePhoto.setBounds(950, 100, 300, 300);
         * profilePhoto.setVisible(true);
         * c.add(profilePhoto);
         * }
         * /
         */
        fnTf.setEditable(false);
        lnTf.setEditable(false);
        ocpTf.setEditable(false);
        gndTf.setEditable(false);
        nidTf.setEditable(false);
        // checkInTimeTf.setEditable(false);
        daysTf.setEditable(false);
        rnTf.setEditable(false);
        rbTf.setEditable(false);
        paidTf.setEditable(false);
        dueTf.setEditable(false);
        phoneTf.setEditable(false);
        passTf.setEditable(false);

        fnTf.setBackground(Color.WHITE);
        lnTf.setBackground(Color.WHITE);
        ocpTf.setBackground(Color.WHITE);

        gndTf.setBackground(Color.WHITE);
        nidTf.setBackground(Color.WHITE);
        // checkInTimeTf.setBackground(Color.GRAY);
        daysTf.setBackground(Color.WHITE);
        rnTf.setBackground(Color.WHITE);
        rbTf.setBackground(Color.WHITE);
        paidTf.setBackground(Color.WHITE);
        dueTf.setBackground(Color.WHITE);
        phoneTf.setBackground(Color.WHITE);
        passTf.setBackground(Color.WHITE);

        // JTextField End

        // Food========order//

        backButton = new JButton("Back");
        backButton.setBounds(850, 230, 120, 30);
        backButton.setCursor(cur);
        backButton.setFont(font);
        c.add(backButton);

        // Action Listener

        backButton.addActionListener(this);

        // add background picture...JLabel er maddhome ekta pic add korbo then seta
        // frame er size onujai dibo
        icon2 = new ImageIcon("a2.jpg");// pic->ImageIcon->JLabel
        bgpic = new JLabel("", icon2, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 700);

        c.add(bgpic);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton) {

            this.dispose();
            new studentLogin2().setVisible(true);

        }

    }

    public String reader(String str) {
        String text = null;
        BufferedReader txtReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(str)));
        try {
            text = txtReader.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text;
    }

}
