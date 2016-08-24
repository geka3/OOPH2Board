package net.ukr.geka3;

public class Point {
	private double x;
	private double y;
	
	
	public Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Point() {
		super();
	}


	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
