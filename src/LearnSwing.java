import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnSwing implements ActionListener {
    //declaration section
    private JFrame mainFrame; // mainFrame is an object, JFrame is a class
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private JTextArea textArea;
    private int buttonPressed = 0;

    public static void main(String[] args) {
        LearnSwing myCode = new LearnSwing();
    }

    public LearnSwing(){
        mainFrame = new JFrame("Title");
        mainFrame.setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        mainFrame.add(panel);

        button1 = new JButton("My first button");
        panel.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("My second button");
        panel.add(button2);
        button2.addActionListener(this);

        label = new JLabel("My first label");
        panel.add(label);

        textArea = new JTextArea("Type Here");
        panel.add(textArea);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // stops running the code when frame is closed
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is clicked");
        label.setText("Number of clicks: " + buttonPressed);
        buttonPressed++;
    }
}

// steps to make a frame show up: 1) declare 2) construct 3) use

