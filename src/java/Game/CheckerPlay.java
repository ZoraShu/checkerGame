package Game;

import GUI.MoveList;

/**
 * Created by yueshu on 5/4/18.
 */
public class CheckerPlay {
    private ChestBoard _chestBoard;
    //array helps for initiating position for checkers
    public static final boolean[][] Init_SQUARE = new boolean[][]{
            {false, true, false, true,false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false}};

    public CheckerPlay() {
        _chestBoard = new ChestBoard();
        Piece tempPiece;
        for (int p = 0; p < 8; p++) {
            for (int q = 0; q < 8; q++) {
                if (p <= 2 && Init_SQUARE[p][q]) {
                    tempPiece = new Piece().setCrowed(false).setOwner(-1);
                    _chestBoard.addPiece(p, q, tempPiece);
                }

                if (p > 4 && Init_SQUARE[p][q]) {
                    tempPiece = new Piece().setCrowed(false).setOwner(1);
                    _chestBoard.addPiece(p, q, tempPiece);
                }
            }
        }
        _chestBoard.getSquareArray()[5][0].setMoveable(true);
        _chestBoard.getSquareArray()[5][2].setMoveable(true);
        _chestBoard.getSquareArray()[5][4].setMoveable(true);
        _chestBoard.getSquareArray()[5][6].setMoveable(true);

    }

    public boolean movePiece (ChestBoard chestBoard, int turn, int row, int col, int toGoRow, int toGoCol) {
        int owner = chestBoard.geOwnerType(row, col);
        boolean crowed = chestBoard.getCrownedStatus(row, col);

        //If the current position or togo Position is out of board or they are the same position return false
        if (turn != owner || !validPosition(row, col) || !validPosition(toGoRow, toGoCol)) {
            return false;
        }
        //if the togo position is one step away from the current position, call validSingleMove
        if (Math.abs(toGoCol - col) == 1 && (Math.abs(toGoRow - row) == 1)) {
            if (!validSingleMove(chestBoard, row, col, toGoRow, toGoCol)) {
                return false;
            }
            //if the togo position is larger than one step away from the current position, call validMutliMove
        } else if (Math.abs(toGoCol - col) > 1 || (Math.abs(toGoRow - row) > 1)) {
            if (!validMutliMove(chestBoard, owner, crowed, row, col, toGoRow, toGoCol)) {
                return false;
            }
        } else {
            return false;
        }
        Piece temp = chestBoard.removePiece(row, col);
        chestBoard.addPiece(toGoRow, toGoCol, temp);

        // check if checker is crowed after move
        if ((owner == 1 && toGoRow == 0) || (owner == -1 && toGoRow == 7)) {
            chestBoard.getPiece(toGoRow, toGoCol).setCrowed(true);
        }

        return true;
    }

    public boolean validSingleMove(ChestBoard chestBoard, int row, int col, int toGoRow, int toGoCol) {
        if (validPosition(row, col) && validPosition(toGoRow, toGoCol) &&!isEmpty(row, col) && isEmpty(toGoRow, toGoCol)) {
            //find out the directory by checking the row difference
            int dif = row - toGoRow;
            boolean crowed = chestBoard.getCrownedStatus(row, col);
            int owner =  chestBoard.geOwnerType(row, col);

            if (crowed || owner * dif > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean validMutliMove(ChestBoard chestBoard, int owner, boolean crowed, int row, int col, int toGoRow, int toGoCol) {
        System.out.println(owner + " : "+ row + col + toGoRow + toGoCol);
        if ((toGoRow == row) && (toGoCol == col) ) {
            return true;
        } else if (!validPosition(row, col) || !validPosition(toGoRow, toGoCol)) {
            return false;
        }
        //white checker or crowed go up
        if (crowed || owner == 1) {
            if (validPosition(row - 1, col + 1) && validPosition(row - 2, col + 2) && !isEmpty(row - 1, col + 1)
                    && chestBoard.getPiece(row - 1, col + 1).getOwner() != owner && isEmpty(row - 2, col + 2)) {
                Piece temp = chestBoard.removePiece(row - 1, col + 1);
                if (validMutliMove(chestBoard, owner, crowed, row - 2,col + 2, toGoRow, toGoCol)) {
                    System.out.println("go up");
                    return true;
                };
                chestBoard.addPiece(row - 1, col + 1, temp);
            }

            if (validPosition(row - 1, col - 1) && validPosition(row - 2, col - 2) && !isEmpty(row - 1, col - 1)
                    && chestBoard.getPiece(row - 1, col - 1).getOwner() != owner && isEmpty(row - 2, col - 2)) {
                System.out.println("row - 1" + (row - 1) + "col - 1" + (col - 1) + "content :" + chestBoard.getPiece(row- 1, col - 1).getOwner());
                Piece temp = chestBoard.removePiece(row - 1, col - 1);
                if (validMutliMove(chestBoard, owner, crowed, row - 2, col - 2, toGoRow, toGoCol)) {
                    System.out.println("go up right");
                    return true;
                };
                chestBoard.addPiece(row - 1, col - 1, temp);
            }
        }
        //black checker or crowed go down
        if (crowed || owner == -1) {
            if (validPosition(row + 1, col + 1) && validPosition(row + 2, col + 2) && !isEmpty(row + 1, col + 1)
                    && chestBoard.getPiece(row + 1, col + 1).getOwner() != owner && isEmpty(row + 2, col + 2)) {
                Piece temp = chestBoard.removePiece(row + 1, col + 1);
                if (validMutliMove(chestBoard, owner, crowed, row + 2, col + 2, toGoRow, toGoCol)) {
                    System.out.println("go up down");
                    return true;
                };
                chestBoard.addPiece(row + 1, col + 1, temp);
            }

            if (validPosition(row + 1, col - 1) && validPosition(row + 2, col - 2) && !isEmpty(row + 1, col - 1)
                    && chestBoard.getPiece(row + 1, col - 1).getOwner() != owner && isEmpty(row + 2, col - 2)) {
                Piece temp = chestBoard.removePiece(row + 1, col - 1);
                if (validMutliMove(chestBoard, owner, crowed, row + 2, col - 2, toGoRow, toGoCol)) {
                    System.out.println("go up down right");
                    return true;
                };
                chestBoard.addPiece(row + 1, col - 1, temp);
            }
        }
        return false;
    }

    public boolean isEmpty(int row, int col) {
        return _chestBoard.getPiece(row, col) == null;
    }

    private boolean validPosition(int i, int j) {
        if (i >= 8 || i < 0 || j >= 8 || j < 0) {
            return false;
        }
        return true;
    }

    public ChestBoard get_chestBoard() {
        return _chestBoard;
    }

    public void set_chestBoard(ChestBoard _chestBoard) {
        this._chestBoard = _chestBoard;
    }

    public void findAllMovable(int turn) {
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j++) {
                ChestBoard temp = new ChestBoard(_chestBoard);
                if ( temp.getSquareArray()[i][j].getpiece() != null && temp.getSquareArray()[i][j].getOwnerType() == turn) {
                    System.out.println("Try move" + i + j);

                    if (validSingleMove(temp, i, j, i - 1, j - 1) || validSingleMove(temp, i, j, i + 1, j - 1)
                            || validSingleMove(temp, i, j, i -1, j + 1) || validSingleMove(temp, i, j, i + 1, j + 1)) {
                        _chestBoard.getSquareArray()[i][j].setMoveable(true);
                        continue;
                    }
                    boolean crowned = _chestBoard.getCrownedStatus(i, j);

                    if (validMutliMove(temp, turn, crowned, i, j, i + 2, j - 2)
                            || validMutliMove(temp, turn, crowned, i, j, i - 2, j - 2)
                            || validMutliMove(temp, turn, crowned, i, j, i + 2, j + 2)
                            || validMutliMove(temp, turn, crowned, i, j, i - 2, j + 2) ){
                        _chestBoard.getSquareArray()[i][j].setMoveable(true);
                        continue;
                    }
                }
            }
        }
    }

    public void resetMoveable(ChestBoard chestBoard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j ++) {
                _chestBoard.getSquareArray()[i][j].setMoveable(false);
            }
        }
    }
}
