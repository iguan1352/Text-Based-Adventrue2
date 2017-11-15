package gameboard;

import obstacles.Room;
import people.Player;

public class Board 
{

	private Room[][] mazeMap;
	
	public Board(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
	
	public void printMaze(Player player)
	{
		for(int i = 0; i < mazeMap.length; i++) 
        {
            for (int j = 0; j < mazeMap[i].length; j++)
            {
            	if(player.getX() == i && player.getY() == j)
            	{
            		System.out.print("[ U ]");
            	}
            	else
            	{
            		mazeMap[i][j].print(); //the print method is in the Wall class
            	}
            }
            System.out.println();
        }
	}
	
	public Room[][] getMazeMap() 
	{
        return mazeMap;
	}
	
	public void setMaze(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
}
	

