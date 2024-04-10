package Week8.movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame{
    //GUI fields
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;


    //Constructor
    MovieGUI(){
        //Sets what the panel with all the code below is within
        setContentPane(mainPanel);
        //Sets the size the window will open up as initially
        setPreferredSize(new Dimension(500, 300));
        //Packs everything and constructs the interface
        pack();
        //Makes the window visble
        setVisible(true);
        //Makes the window exit when it is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Calls method that formats/configures the event handlers so things work
        configureEventHandlers();
    }



    private void configureEventHandlers(){
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //When something changes with the slider then the program gets
                // the slider's value and adds the unit "stars" to the sliderValueLabel
                // so that that part of the label appears unchanged
                String valueLabelText = ratingSlider.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);
                //The opinion is updated by calling this method
                updateOpinion();
            }
        });

        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();  //Updates opinion when a change occurs with the checkbox
            }
        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();  //Updates opinion when an inserting change occurs with the movieTitleTextField
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();  //Updates opinion when a removing change occurs with the movieTitleTextField
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //Ignore this one but keep it here
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this,
                        "Are you sure you want to quit?", "Quit",
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                    dispose();  //Gives the user an option to cancel or "ok" the decision to quit the program
                }

                //Another way to write this
                /*
                int quit = JOptionPane.showConfirmDialog(MovieGUI.this,
                        "Are you sure you want to quit?", "Quit", JOptionPane.OK_CANCEL_OPTION);
                if (quit == JOptionPane.OK_OPTION){
                    dispose();
                }
                 */

            }
        });
    }



    private void updateOpinion(){
        //Gets text from text fields and removes the empty space
        String movieName = movieTitleTextField.getText().strip();

        if (movieName.isEmpty()){
            movieOpinionLabel.setText("Movie opinion");  //If the text box is empty then this will be displayed
            return;
        }

        //Stores the rating slider value in the rating variable
        int rating = ratingSlider.getValue();
        //Stores whether the check box is checked in the seeAgain variable
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

        //Template for review message
        String template = "You rated \"%s\" %d stars. You %s see it again.";

        /*
        String seeAgainString = "would";
        if (!seeAgain){
            seeAgainString = "would not";
        }
        */

        //Alternate - ternary operator, setting values based on a condition
        String seeAgainString = (seeAgain) ? "would" : "would not";  //Less lines to write

        //Stores the template and all the needed variable values in a String that goes into the opinion variable
        String opinion = String.format(template, movieName, rating, seeAgainString);

        //Changes the movie opinion label to be the new one
        movieOpinionLabel.setText(opinion);
    }
}
