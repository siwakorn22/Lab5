
public class Rectangle {
	private static Rectangle instance;
	private int width;
	private int height;
	
	private Rectangle() {};
	
	public static Rectangle getInstance(){
		if(instance == null){
		return new Rectangle();
		}
		return instance;
	}

	public void setWidthHeight(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea(){
		return this.width*this.height;
	}
}
