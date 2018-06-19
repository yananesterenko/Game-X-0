import java.awt.*;

/**
 * Created by ynesterenko on 4/4/2016.
 */
public class CreateForm {
    public static String retResult;
    static int  index = 0;
    static boolean gameFinish = false;
    private static Component[] components;
    public  static FrameButtons FrameButt;
    public static void main(String[] args) {
        FrameButt = new FrameButtons();
        try {
            FrameButt.CreateFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }


     }
    public static void CallMethod(){
        if(index == 0){
        ButtonActionComputer.ButtonActionComputer(FrameButt);}

    }

}





