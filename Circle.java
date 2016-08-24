package net.ukr.geka3;

public class Circle extends Shape {
	private Point c;
	private int r;

	
	
	
	

	public Circle() {
		super();
	}


	public Circle(Point c, int r) {
		// TODO Auto-generated constructor stub
		super();
		this.c = c;
		this.r = r;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ukr.geka3.Shape#getPerimetr()
	 */
	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 2* Math.PI * r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ukr.geka3.Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle: Perimetr()=" + getPerimetr() + ", Area()=" + getArea() + "]";
	}
	
	

	
}
