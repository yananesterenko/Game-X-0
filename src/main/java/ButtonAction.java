

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ynesterenko on 5/5/2016.
 */

public class ButtonAction  implements ActionListener{
    private Object object;

    public void actionPerformed(ActionEvent e) {

        Font font = new Font("Verdana",Font.BOLD,60);
        JButton button = (JButton)e.getSource();

        String s = button.getText();
        if (s.equals("")) {
            button.setText("X");
            button.setFont(font);

            /*case "0":
                button.setText("X");
                button.setFont(font);
                break;*/
        } else if (s.equals("X")) {
            button.setText("");
            button.setFont(font);

        } else {
        }


        CreateForm.CallMethod();
        }





    }



