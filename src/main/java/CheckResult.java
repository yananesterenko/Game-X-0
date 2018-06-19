/**
 * Created by ynesterenko on 5/13/2016.
 */
public class CheckResult {

    public static void CheckResult(FrameButtons FrameButt){

        if ( (FrameButt.Button1.getText().equals(FrameButt.Button2.getText())
                && FrameButt.Button1.getText().equals(FrameButt.Button3.getText())
                && !"".equals(FrameButt.Button1.getText()) )||
                (
                FrameButt.Button1.getText().equals(FrameButt.Button5.getText())
                && FrameButt.Button1.getText().equals(FrameButt.Button9.getText())
                && !"".equals(FrameButt.Button1.getText()) )||(
                FrameButt.Button1.getText().equals(FrameButt.Button4.getText())
                && FrameButt.Button1.getText().equals(FrameButt.Button7.getText())
                && !"".equals(FrameButt.Button1.getText()) ) ||
                (FrameButt.Button9.getText().equals(FrameButt.Button7.getText())
                && FrameButt.Button9.getText().equals(FrameButt.Button8.getText())
                && !"".equals(FrameButt.Button9.getText()) ) ||(

                FrameButt.Button9.getText().equals(FrameButt.Button3.getText())
                && FrameButt.Button9.getText().equals(FrameButt.Button6.getText())
                && !"".equals(FrameButt.Button9.getText()) ) ||(
                FrameButt.Button4.getText().equals(FrameButt.Button5.getText())
                && FrameButt.Button4.getText().equals(FrameButt.Button6.getText())
                && !"".equals(FrameButt.Button4.getText()) )

        ){

            System.out.println("Выиграли : " +FrameButt.Button1.getText());
            CreateForm.index = 1;

        }


    }
}
