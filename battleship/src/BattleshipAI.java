/* Name: Phan Bảo Trân
 ID: ITDSIU21125
 Purpose: The BattleshipAI class is designed to interact with a game grid, tracking valid moves and selecting them as the game progresses. The createValidMoveList() method ensures that all grid positions are initially valid, and the reset() method allows the AI to start over if needed. The selectMove() method is a placeholder and can be extended to implement more sophisticated move selection logic, such as random selection or targeting based on previous hits and misses.
*/
import java.util.ArrayList;
import java.util.List;

public class BattleshipAI {
    protected List<Position> validMoves;
    protected SelectionGrid playerGrid;

    public BattleshipAI(SelectionGrid playerGrid) {
        this.playerGrid = playerGrid;
        createValidMoveList();
    }

    public Position selectMove() {
        return Position.ZERO;
    }

    public void reset() {
        createValidMoveList();
    }

    private void createValidMoveList() {
        validMoves = new ArrayList<>();
        for(int x = 0; x < SelectionGrid.GRID_WIDTH; x++) {
            for(int y = 0; y < SelectionGrid.GRID_HEIGHT; y++) {
                validMoves.add(new Position(x,y));
            }
        }
    }
}
