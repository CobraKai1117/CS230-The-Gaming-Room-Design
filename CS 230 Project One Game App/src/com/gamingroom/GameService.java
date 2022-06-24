package com.gamingroom;
import com.gamingroom.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {
	
	private static GameService instance = new GameService(); // here we are creating an instance of the class. This will be the single instance of this class.

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();
	
	

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextPlayerId = 1;
	private static long nextTeamId = 1;
	
	private static GameService service() 
	{ 
		return instance;
		
	}

	private GameService() { } // For this pattern to work, this class needs to not return anything. So we need to have an empty constructor. This could either be created by us or created automatically by the program when it runs
	
	public static GameService getGameInstance() { return instance;} // This is the only entry point that can be used to get an instance of this class. Since the method is static, it will only return one instance of this class. Hence allowing the singleton pattern to be used.
// The singleton pattern is used to ensure that there is only one instance of a class. It can be useful if you want to manage the functionality of an instance of something. It also encapsulates and limits who/what can access the instance. 

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) 
	{

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		
		Iterator<Game> gamesIterator = games.iterator(); // This Iterator gives the games List the ability to traverse through the list with its own special implementations. 
		//Using an iterator abstracts how the collection is being navigated and encapsulates the data limiting the information other parts of the program can see regarding this collection
		
		System.out.println(games.size());
		
		while(gamesIterator.hasNext()) // While there is an element that needs to be searched, this will keep going and examine the next element in the collection.
		{ Game currentGame = gamesIterator.next(); // The current game is the next item waiting to be searched.
		if(currentGame.name == name) {System.out.println("Game with this name Already Exists"); return currentGame;} // If the name of the current game is equal to the name passed into the method, return that current game.
		
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
			System.out.println("Game Added");
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;
		Iterator<Game> gamesIterator = games.iterator();// This Iterator gives the games List the ability to traverse through the list with its own special implementations. 
		//Using an iterator abstracts how the collection is being navigated and encapsulates the data limiting the information other parts of the program can see regarding this collection
		
		while(gamesIterator.hasNext()) 
		{ Game currentGame = gamesIterator.next();
		if(currentGame.getId() == id) {System.out.println("Game with this Id Already Exists"); game = currentGame;}
		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
	Iterator<Game> gamesIterator = games.iterator();
		
		while(gamesIterator.hasNext()) 
		{ Game currentGame = gamesIterator.next();
		if(currentGame.name == name) {System.out.println("Game with this name Already Exists"); game = currentGame;}
		}
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	public long getNextPlayerId() 
	{ 
		return 0;
	}
	
	public long getNextTeamId() 
	{ 
		return 0;
	}
	

}


