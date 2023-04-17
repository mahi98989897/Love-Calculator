
import org.w3c.dom.css.CSSUnknownRule;

import java.awt.font.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.Random;

public class LoveCalculator  {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Frame frame = new Frame("Love Calculator By \"Mahi\"");
        frame.setBackground(Color.pink);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Avita\\Downloads\\heart.jpeg");
        frame.setIconImage(icon);


        Label label = new Label("This Is a Love Calculator for you and your Partener:)");
        label.setBounds(5,30,400,40);
        label.setBackground(Color.RED);
        label.setForeground(Color.BLUE);
         Font font = new Font("Courier", Font.BOLD,14);
         label.setFont(font);


        Label lebel2 = new Label("Enter Your Name:");
        lebel2.setBounds(60,90,100,20);


        Label lebel3 = new Label("Enter Your Partner Name:");
        lebel3.setBounds(20,130,150,20);

        Label lebel4 = new Label();
        lebel4.setBounds(85,170,250,20);
        lebel4.setForeground(Color.BLUE);

        Label label5 = new Label();
        label5.setBounds(100,240,200,20);
        label5.setForeground(Color.BLUE);

        TextField textField = new TextField();
        textField.setBounds(180,90,100,20);

        TextField textField2 = new TextField();
        textField2.setBounds(180,130,100,20);

        Button button = new Button("Button");
        button.setFont(new Font("Algerian",Font.BOLD,12));
        button.setBounds(155,200,50,20);
                  button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lebel4.setText("Love Between " + textField.getText() + " and " + textField2.getText() + " is: " + Integer.toString(number) + "%");
                    label5.setText("Thank you for using my calulator...");
                }
            });
        frame.add(label5);
        frame.add(lebel4);
        frame.add(textField2);
        frame.add(lebel3);
        frame.add(lebel2);
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
