package GUI;


import javax.swing.*;

/**
 * Created by yueshu on 5/4/18.
 * This is the main function for the checker game
 */
public class ChestGame extends JFrame {
    public static void main(String[] args) {
        MoveList moveList = new MoveList("\\Users\\yueshu\\Documents\\OOP\\checkers\\src\\input.txt");
        BoardManager manager = new BoardManager(moveList);
    }
}
