package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity
{
	
	private static long id = 1;
	String name;
	
	private List<Team> teams = new ArrayList<Team>();
	
	public Team addTeam(String name) 
	{ 	
		Team team = null;
		
		Iterator<Team> teamsIterator = teams.iterator();
		
		while(teamsIterator.hasNext()) 
		{ 
			Team currentTeam = teamsIterator.next();
			if (currentTeam.name == name) {System.out.println("Team with this name already exists!"); return currentTeam;}
			
		}
		
		if(team == null) { team = new Team(id++,name); teams.add(team); System.out.println("Team Added");}

		
		return team;
	}
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) 
	{
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
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
