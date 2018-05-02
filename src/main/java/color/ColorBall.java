package color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorBall implements ActionListener {
    private JFrame frame;

    public static void main(String[] args) {
        ColorBall ball = new ColorBall();
        ball.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}