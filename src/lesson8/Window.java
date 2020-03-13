package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Window extends JFrame {

    public Window() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(300, 300);
        // FlowLayout один за одним
        // BorderLayout EAST WEST CENTER
        // GridLayout row col
        JPanel panel = new JPanel(new GridLayout(3,3));
        JButton button = new JButton("0");
        button.addActionListener(actionEvent -> {
            System.out.println(button.getText());
            button.setText(String.valueOf(Integer.parseInt(button.getText()) + 1));
        });
        JTextArea txt = new JTextArea();
        JLabel label = new JLabel();
        txt.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                label.setText(String.valueOf(txt.getText().length()));
            }
        });

        panel.add(button);
        panel.add(txt);
        panel.add(label);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
