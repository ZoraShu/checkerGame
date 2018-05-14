package Game;

/**
 * Created by yueshu on 5/4/18.
 */
public class Square {
    private Piece _piece;
    private boolean moveable;
    Square () {

    }
    Square(Square square) {
        if (square._piece != null) {
            _piece = new Piece().setCrowed(square.getCrowedStatus()).setOwner(square.getOwnerType());
            moveable = square.moveable;
        } else {
            _piece = null;
        }
    }

    public Piece getpiece() {
        return _piece;
    }

    public Square setpiece(Piece piece) {
        _piece = piece;
        return this;
    }

    public int getOwnerType() {
        return _piece.getOwner();
    }
    public boolean getCrowedStatus() {
        if (_piece == null) {
            return false;
        } else {
            return _piece.isCrowed();
        }
    }

    public boolean isMoveable() {
        return moveable;
    }

    public void setMoveable(boolean moveable) {
        this.moveable = moveable;
    }
}
