
package businessFramework.commonFunctions;

/**
 *
 * @author patil
 */
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EmailFieldValidation extends InputVerifier {
     @Override
    public boolean verify(JComponent input) {
        
        String text = ((JTextField) input).getText();
  
        String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
     
        Pattern mailPattern = Pattern.compile(pattern);
        Matcher matcher = mailPattern.matcher(text);
        if (text.length() > 0) {
            if (!matcher.matches()) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid email address. ", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
          }
            else 
            {
             input.setBackground(Color.white);
             return true;  
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}
