package com.gamingroom;
import com.gamingroom.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	private static long id = 1;
	String name;
	
	private List<Player> players = new ArrayList<Player>();
	
	public Player addPlayer(String name) 
	{ 
		
		Player player = null;
		Iterator<Player> playerIterator = players.iterator();
		
		while(playerIterator.hasNext()) 
		{
			Player currentPlayer = playerIterator.next(); 
			if(currentPlayer.name == name) {System.out.println("Player with this name already exists"); return player;}
		
		}
		
		if(player == null) { player = new Player(id++,name); players.add(player); System.out.println("Player Added");}
		
		return player;
		
	}
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id,name);
	}
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
