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
    JButton btns[][] = new JButton[3][3];
    int count;
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
                btns[i][j] = button;
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
                if (isGameOver(btn) == true) {
                    //if (false) {
                    JOptionPane.showMessageDialog(btn, "Congrats winner "
                            + (xTurn ? "X" : "O"));
                    btn.setText("");
                    count = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            btns[i][j].setText("");
                            xTurn = true;
                        }
                    }
                } else {
                    xTurn = !xTurn;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Player "
                        + (xTurn ? "X" : "O") + ", this spot is already taken");
            }
            count++;
            if (count == 9) {
                JOptionPane.showMessageDialog(null, "No more moves, game over");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        btns[i][j].setText("");
                        xTurn = true;
                    }
                }
            }
        }
    }
//******************************************************************************

    public boolean isGameOver(JButton button) {
        for (int i = 0; i < 3; i++) {
            if (btns[i][0].getText() == button.getText() && btns[i][1].getText()
                    == button.getText() && btns[i][2].getText()
                    == button.getText()) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (btns[0][j].getText() == button.getText() && btns[1][j].getText()
                    == button.getText() && btns[2][j].getText()
                    == button.getText()) {
                return true;
            }
        }
        if ((btns[0][0].getText() == button.getText() && btns[1][1].getText()
                == button.getText() && btns[2][2].getText() == button.getText())
                || (btns[0][2].getText() == button.getText()
                && btns[1][1].getText()
                == button.getText() && btns[2][0].getText()
                == button.getText())) {
            return true;
        } else {
            return false;
        }
    }
//******************************************************************************

    public static void main(String[] args) {
        new Chap18TicTacToeGame();
    } // end main method
} // end Chap18TicTacToeGame class
