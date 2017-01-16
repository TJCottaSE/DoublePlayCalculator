/**
 * @Author Tony Cotta
 */

public class MainDriver {

	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	DoublePlayCalculator d = new DoublePlayCalculator();
            	d.createAndShowGUI();
            }
        });
    }
}