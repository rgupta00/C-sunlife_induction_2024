package lsp;
//Rectangle -> Square
/*
 * LSP
	when to go for inheritance and when to go for composition
	
	"Favour composition over inheritance"
 */
class Rectangle {
	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}
}

//class Square extends Rectangle {
//	public Square(int l) {
//		super(l, l);
//	}
//}

class Square{
	private Rectangle rectangle;
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	public void changeDimension(int l) {
		rectangle.setB(l);
		rectangle.setL(l);
	}
	public int calculateArea() {
		return rectangle.calculateArea();
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Square square=new Square(5);
		System.out.println(square.calculateArea());
		square.changeDimension(6);
		System.out.println(square.calculateArea());
		
//		Square square=new Square(5);
//		System.out.println(square.calculateArea());
		//square.setB(6);
		
		
	}
}

