import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}

public class PatientInformationSystemApp extends JFrame {

    private List<Patient> patients;

    public PatientInformationSystemApp() {
        patients = new ArrayList<>();

        setTitle("Patient Information System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JTextArea patientDisplay = new JTextArea();
        patientDisplay.setEditable(false);
        mainPanel.add(new JScrollPane(patientDisplay), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Patient");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientId = JOptionPane.showInputDialog("Enter Patient ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String ageStr = JOptionPane.showInputDialog("Enter Age:");
                String diagnosis = JOptionPane.showInputDialog("Enter Diagnosis:");
                if (patientId != null && name != null && ageStr != null && diagnosis != null) {
                    int age = Integer.parseInt(ageStr);
                    patients.add(new Patient(patientId, name, age, diagnosis));
                    updatePatientDisplay(patientDisplay);
                }
            }
        });

        JButton viewButton = new JButton("View Patients");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePatientDisplay(patientDisplay);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        Container contentPane = getContentPane();
        contentPane.add(mainPanel);
    }

    private void updatePatientDisplay(JTextArea patientDisplay) {
        patientDisplay.setText("");
        for (Patient patient : patients) {
            patientDisplay.append("Patient ID: " + patient.getPatientId() + "\n");
            patientDisplay.append("Name: " + patient.getName() + "\n");
            patientDisplay.append("Age: " + patient.getAge() + "\n");
            patientDisplay.append("Diagnosis: " + patient.getDiagnosis() + "\n");
            patientDisplay.append("-------------------\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PatientInformationSystemApp().setVisible(true);
            }
        });
    }
}
