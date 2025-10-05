
package clinicalsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ClinicSystem extends JFrame {

    // student tab fields
    JTextField txtStuName, txtStuAge, txtStuCourse;
    JTextArea areaStu;
    ArrayList<String> students = new ArrayList<>();

    // staff tab fields
    JTextField txtStaffName, txtStaffPos;
    JTextArea areaStaff;
    ArrayList<String> staffs = new ArrayList<>();

    // appointment tab fields
    JTextField txtAppPatient, txtAppDoctor, txtAppDate;
    JTextArea areaApp;
    ArrayList<String> appointments = new ArrayList<>();

    // medicine tab fields
    JTextField txtMedPatient, txtMedName, txtMedQty;
    JTextArea areaMed;
    ArrayList<String> medicines = new ArrayList<>();

    public ClinicSystem() {
        setTitle("Clinic Management System");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Students", studentPanel());
        tabs.add("Staff", staffPanel());
        tabs.add("Appointments", appointmentPanel());
        tabs.add("Medicine Distribution", medicinePanel());

        add(tabs);
        setVisible(true);
    }

    // student tab
    private JPanel studentPanel() {
        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 25);
        txtStuName = new JTextField();
        txtStuName.setBounds(130, 30, 150, 25);

        JLabel l2 = new JLabel("Age:");
        l2.setBounds(30, 70, 100, 25);
        txtStuAge = new JTextField();
        txtStuAge.setBounds(130, 70, 150, 25);

        JLabel l3 = new JLabel("Course:");
        l3.setBounds(30, 110, 100, 25);
        txtStuCourse = new JTextField();
        txtStuCourse.setBounds(130, 110, 150, 25);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(300, 30, 80, 25);
        btnAdd.addActionListener(e -> {
            String data = "Name: " + txtStuName.getText() + ", Age: " + txtStuAge.getText() + ", Course: " + txtStuCourse.getText();
            students.add(data);
            JOptionPane.showMessageDialog(this, "Student Added!");
        });

        JButton btnView = new JButton("View");
        btnView.setBounds(300, 70, 80, 25);
        btnView.addActionListener(e -> {
            areaStu.setText("");
            for (String s : students) {
                areaStu.append(s + "\n");
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(300, 110, 80, 25);
        btnClear.addActionListener(e -> {
            txtStuName.setText("");
            txtStuAge.setText("");
            txtStuCourse.setText("");
            areaStu.setText("");
        });

        areaStu = new JTextArea();
        areaStu.setBounds(30, 160, 500, 250);
        areaStu.setEditable(false);

        p.add(l1); p.add(txtStuName);
        p.add(l2); p.add(txtStuAge);
        p.add(l3); p.add(txtStuCourse);
        p.add(btnAdd); p.add(btnView); p.add(btnClear);
        p.add(areaStu);

        return p;
    }

    // staff tab
    private JPanel staffPanel() {
        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 25);
        txtStaffName = new JTextField();
        txtStaffName.setBounds(130, 30, 150, 25);

        JLabel l2 = new JLabel("Position:");
        l2.setBounds(30, 70, 100, 25);
        txtStaffPos = new JTextField();
        txtStaffPos.setBounds(130, 70, 150, 25);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(300, 30, 80, 25);
        btnAdd.addActionListener(e -> {
            String data = "Name: " + txtStaffName.getText() + ", Position: " + txtStaffPos.getText();
            staffs.add(data);
            JOptionPane.showMessageDialog(this, "Staff Added!");
        });

        JButton btnView = new JButton("View");
        btnView.setBounds(300, 70, 80, 25);
        btnView.addActionListener(e -> {
            areaStaff.setText("");
            for (String s : staffs) {
                areaStaff.append(s + "\n");
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(300, 110, 80, 25);
        btnClear.addActionListener(e -> {
            txtStaffName.setText("");
            txtStaffPos.setText("");
            areaStaff.setText("");
        });

        areaStaff = new JTextArea();
        areaStaff.setBounds(30, 160, 500, 250);
        areaStaff.setEditable(false);

        p.add(l1); p.add(txtStaffName);
        p.add(l2); p.add(txtStaffPos);
        p.add(btnAdd); p.add(btnView); p.add(btnClear);
        p.add(areaStaff);

        return p;
    }

    // appointment tab
    private JPanel appointmentPanel() {
        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel l1 = new JLabel("Patient:");
        l1.setBounds(30, 30, 100, 25);
        txtAppPatient = new JTextField();
        txtAppPatient.setBounds(130, 30, 150, 25);

        JLabel l2 = new JLabel("Doctor:");
        l2.setBounds(30, 70, 100, 25);
        txtAppDoctor = new JTextField();
        txtAppDoctor.setBounds(130, 70, 150, 25);

        JLabel l3 = new JLabel("Date:");
        l3.setBounds(30, 110, 100, 25);
        txtAppDate = new JTextField();
        txtAppDate.setBounds(130, 110, 150, 25);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(300, 30, 80, 25);
        btnAdd.addActionListener(e -> {
            String data = "Patient: " + txtAppPatient.getText() + ", Doctor: " + txtAppDoctor.getText() + ", Date: " + txtAppDate.getText();
            appointments.add(data);
            JOptionPane.showMessageDialog(this, "Appointment Added!");
        });

        JButton btnView = new JButton("View");
        btnView.setBounds(300, 70, 80, 25);
        btnView.addActionListener(e -> {
            areaApp.setText("");
            for (String s : appointments) {
                areaApp.append(s + "\n");
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(300, 110, 80, 25);
        btnClear.addActionListener(e -> {
            txtAppPatient.setText("");
            txtAppDoctor.setText("");
            txtAppDate.setText("");
            areaApp.setText("");
        });

        areaApp = new JTextArea();
        areaApp.setBounds(30, 160, 500, 250);
        areaApp.setEditable(false);

        p.add(l1); p.add(txtAppPatient);
        p.add(l2); p.add(txtAppDoctor);
        p.add(l3); p.add(txtAppDate);
        p.add(btnAdd); p.add(btnView); p.add(btnClear);
        p.add(areaApp);

        return p;
    }

    // medicine tab
    private JPanel medicinePanel() {
        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel l1 = new JLabel("Patient:");
        l1.setBounds(30, 30, 100, 25);
        txtMedPatient = new JTextField();
        txtMedPatient.setBounds(130, 30, 150, 25);

        JLabel l2 = new JLabel("Medicine:");
        l2.setBounds(30, 70, 100, 25);
        txtMedName = new JTextField();
        txtMedName.setBounds(130, 70, 150, 25);

        JLabel l3 = new JLabel("Quantity:");
        l3.setBounds(30, 110, 100, 25);
        txtMedQty = new JTextField();
        txtMedQty.setBounds(130, 110, 150, 25);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(300, 30, 80, 25);
        btnAdd.addActionListener(e -> {
            String data = "Patient: " + txtMedPatient.getText() + ", Medicine: " + txtMedName.getText() + ", Qty: " + txtMedQty.getText();
            medicines.add(data);
            JOptionPane.showMessageDialog(this, "Medicine record added!");
        });

        JButton btnView = new JButton("View");
        btnView.setBounds(300, 70, 80, 25);
        btnView.addActionListener(e -> {
            areaMed.setText("");
            for (String s : medicines) {
                areaMed.append(s + "\n");
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(300, 110, 80, 25);
        btnClear.addActionListener(e -> {
            txtMedPatient.setText("");
            txtMedName.setText("");
            txtMedQty.setText("");
            areaMed.setText("");
        });

        areaMed = new JTextArea();
        areaMed.setBounds(30, 160, 500, 250);
        areaMed.setEditable(false);

        p.add(l1); p.add(txtMedPatient);
        p.add(l2); p.add(txtMedName);
        p.add(l3); p.add(txtMedQty);
        p.add(btnAdd); p.add(btnView); p.add(btnClear);
        p.add(areaMed);

        return p;
    }

    public static void main(String[] args) {
        new ClinicSystem();
    }
}
