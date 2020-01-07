package de.unistuttgart.iste.rss.pse.exercise10.homework.hamster;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Write a description of class SortingHamsterGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingHamsterGame extends SimpleHamsterGame {

	public SortingHamsterGame() {
		File terFile = new File("territories/sorting.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		game.displayInNewGameWindow();
	}

	@Override
	protected void run() {
		// call your sorting method here
	}

	public static void main(String[] args) {
		SortingHamsterGame sortingHamsterGame = new SortingHamsterGame();
		sortingHamsterGame.game.startGame(false);
		sortingHamsterGame.doRun();
		sortingHamsterGame.game.stopGame();
	}
}
