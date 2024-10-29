import javax.swing.*;
import java.awt.*;


public class LearnBorderLayout {
    private JFrame mainFrame;
    private JPanel borderPanel, gridPanel;
    private JButton button1, button2, button3, button4, button5;
    private JLabel label1, label2;
    private JTextArea textArea;


    public static void main(String[] args) {
        LearnBorderLayout myCode = new LearnBorderLayout();
    }

    public LearnBorderLayout(){
        mainFrame = new JFrame("Frame");
        mainFrame.setSize(400, 300);

        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        mainFrame.add(borderPanel);

        gridPanel = new JPanel(new GridLayout(2, 3));
        borderPanel.add(gridPanel, BorderLayout.CENTER);

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        label1 = new JLabel("label 1");
        label2 = new JLabel("label 2");
//        textArea = new JTextArea("text here");

        // add components to the panel using NORTH, SOUTH, EAST, WEST
        borderPanel.add(button1, BorderLayout.NORTH);
        borderPanel.add(button3, BorderLayout.SOUTH);
        gridPanel.add(button2);
        gridPanel.add(label1);
        label1.setHorizontalAlignment(SwingConstants.CENTER); // centering the text of label 1
        gridPanel.add(button4);
        gridPanel.add(label2);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        gridPanel.add(button5);
//        borderPanel.add(label1, BorderLayout.WEST);
//        borderPanel.add(label2, BorderLayout.EAST);
//        borderPanel.add(textArea, BorderLayout.CENTER);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



}

