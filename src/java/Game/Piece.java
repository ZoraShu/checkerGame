package Game;

/**
 * Created by yueshu on 5/4/18.
 */
public class Piece {
    // 1 represent white, -1 represent black
    int owner;
    boolean crowed;

    public int getOwner() {
        return owner;
    }

    public Piece setOwner(int owner) {
        this.owner = owner;
        return this;
    }

    public boolean isCrowed() {
        return crowed;
    }

    public Piece setCrowed(boolean crowed) {
        this.crowed = crowed;
        return this;
    }
}
