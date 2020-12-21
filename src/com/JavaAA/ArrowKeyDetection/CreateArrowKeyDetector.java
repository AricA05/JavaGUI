package com.JavaAA.ArrowKeyDetection;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CreateArrowKeyDetector {

    //constructor. The constructor is called when an object of a class is created
    public CreateArrowKeyDetector() {
        //this creates the window/frame
        JFrame frame = new JFrame();
        //makes frame visible
        frame.setVisible(true);
        //closes window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //dimensions of frame
        frame.setSize(400,400);
        //allows you to click on frame
        frame.setFocusable(true);

        //creates panel, this will be invisible on frame, but it holds/contains the four labels
        JPanel panel = new JPanel();
        //label for up arrow
        JLabel up = new JLabel();
        //label for down arrow
        JLabel down = new JLabel();
        //label for left arrow
        JLabel left = new JLabel();
        //label for right arrow
        JLabel right = new JLabel();

        //adds all of the labels to the panel
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        //these add text to the labels. This is what the counter/labels will look like when window is first opened
        up.setText("Up: 0");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");

        //implements the keyListener attribute to the frame. All the @override statements are auto created when the KeyListener is imported
        frame.addKeyListener(new KeyListener() {

            //these are the counters for each key, they will increase if the key is clicked. the increase happens within the keyPressed line
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //takes a key event (any key pressed) and stores it into below code
                int keyCode = e.getKeyCode();
                //the switch case is used to select one of the possible code blocks, based on the user action. Similar to "if"
                switch(keyCode) {
                    //"VK" = virtual keyboard, this will detect if up key is clicked
                    case KeyEvent.VK_UP:
                        //this line below sets the counter labels text and converts the counter to a string
                        up.setText("Up:" + Integer.toString(upCount++));
                        break;//a break is needed here so the program can executes the below events correctly, without continuously running the first one
                    //down key detection
                    case KeyEvent.VK_DOWN:
                        down.setText("Down:" + Integer.toString(downCount++));
                        break;
                    //left key detection
                    case KeyEvent.VK_LEFT:
                        left.setText("Left:" + Integer.toString(leftCount++));
                        break;
                    //right key detection
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right:" + Integer.toString(rightCount++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //adds panel to the frame
        frame.add(panel);
    }

    public static void main(String[] args) {

        new CreateArrowKeyDetector();

    }
}

