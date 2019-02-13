import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class PizzaPlace {

    private JTextField userText;
    private JRadioButton radioSmall;
    private JRadioButton radioMedium;
    private JRadioButton radioLarge;
    private JComboBox crustBox;
    private JFrame myFrame;

    public static void main(String[] args) {
        new PizzaPlace();
    }

    // constructor
    public PizzaPlace() {

        myFrame.setTitle("Pizza Place");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = (JPanel) myFrame.getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        Border myBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        mainPanel.setBorder(myBorder);

        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Customer Name:");
        userText = new JTextField(20);

        JPanel radioPanel = new JPanel();
        JLabel radioLabel = new JLabel("Pizza Size:");

        ButtonGroup radioGroup = new ButtonGroup();
        radioSmall = new JRadioButton("Small");
        radioMedium = new JRadioButton("Medium");
        radioLarge = new JRadioButton("Large");

        radioGroup.add(radioSmall);
        radioGroup.add(radioMedium);
        radioGroup.add(radioLarge);

        radioPanel.add(radioLabel);
        radioPanel.add(radioSmall);
        radioPanel.add(radioMedium);
        radioPanel.add(radioLarge);

        JPanel comboPanel = new JPanel();
        JLabel comboLabel = new JLabel("Crust Type");
        String[] crustType = {"Thin", "Thick", "Deep Dish"};
        crustBox = new JComboBox(crustType);
        comboPanel.add(comboLabel);
        comboPanel.add(crustBox);

        namePanel.add(nameLabel);
        namePanel.add(userText);
        myFrame.add(namePanel);
        myFrame.add(radioPanel);
        myFrame.add(comboPanel);

        myFrame.pack();
        myFrame.setVisible(true);
    }
}
