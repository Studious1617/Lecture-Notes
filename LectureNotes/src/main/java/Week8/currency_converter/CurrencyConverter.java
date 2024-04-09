package Week8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultsLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // What was typed in the JTextField dollarsTextField
                String dollarsString = dollarsTextField.getText();

                try {
                    // Convert to a number
                    double dollars = Double.parseDouble(dollarsString);  // handle exceptions
                    String toCurrency = (String) currencyComboBox.getSelectedItem();  //Casting the combo box as a certain object type is dangerous but since we made it only accept strings it is safe

                    double exchangeRate = exchangeRates.get(toCurrency);
                    // Convert to Euros
                    double convertedValue = dollars * exchangeRate;
                    // Display result in euroResultsLabel JLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s.", dollars, convertedValue, toCurrency);
                    conversionResultsLabel.setText(resultString);
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        });


    }
}
