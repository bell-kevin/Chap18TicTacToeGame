/** ****************************************************************************
 * Chap18TicTacToeGame.java
 * Kevin Bell
 *
 * This GUI program is a tic tac toe game.
 **************************************************************************** */
package chap18tictactoegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.border.*;

public class Chap18TicTacToeGame extends JFrame {

    private static final int WIDTH = 200;
    private static final int HEIGHT = 220;
    private boolean xTurn = true;
//******************************************************************************

    public Chap18TicTacToeGame() {
        setTitle("Tic-Tac-Toe");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end Chap18TicTacToeGame constructor
//******************************************************************************
    // create components and add to window

    private void createContents() {
        JButton button;
        Listener listener = new Listener();
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button = new JButton();
                button.addActionListener(listener);
                add(button);
            }
        }
    }
//******************************************************************************

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn.getText().isEmpty()) {
                btn.setText(xTurn ? "X" : "O");
                // if there's a win
                //{
                //print winning player
                //prepare for new game
            } else {
                xTurn = !xTurn;
                JOptionPane.showMessageDialog(null, "Player "
                        + (xTurn ? "O" : "X") + ", this spot is already taken");
            }
        }
        //} 
    }
//******************************************************************************

    public static void main(String[] args) {
        new Chap18TicTacToeGame();
    } // end main method
} // end Chap18TicTacToeGame class
