package net.ukr.geka3;

public abstract class Shape {
	abstract double getPerimetr();
	abstract double getArea();
	
	static double getDistance(Point a, Point b){
		return Math.sqrt(Math.pow((a.getX()-b.getX()), 2) + Math.pow((a.getY()-b.getY()), 2));
	}
}
