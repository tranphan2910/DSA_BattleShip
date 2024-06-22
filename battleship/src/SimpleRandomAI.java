/* Name: Phan Bảo Trân
 ID: ITDSIU21125
 Purpose: The SimpleRandomAI class implements a simple random selection strategy for making moves in a Battleship game. By shuffling the list of valid moves both during initialization and reset, the AI ensures that its move selections are random. The selectMove() method retrieves the next move from the list, providing a straightforward and effective way to play the game without repeating moves. This random selection strategy makes the AI unpredictable and can be a useful baseline for more complex AI strategies.
*/
import java.util.Collections;

public class SimpleRandomAI extends BattleshipAI{
    
    public SimpleRandomAI(SelectionGrid playerGrid) {
        super(playerGrid);
        Collections.shuffle(validMoves);
    }

    @Override
    public void reset() {
        super.reset();
        Collections.shuffle(validMoves);
    }

    @Override
    public Position selectMove() {
        Position nextMove = validMoves.get(0);
        validMoves.remove(0);
        return nextMove;
    }
}
