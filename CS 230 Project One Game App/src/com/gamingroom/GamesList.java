package com.gamingroom;

public class GamesList implements List<Game> 

{
	private Game[] games;
	
	public GamesList(Game[] games) 
	{
		this.games = games;
	}
	
	public Iterator<Game> iterator()
	{ 
		
		return new GameIterator(games); 
	}


}
