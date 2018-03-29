
package Main;

/**
 *
 * @author a1818090
 */
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GUI extends JFrame {
    
    private Container cp;
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
        
        
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        
    }
}
