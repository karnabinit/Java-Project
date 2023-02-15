# Java-Project
A GUI-based application that stores details of Microsoft products and license issued details, we can use the Java Swing library.

The program creates a MicrosoftProductGUI class that extends the JFrame class and implements the ActionListener interface. The MicrosoftProductGUI class contains the GUI components such as JLabel, JTextField, JButton, and JTextArea to create a form to input product and license details, and a display area to show the list of details.

The MicrosoftProductGUI class also contains an ArrayList<String> object to store the product details as strings in the format of "Product - License (Quantity)". The ActionListener interface is implemented to handle the button clicks of "Add" and "View List".

In the actionPerformed method, the program checks the source of the event and performs the appropriate action. If the "Add" button is clicked, the program retrieves the product, license, and quantity values from the text fields, concatenates them as a single string, and adds the string to the product list. The program then appends the string to the display area and clears the text fields.

If the "View List" button is clicked, the program clears the display area and displays each product detail string from the product
