package people;

public class Player implements Person
{	
	private  int positionX;
	private  int positionY;
	
	public Player(int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}

	//sets x-coordinate
	public void setX(int x)
	{
		this.positionX = x;
		
	}
	
	//sets y-coordinate
	public void setY(int y)
	{
		this.positionY = y;
		
	}
	
	//gets x-coordinate
	public int getX()
	{
		return positionX;
	}
	
	//gets y-coordinate
	public int getY()
	{
		return positionY;
	}

	@Override
	public int movePlayer() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
