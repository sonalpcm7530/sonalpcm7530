/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonal mishra
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentManagement extends JFrame {

    public static StudentManagement frame;
    private JPanel contentPane;
    public static JLabel lblNewLabel;
    private JTextField name;
    private JTextField fname;
    private JTextField mname;
    public static ID_generator idgen;

    public static File file;
    public static int returnVal;
    public static db data;

    private int choose_file;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    idgen = new ID_generator();
                    frame = new StudentManagement();
                    frame.setVisible(true);
                    data = new db();
                    if (data.dbcon() == true) {
                        lblNewLabel.setText("Database Connected");
                        //data.get_un();
                    } else {

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Frame Creation
    public StudentManagement() {
        choose_file = 0;
        setResizable(true);
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 638);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnGo = new JButton("Search Student");
        btnGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                StudentSearch sn = new StudentSearch();
                sn.showFrame();
                frame.setVisible(false);
            }
        });

        final JFileChooser fc = new JFileChooser();

        lblNewLabel = new JLabel("Student Data Entry");

        JLabel lblStudentName = new JLabel("Student Name:");

        JLabel lblNewLabel_1 = new JLabel("DOB:");

        JLabel lblNewLabel_2 = new JLabel("Father's Name:");

        JLabel lblMotherssName = new JLabel("Mothers's Name:");

        JLabel lblSex = new JLabel("SEX:");

        JLabel lblNationality = new JLabel("Nationality:");

        JLabel lblNewLabel_3 = new JLabel("Religion:");

        JLabel lblBloodGroup = new JLabel("Blood Group:");

        JLabel lblSubject = new JLabel("Subject:");

        JLabel lblAdmissionDate = new JLabel("Admission Date:");

        name = new JTextField();
        name.setColumns(10);

        fname = new JTextField();
        fname.setColumns(10);

        mname = new JTextField();
        mname.setColumns(10);

        JLabel lblAddress = new JLabel("Address:");

        final JTextArea address = new JTextArea();

        final JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "5", "6", "7", "8", "9", "10", "11", "12"}));

        JLabel lblMonth = new JLabel("Month");

        JLabel lblDay = new JLabel("Day");

        final JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        JLabel lblYear = new JLabel("Year");

        final JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setModel(new DefaultComboBoxModel(new String[]{"1990", "1991", "1992", "1993", "1994","1998","1999","2000","2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"}));

        final JComboBox sex = new JComboBox();
        sex.setModel(new DefaultComboBoxModel(new String[]{"Male", "Female", "Other"}));

        final JComboBox nationality = new JComboBox();
        nationality.setModel(new DefaultComboBoxModel(new String[]{"Nigerian", "Ugandish", "Bangladeshi", "Indian", "Japan", "USA", "Canada"}));

        final JComboBox religion = new JComboBox();
        religion.setModel(new DefaultComboBoxModel(new String[]{ "Hinduism", "Buddhist", "Chirstian", "Zudaism", "Other"}));

        final JComboBox blood = new JComboBox();
        blood.setModel(new DefaultComboBoxModel(new String[]{"Blood Group","A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));

        final JComboBox subject = new JComboBox();
        subject.setModel(new DefaultComboBoxModel(new String[]{"Select Course","BSc in Computer Science and Engineering", "BSc in Electrical and Electronics Engineering", "BSc in Civil Engineering", "BSc in Architectural Engineering", "B-Tech in CSE", "B-Tech in Civil", "B-Tech in Mechanical", "BBA", "MBA","M Com","M Pharma","BPharma","BA in English"}));

        JLabel label = new JLabel("Month");

        final JComboBox comboBox_8 = new JComboBox();
        comboBox_8.setModel(new DefaultComboBoxModel(new String[]{"Select","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));

        JLabel label_1 = new JLabel("Day");

        final JComboBox comboBox_9 = new JComboBox();
        comboBox_9.setModel(new DefaultComboBoxModel(new String[]{"Select","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        JLabel label_2 = new JLabel("Year");

        final JComboBox comboBox_10 = new JComboBox();
        comboBox_10.setModel(new DefaultComboBoxModel(new String[]{"Select","2005", "2006", "2007", "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"}));

        final JButton btnSubmit = new JButton("Submit ");
        //btnSubmit.setSize(500,600);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DOB db = new DOB();
                if (db.set(Integer.parseInt(comboBox_1.getSelectedItem().toString()), Integer.parseInt(comboBox.getSelectedItem().toString()), Integer.parseInt(comboBox_2.getSelectedItem().toString())) == true) {
                    lblNewLabel.setText("valid DOB");
                    if (choose_file == 1) {
                        String id = data.insert_data(name.getText(), comboBox_1.getSelectedItem().toString() + "/" + comboBox.getSelectedItem().toString() + "/" + comboBox_2.getSelectedItem().toString(), fname.getText(), mname.getText(), sex.getSelectedItem().toString(), nationality.getSelectedItem().toString(), religion.getSelectedItem().toString(), blood.getSelectedItem().toString(), subject.getSelectedItem().toString(), comboBox_9.getSelectedItem().toString() + "/" + comboBox_8.getSelectedItem().toString() + "/" + comboBox_10.getSelectedItem().toString(), address.getText(), idgen.genarate());
                        if (id.compareTo("error") != 0) {
                            file = fc.getSelectedFile();
                            File dest = new File("photo/" + id + ".jpg");

                            try {
                                Files.copy(file.toPath(), dest.toPath());
                            } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            lblNewLabel.setText("Successfully Added and id is: " + id);
                        } else {
                            lblNewLabel.setText("Error occured");
                        }
                    } else {
                        lblNewLabel.setText("Choose Photo.");
                    }
                } else {
                    lblNewLabel.setText("Invalid DOB");
                }
            }
        });

        final JButton btnChoosePhoto = new JButton("Choose photo");
        btnChoosePhoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                returnVal = fc.showOpenDialog(btnChoosePhoto);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    choose_file = 1;

                } else {

                }

            }
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(23)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(btnGo)
                                                .addGap(60)
                                                .addComponent(lblNewLabel)
                                                .addContainerGap())
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblStudentName)
                                                                        .addComponent(lblNewLabel_1)
                                                                        .addComponent(lblNewLabel_2))
                                                                .addGap(25)
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addComponent(lblMonth)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(lblDay)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(lblYear)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(fname)
                                                                        .addComponent(name, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblMotherssName)
                                                                        .addComponent(lblAddress)
                                                                        .addComponent(lblSex)
                                                                        .addComponent(lblNationality)
                                                                        .addComponent(lblNewLabel_3)
                                                                        .addComponent(lblBloodGroup)
                                                                        .addComponent(lblSubject)
                                                                        .addComponent(lblAdmissionDate))
                                                                .addGap(18)
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(sex, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(address, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                                                        .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
                                                                                .addComponent(nationality, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(religion, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(blood, Alignment.LEADING, 0, 99, Short.MAX_VALUE))
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addGap(18)
                                                                                .addComponent(btnSubmit)
                                                                                .addGap(18)
                                                                                .addComponent(btnChoosePhoto))
                                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                .addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(mname, 310, 310, 310)
                                                                        .addComponent(subject, 0, 310, Short.MAX_VALUE))))
                                                .addGap(51))))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(15)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnGo)
                                        .addComponent(lblNewLabel))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblStudentName)
                                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(lblMonth)
                                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDay)
                                        .addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblYear)
                                        .addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(15)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(fname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblMotherssName)
                                        .addComponent(mname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblSex)
                                        .addComponent(sex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNationality)
                                        .addComponent(nationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(religion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblBloodGroup)
                                        .addComponent(blood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblSubject)
                                        .addComponent(subject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblAdmissionDate)
                                        .addComponent(label)
                                        .addComponent(label_1)
                                        .addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_2)
                                        .addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblAddress)
                                        .addComponent(address, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnSubmit,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnChoosePhoto))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
