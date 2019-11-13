package kwan.org.demospringswing.view.temp;

import javax.swing.*;
import java.awt.*;

public class SimpleEx extends JFrame {

    public SimpleEx() {
        initUI();
    }

    private void initUI() {
        setTitle("Simple Example");
        setSize(300 , 200);

        //Dòng code trên có tác dụng hiển thị cửa sổ lên vị trí giữa màn hình.
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                SimpleEx ex = new SimpleEx();
                ex.setVisible(true);
            }
        });
    }

}
