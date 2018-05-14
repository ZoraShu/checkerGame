package GUI;

import Game.CheckerPlay;
import Game.ChestBoard;
import sun.util.resources.cldr.pa.CurrencyNames_pa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
import java.util.List;

/**
 * Created by yueshu on 5/4/18.
 * This class will create the Jframe and add all elements (checker board)
 */
public class BoardManager extends JFrame implements ActionListener{
    private int[] _currentStep;
    private CheckerPlay _play;
    private MoveList _moveList;
    private CheckersGUI _checkersGUI;
    private int[] turn = new int[1];
    private JFrame jf;
    private Button nextButton;
    private Button previousButton;

    BoardManager(MoveList moveList) {
        _currentStep = new int[]{1};
        turn[0] = 1;
        _play = new CheckerPlay();
        _moveList = moveList;
        _moveList.getBoardRecordList().add(new ChestBoard(_play.get_chestBoard()));
        _checkersGUI = new CheckersGUI(_currentStep, moveList);
        _checkersGUI.setBounds(50,50,320, 320);
        jf = new JFrame();
        nextButton = new Button("Next");
        nextButton.addActionListener(this);

        nextButton.setFont(new Font("Arial", Font.PLAIN, 20));
        nextButton.setBounds(440,100, 100, 50);
        previousButton = new Button("Previous");
        previousButton.setBounds(440,300, 100, 50);
        previousButton.setFont(new Font("Arial", Font.PLAIN, 20));
        previousButton.addActionListener(this);
        jf.getContentPane().setBackground(new Color(169, 181, 218));
        jf.setTitle("ChestGame ");
        jf.setSize(600, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.add(_checkersGUI);
        jf.add(nextButton);
        jf.add(previousButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == nextButton) {
            hitNextButton();
        } else if (source == previousButton) {
            hitPreviousButton();
        }
    }

    private void hitNextButton() {

        if (_currentStep[0] >= _moveList.getMoveList().size()) {
            JOptionPane.showMessageDialog(null, "No Next Step, you can click previous", "Alert: " , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (_moveList.getBoardRecordList().size() > _currentStep[0]) {
            _play.set_chestBoard(_moveList.getBoardRecordList().get(_currentStep[0]));
        } else {
            List<Integer> step = _moveList.getMoveList().get(_currentStep[0]);
            //if the current step is valid
            if (_play.movePiece(_play.get_chestBoard(), turn[0], step.get(0) / 8, step.get(0) % 8, step.get(1) / 8, step.get(1) %8)) {
                turn[0] *= -1;
            } else {
                JOptionPane.showMessageDialog(null, step.get(0) + " to "+ step.get(1) + " is not Valid Move!!!", "Alert: " , JOptionPane.INFORMATION_MESSAGE);
            }
            _play.resetMoveable();
            _play.findAllMovable(turn[0]);
            _moveList.getBoardRecordList().add(new ChestBoard(_play.get_chestBoard()));
        }
        _checkersGUI.repaint();
        _currentStep[0]++;

        //pop out box to let user know if there is a winner
        if (_play.get_chestBoard().getBlackPiece() == 0) {
            JOptionPane.showMessageDialog(null, "White Checker Win the Game", "Game Over: " , JOptionPane.INFORMATION_MESSAGE);
        }
        if (_play.get_chestBoard().getWhitePiece() == 0) {
            JOptionPane.showMessageDialog(null, "Black Checker Win the Game", "Game Over: " , JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void hitPreviousButton() {
        if (_currentStep[0] == 1) {
            JOptionPane.showMessageDialog(null, "No Previous Step, you can click next button", "Alert: " , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        _currentStep[0]--;
        _play.set_chestBoard(_moveList.getBoardRecordList().get(_currentStep[0] - 1));
        _checkersGUI.repaint();
    }
}
