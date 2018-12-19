

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import java.io.IOException;

/**
 * Write a description of class PainterPaule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheaterHamsterGame extends SimpleHamsterGame
{
    
    protected final MyCheaterHamster cheaterHamster;

    /**
     * Constructor for objects of class PainterPaule
     */
    public CheaterHamsterGame()
    {
        game.displayInNewGameWindow();
        try {
            game.initialize("/territories/empty.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        
        cheaterHamster = new MyCheaterHamster (game.getTerritory(), new Location(0,0), Direction.EAST,0);
    }
   
    
}
