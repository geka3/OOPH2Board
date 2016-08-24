package net.ukr.geka3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Circle circle = new Circle(new Point(2,5),6);
		Circle circleTwo = new Circle(new Point(2,5),5);
		Square square = new Square(new Point(0,0),new Point(10,0),new Point(10,10),new Point(0,10));
		Triangle triangle = new Triangle(new Point(1,5),new Point(4,8),new Point(8,3));
		
		board.add(circle);
		board.add(triangle);
		board.add(circle);
		board.add(square);
		board.add(triangle);
		System.out.println(board.toString());
		board.delete(2);
		
		board.add(circleTwo, 2);
		board.add(circleTwo, 2);
		
		System.out.println(board.toString());
		
		board.add(triangle);
		
		System.out.println(board.toString());
	}

}
