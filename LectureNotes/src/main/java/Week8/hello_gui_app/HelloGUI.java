package Week8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    public HelloGUI(){
        //Sets what the panel with all the code below is within
        setContentPane(mainPanel);

        //Sets the size the window will open up as initially
        setPreferredSize(new Dimension(250, 150));
        //Constructs the interface
        pack();
        //Makes the window visble
        setVisible(true);
        //Makes the window exit when it is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Makes the code below run when the clickMeButton is pressed
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code here - this will run when button is clicked
                myFirstLabel.setText("Hello GUI Programmers!!");  //Text will display after clickMeButton is pressed
            }
        });





    }
}
