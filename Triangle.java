package net.ukr.geka3;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	
	

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	
	public Triangle() {
		super();
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ukr.geka3.Shape#getPerimetr()
	 */
	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return getDistance(a, b) + getDistance(b, c) + getDistance(a, c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ukr.geka3.Shape#getArea()
	 */
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimetr() / 2;
		return Math.sqrt(p * (p - getDistance(a, b)) * (p - getDistance(b, c)) * (p - getDistance(a, c)));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle, Perimetr=" + getPerimetr() + ", Area="
				+ getArea() + "]";
	}

	
}
