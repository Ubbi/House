import org.bukkit.Location;

public class House{

	private Location location;
	private int length, width, height;
	private double x, y, z;

	public void House(){
	}

	public void setDimensions(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHouseLocation(Location location){
		this.location = location;
	}
	
	public double getHouseX(){
		x = location.getX();
		return x;
	}
	public double getHouseY(){
		int y = location.getY();
		return y;
	}
	public double getHouseZ(){
		int z = location.getZ();
		return z;
	}
		
	
}