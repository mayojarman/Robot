// Java Program to create a 
// blank label and add text to it.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
class Graphics extends JFrame {
 
    // frame
    static JFrame f;
 
    // label to display text
    /* 
    static JLabel l;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;
    static JLabel l5;
    */

    static JTextField t;
 
    // default constructor
    Graphics()
    {
    }
 
    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("Life Cycle Journaling RPG");
 
        // create a label to display text
        /* 
        l = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        */
    
        JTextArea openingText = new JTextArea();
        openingText.setEditable(false);
        openingText.setBackground(f.getBackground());
        openingText.setLineWrap(true);
        openingText.setWrapStyleWord(true);
        //openingText.setCharacterAttributes(Color.BLACK);
        // add text to label

        openingText.setText("You are a sentient Robot...\n" + 
            "keeping track of your immortal life in this Solo Journaling RPG of Life and Decay.\n" + 
            "Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.\n" +
            "Act 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\n" +
            "You create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?"
            );
        
        /* 
        l.setText("You are a sentient Robot...");
        l2.setText("keeping track of your immortal life in this Solo Journaling RPG of Life and Decay.");
        l3.setText("Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.");
        l4.setText("Act 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.");
        l5.setText("You create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?");
        */
        // create a panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 1));
        // add label to panel
        p.add(openingText);
        /* 
        p.add(l);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        */

        t = new JTextField("Please write your Journal entry here : " , 100);

        String text = t.getText();
        //System.out.println(text);
        t.setHorizontalAlignment(JTextField.CENTER);
 
        // add panel to frame
        f.add(p);
        p.add(t);
 
        // set the size of frame
        //f.setSize(500, 500);
        f.setBounds(0,0,1300,500);
 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}