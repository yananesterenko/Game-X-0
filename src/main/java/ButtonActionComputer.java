import java.awt.*;

/**
 * Created by ynesterenko on 5/11/2016.
 */
public class ButtonActionComputer {
    static  int aa;
    static Font font = new Font("Verdana",Font.BOLD,60);
    public static void ButtonActionComputer(FrameButtons FrameButt) {

        aa = (int)(Math.random()* 9);
        switch(aa) {
            case 1:
                if ("".equals(FrameButt.Button1.getText())) {
                    FrameButt.Button1.setText("0");
                    FrameButt.Button1.setFont(font);
                    CheckResult.CheckResult(FrameButt);
                    break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 2:
                if ("".equals(FrameButt.Button2.getText())) {
                    FrameButt.Button2.setText("0");
                    FrameButt.Button2.setFont(font);
                    CheckResult.CheckResult(FrameButt);
                break;}
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 3:
                if ("".equals(FrameButt.Button3.getText())) {
                    FrameButt.Button3.setText("0");
                    FrameButt.Button3.setFont(font);
                    CheckResult.CheckResult(FrameButt);
                break;}
            case 4:
                if ("".equals(FrameButt.Button4.getText())) {
                    FrameButt.Button4.setText("0");
                    FrameButt.Button4.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                   break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 5:
                if ("".equals(FrameButt.Button5.getText())) {
                    FrameButt.Button5.setText("0");
                    FrameButt.Button5.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                    break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 6:
                if ("".equals(FrameButt.Button6.getText())) {
                    FrameButt.Button6.setText("0");
                    FrameButt.Button6.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                    break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 7:
                if ("".equals(FrameButt.Button7.getText())) {
                    FrameButt.Button7.setText("0");
                    FrameButt.Button7.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                    break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 8:
                if ("".equals(FrameButt.Button8.getText())) {
                    FrameButt.Button8.setText("0");
                    FrameButt.Button8.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                    break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 9:
                if ("".equals(FrameButt.Button9.getText())) {
                    FrameButt.Button9.setText("0");
                    FrameButt.Button9.setFont(font);
                    CheckResult.CheckResult(FrameButt);

                break;
                }
                else

                    ButtonActionComputer(FrameButt);
                    break;
            case 0:
                ButtonActionComputer(FrameButt);
                break;

            default:
                break;}

    }
}
