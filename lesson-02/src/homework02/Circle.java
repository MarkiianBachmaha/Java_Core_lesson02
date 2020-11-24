package homework02;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle(){
		this.radius = 2.6;
		this.diameter = radius * 2;
	}
	
	Circle(double radius){
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	
public double circleSquare() {
		
		return diameter * diameter / 4 * 3.14;
	}

	public double circleLengt(){
		
		return 2 * 3.14 * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}

}
