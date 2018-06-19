import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ynesterenko on 5/12/2016.
 */
public  class FrameButtons extends JFrame {
    public JFrame frame = new JFrame("Welcome to play!");
    public JButton Button1 = new JButton("");
    public JButton Button2 = new JButton("");
    public JButton Button3 = new JButton("");
    public JButton Button4 = new JButton("");
    public JButton Button5 = new JButton("");
    public JButton Button6 = new JButton("");
    public JButton Button7 = new JButton("");
    public JButton Button8 = new JButton("");
    public JButton Button9 = new JButton("");

    public void CreateFrame(){

        frame.setSize(new Dimension(300, 300));
        frame.setBackground(Color.PINK );
        frame.setLocation(100,100);
        frame.setVisible(true);

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");

        MenuItem newGame = new MenuItem("New Game");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button1.setText("");
                Button2.setText("");
                Button3.setText("");
                Button4.setText("");
                Button5.setText("");
                Button6.setText("");
                Button7.setText("");
                Button8.setText("");
                Button9.setText("");
                CreateForm.index = 0;
            }
        });
        fileMenu.add(newGame);
        Menu exitMenu = new Menu("Exit");
        MenuItem exitGame = new MenuItem("Exit");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye!");
                frame.dispose();
            }
        });
        exitMenu.add(exitGame);
        menuBar.add(fileMenu);
        menuBar.add(exitMenu);



        frame.setMenuBar(menuBar);

        frame.setLayout(new GridLayout(3, 3));//Создаем сетку 3 на 3
        frame.add(Button1);
        frame.add(Button2);
        frame.add(Button3);
        frame.add(Button4);
        frame.add(Button5);
        frame.add(Button6);
        frame.add(Button7);
        frame.add(Button8);
        frame.add(Button9);



       /* frame.add(yellowButton);
        frame.add(redButton);
        frame.add(blueButton);
        frame.add(allButton);*/
        Font  font = new Font("Verdana",Font.BOLD,60);


        Button1.addActionListener(new ButtonAction());
        Button2.addActionListener(new ButtonAction());
        Button3.addActionListener(new ButtonAction());
        Button4.addActionListener(new ButtonAction());
        Button5.addActionListener(new ButtonAction());
        Button6.addActionListener(new ButtonAction());
        Button7.addActionListener(new ButtonAction());
        Button8.addActionListener(new ButtonAction());
        Button9.addActionListener(new ButtonAction());

    }

}
