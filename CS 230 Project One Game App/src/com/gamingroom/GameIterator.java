package com.gamingroom;

public class GameIterator implements Iterator<Game>  // This takes the operations created in the Iterator class and overwrites it with customized behavior.
{
	private Game[] games;
	private int position;
	
	public GameIterator(Game[] games) 
	{	this.games = games;
		position = 0;
	
	}
	
	public void reset() { position = 0;}
	
	public Game currentItem() { return games[position];}
	
	public Game next() {return games[position+1];}
	
	public boolean hasNext() 
	{
		if(position >= games.length) {return false;} 
		
		return true;
	}
	
	
}
