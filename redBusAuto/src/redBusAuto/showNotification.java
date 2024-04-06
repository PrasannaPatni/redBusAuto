package redBusAuto;

import javax.swing.JOptionPane;

public class showNotification {
	public void showNotification(String title, String message) {
        // Show a pop-up dialog 
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
 }

}
