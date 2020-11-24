package homework02;

public class Rectangle {
	
	private int length;
	private int width;
	

	Rectangle (){
		this.length = 10;
		this.width = 7;
	}


	Rectangle (int length, int width){
		this.length = length;
		this.width = width;
	}
	
	
	public int square() {
		
		return length * width;
	}

	public int perimeter(){
		
		return length * 2 + width * 2;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
