package Week8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    //GUI fields
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultsLabel;
    private JPanel mainPanel;

    //Casting as string makes it so that only strings can be added as options
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    //A hashmap of all the exchange rates.
    //It won't change in the program
    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter(){
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

        //Makes the convert button get pressed when the enter button is pressed
        getRootPane().setDefaultButton(convertButton);

        //Adds items to the combo box
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        //New action listener for the convert button
        //The code below happens when the button is pressed
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Finds out what was typed in the JTextField dollarsTextField
                String dollarsString = dollarsTextField.getText();

                // Handles exceptions
                try {
                    // Converts the string given to a number
                    double dollars = Double.parseDouble(dollarsString);
                    //Gets the selected item from the combo box and stores it in the toCurrency variable
                    //Casting the combo box as a certain object type is dangerous but
                    // since we made it only accept strings it is safe
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    //Gets the exchange rate from the exchangeRates hashmap and then stores the result in the exchangeRate variable
                    double exchangeRate = exchangeRates.get(toCurrency);
                    // Converts to the conversion value
                    double convertedValue = dollars * exchangeRate;
                    // Display result in conversionResultsLabel JLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s.",
                            dollars, convertedValue, toCurrency);  //Formats the result string
                    conversionResultsLabel.setText(resultString);
                    //Gives the user an error message when they enter something
                    // that has characters that are not numbers
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        });


    }
}
