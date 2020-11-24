package homework02;

public class Homework02 {
	
public static void main(String[] args) {
		
		int length1 = 13;
		int width1 = 15;
		
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(length1, width1);
		
		
		System.out.println("Площа прямокутника 1 = " + r1.square() + ";");
		System.out.println("Периметр прямокутника 1 = " + r1.perimeter() + ";");
		System.out.println("");
		
		System.out.println("Площа прямокутника 2 = " + r2.square() + ";");
		System.out.println("Периметр прямокутника 2 = " + r2.perimeter() + ";");
		System.out.println();
		
		
		double radius = 3.35;
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(radius);
		
		System.out.println("Площа кола 1 = " + c1.circleSquare() + ";");
		System.out.println("Довжина кола 1 = " + c1.circleLengt() + ";");
		System.out.println();
		
		System.out.println("Площа кола 2 = " + c2.circleSquare() + ";");
		System.out.println("Довжина кола 2 = " + c2.circleLengt() + ";");
		System.out.println();
	}

}
