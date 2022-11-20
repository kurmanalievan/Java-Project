import com.shapes.Circle;
import com.shapes.Rectangle;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Oroz");
        button.setBounds(50, 100, 50, 50);
        JTextArea jt = new JTextArea();
        jt.setBounds(50, 50, 70, 20);
        frame.add(jt);
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("Oroz durak");
            }
        });
        frame.setSize(300, 300);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}