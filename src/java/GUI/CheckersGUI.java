package GUI;
import Game.CheckerPlay;
import Game.ChestBoard;
import Game.Piece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.List;

/**
 * Created by yueshu on 5/4/18.
 * This class will paint the checker board
 */
public class CheckersGUI extends JPanel {
    int[] _curStep;
    MoveList _moveList;

    CheckersGUI(int[] curStep, MoveList moveList) {
        _curStep = curStep;
        _moveList = moveList;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x;
        int y;

        for (int row = 0;  row < 8;  row++ )
        {
            for (int col = 0;  col < 8;  col++)
            {
                x = col * 40;
                y = row * 40;
                if ( (row % 2) == (col % 2) )
                    g.setColor(new Color(171, 215, 218));
                else
                    g.setColor(new Color(218, 196, 146));
                g.fillRect(x, y, 40, 40);
            }
        }

        for (int i = 0;  i < 8;  i++ ) {
            for (int j = 0;  j < 8;  j++) {
                x = i * 40;
                y = j * 40;

                Piece piece = _moveList.getBoardRecordList().get(_curStep[0] - 1).getPiece(i, j);

                if (piece != null && piece.getOwner() == 1 && piece.isCrowed() == true) {
                    draw(g, y, x, 40, 40,"blackCrowned.png");
                } else if (piece != null && piece.getOwner() == 1) {
                    draw(g, y, x,40, 40, "black.png");

                } else if (piece != null && piece.getOwner() == -1 && piece.isCrowed() == true) {
                    draw(g, y, x, 40, 40, "redCrowned.png");

                } else if (piece != null && piece.getOwner() == -1){
                    draw(g, y, x, 40, 40, "red.png");
                }

                List<Integer> curStepList = _moveList.getMoveList().get(_curStep[0] - 1);
                if (curStepList.get(0) != -1 && curStepList.get(0) / 8 == i
                        && curStepList.get(0) % 8 == j) {
                    draw(g, y, x, 40, 40, "curPos.png");
                }

                if (curStepList.get(0) != -1 && curStepList.get(1) / 8 == i
                        && curStepList.get(1) % 8 == j) {
                    draw(g, y, x, 40, 40, "toGo.png");


                }
                if (_moveList.getBoardRecordList().get(_curStep[0] - 1).movable(i,j)) {
                    draw(g, y, x, 40, 40, "movable.png");
                }
            }
        }
    }

    private void draw(Graphics g, int x, int y, int width, int height, String pic) {
        try {
            BufferedImage image = ImageIO.read(new File("/Users/yueshu/Documents/OOP/checkers/src/" + pic));
            g.drawImage(image, x, y, width, height, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
