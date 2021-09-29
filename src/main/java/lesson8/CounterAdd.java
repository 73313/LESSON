package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterAdd extends JFrame {
    private int count;


    public CounterAdd (int initialCount) {
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 500, 200);
        Font font = new Font("Tacoma", Font.BOLD,26 );
        Font font2 = new Font("Tacoma", Font.ITALIC, 14);



        JLabel label= new JLabel();
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);



        count = initialCount;
        label.setText(String.valueOf(count));



        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(font2);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                label.setText(String.valueOf(count));
                buttonMinus.setText("Ещё раз '-'");
            }
        });

        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(font2);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(String.valueOf(count));
                buttonPlus.setText("Ещё раз '+'");}

        });

        add(buttonMinus,BorderLayout.SOUTH);
        add(buttonPlus,BorderLayout.NORTH);




        setVisible(true);
    }
    public static void main(String[] args) {
        new CounterAdd(0);

    }
}



