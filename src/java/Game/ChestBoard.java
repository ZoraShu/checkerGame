package Game;

/**
 * Created by yueshu on 5/4/18.
 */
public class ChestBoard {
    int blackPiece;
    int whitePiece;
    Square[][] squareArray;

    public ChestBoard() {
        squareArray = new Square[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squareArray[i][j] = new Square();
            }
        }
    }

    public ChestBoard(ChestBoard _chestBoard) {
        squareArray = new Square[8][8];
        for (int i = 0; i < _chestBoard.squareArray.length; i++) {
            for (int j = 0; j < _chestBoard.squareArray[i].length; j++) {
                    Square square = new Square(_chestBoard.squareArray[i][j]);
                    squareArray[i][j] = square;
            }
        }
        blackPiece = _chestBoard.getBlackPiece();
        whitePiece = _chestBoard.getWhitePiece();
    }

    public boolean addPiece(int row, int col, Piece piece) {
        if (validPosition(row, col) && squareArray[row][col].getpiece() == null) {
            squareArray[row][col].setpiece(piece);

            if (squareArray[row][col].setpiece(piece).getOwnerType() == -1) {
                whitePiece++;
            } else {
                blackPiece++;
            }

            return true;
        }
        return false;
    }

    public Piece removePiece(int row, int col) {
        if (!validPosition(row,col) || squareArray[row][col].getpiece() == null) {
            return null;
        }
        Piece result = squareArray[row][col].getpiece();
        if (result.getOwner() == -1) {
            whitePiece--;
        } else {
            blackPiece--;
        }
        squareArray[row][col].setpiece(null);
        return result;
    }

    public Piece getPiece(int row, int col) {
        if (validPosition(row,col) && squareArray[row][col] != null) {
            return squareArray[row][col].getpiece();
        }
        return null;
    }
    public int geOwnerType(int row, int col) {
        if (validPosition(row,col) && squareArray[row][col].getpiece() != null) {
            return squareArray[row][col].getOwnerType();
        }
        return -2;
    }

    public boolean getCrownedStatus(int row, int col) {
        if (validPosition(row,col) && squareArray[row][col].getpiece() != null) {
            return squareArray[row][col].getCrowedStatus();
        }
        return false;
    }

    private boolean validPosition(int i, int j) {
        if (i >= 8 || i < 0 || j >= 8 || j < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean movable(int row, int col) {
        return squareArray[row][col].isMoveable();
    }

    public Square[][] getSquareArray() {
        return squareArray;
    }

    public int getBlackPiece() {
        return blackPiece;
    }

    public int getWhitePiece() {
        return whitePiece;
    }
}
