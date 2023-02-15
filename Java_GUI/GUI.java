import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {

    private JLabel productLabel, licenseLabel, quantityLabel;
    private JTextField productText, licenseText, quantityText;
    private JButton addButton, viewButton;
    private JTextArea displayArea;
    private ArrayList<String> productList;

    public GUI() {
        productList = new ArrayList<String>();

        productLabel = new JLabel("Product:");
        licenseLabel = new JLabel("License:");
        quantityLabel = new JLabel("Quantity:");

        productText = new JTextField();
        licenseText = new JTextField();
        quantityText = new JTextField();

        addButton = new JButton("Add");
        viewButton = new JButton("View List");

        displayArea = new JTextArea();

        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(productLabel);
        formPanel.add(productText);
        formPanel.add(licenseLabel);
        formPanel.add(licenseText);
        formPanel.add(quantityLabel);
        formPanel.add(quantityText);
        formPanel.add(addButton);
        formPanel.add(viewButton);

        JPanel displayPanel = new JPanel();
        displayPanel.add(displayArea);

        Container contentPane = getContentPane();
        contentPane.add(formPanel, BorderLayout.NORTH);
        contentPane.add(displayPanel, BorderLayout.CENTER);

        addButton.addActionListener(this);
        viewButton.addActionListener(this);

        setTitle("Microsoft Product Details");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addButton) {
            String product = productText.getText();
            String license = licenseText.getText();
            String quantity = quantityText.getText();
            String productDetails = product + " - " + license + " (" + quantity + ")";
            productList.add(productDetails);
            displayArea.append(productDetails + "\n");
            productText.setText("");
            licenseText.setText("");
            quantityText.setText("");
        } else if (event.getSource() == viewButton) {
            displayArea.setText("");
            for (String productDetails : productList) {
                displayArea.append(productDetails + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
