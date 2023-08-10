import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentInformationSystemApp extends JFrame {

    private List<Student> students;

    public StudentInformationSystemApp() {
        students = new ArrayList<>();

        setTitle("Student Information System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JTextArea studentDisplay = new JTextArea();
        studentDisplay.setEditable(false);
        mainPanel.add(new JScrollPane(studentDisplay), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = JOptionPane.showInputDialog("Enter Student ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String ageStr = JOptionPane.showInputDialog("Enter Age:");
                if (studentId != null && name != null && ageStr != null) {
                    int age = Integer.parseInt(ageStr);
                    students.add(new Student(studentId, name, age));
                    updateStudentDisplay(studentDisplay);
                }
            }
        });

        JButton viewButton = new JButton("View Students");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudentDisplay(studentDisplay);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        Container contentPane = getContentPane();
        contentPane.add(mainPanel);
    }

    private void updateStudentDisplay(JTextArea studentDisplay) {
        studentDisplay.setText("");
        for (Student student : students) {
            studentDisplay.append("Student ID: " + student.getStudentId() + "\n");
            studentDisplay.append("Name: " + student.getName() + "\n");
            studentDisplay.append("Age: " + student.getAge() + "\n");
            studentDisplay.append("-------------------\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentInformationSystemApp().setVisible(true);
            }
        });
    } 
} 
