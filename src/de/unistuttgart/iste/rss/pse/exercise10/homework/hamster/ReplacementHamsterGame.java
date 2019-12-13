package de.unistuttgart.iste.rss.pse.exercise10.homework.hamster;


import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Write a description of class SortingHamsterGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ReplacementHamsterGame extends SimpleHamsterGame {

    public ReplacementHamsterGame() {
    	File terFile = new File("territories/rotate.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		game.displayInNewGameWindow();

    }

    @Override
    protected void run(){
        // call your rotatin method here
    }

    public void main(){
        game.startGame(false);
        doRun();
        game.stopGame();
    }

    public void rotate180() {
    }

    public void rotate90() {
    }
}
