class Shape{
	void draw() {
		System.out.println("Drawing Shape ");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shape = {new Circle(), new Rectangle(), new Triangle() };
		for (Shape s: shape) {
			s.draw();
		}

	}

}
