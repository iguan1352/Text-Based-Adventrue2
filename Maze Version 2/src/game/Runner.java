package game;

import java.util.Scanner;

import gameboard.Board;
import obstacles.Room;
import people.Player;

 
public class Runner {

	public static void main(String[] args)
	{
		Room[][] map = new Room[6][5]; //change obstacle class to Room class
		Player player1 = new Player(0,0);
		
		for(int i = 0; i < map.length; i++)
		{
			Room[] row = map[i];
			for(int j = 0; j < row.length; j++)
			{
				row[j] = new Room(i,j,false);
			}
		}
		
		//create obstacle in runner
		Board mazeMap = new Board(map);
		System.out.println("Welcome to Leave the Maze." + "\nIn order to win you have to find the exit." +
				"\nOn your way, there would be walls which you would have to walk around.");
		Scanner in = new Scanner(System.in);
		//pause to get name and then display the maze
		boolean gameOn = true;
		
		//int[] wallLocations = {2,0,0,1};
		while(gameOn)
		{
			mazeMap.printMaze(player1); //prints player in starting position 
			System.out.println("You can move up, down, left, and right. Which direction do you want to move in. ");
			String direct = in.next(); //takes player's response
			
			//moves the player from place to place depending on the direction he/she wants to move in
			if(direct.toLowerCase().equals("left") && player1.getY() > 0)
			{
				player1.setY(player1.getY() - 1);
			}
			if(direct.toLowerCase().equals("right") && player1.getY()+1 < 5)
			{
				player1.setY(player1.getY() + 1);
			}
			if(direct.toLowerCase().equals("up") && player1.getX() > 0)
			{
				player1.setX(player1.getX() - 1);
			}
			if(direct.toLowerCase().equals("down") && player1.getX()+1 < 6)
			{
				player1.setX(player1.getX() + 1);
			}

			if(player1.getX() == 5 && player1.getY() == 4)
			{
				mazeMap.printMaze(player1); 
				System.out.println("You have reached the exit! CONGRATULATIONS!!!");
				gameOn = false;
			}
			
		}
		in.close(); 
		
	}

}
