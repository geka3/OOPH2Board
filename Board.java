package net.ukr.geka3;

import java.util.Arrays;

public class Board {
	private Shape[] item = new Shape[4];

	public Board() {
		super();

	}

	public void add(Shape a) {
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				item[i] = a;
				System.out.println("Shape is added to Board to " + i + " position");
				return;
			}
		}
		System.out.println("Shape is not added. the is not free posotion");
		return;
	}
	
	public void add(Shape sh, int i){
		if(item[i] == null){
			item[i] = sh;
		}else{
			System.out.println("place " + i + " is busy");
		}
	}

	public void delete(int i) {
		if (item[i] == null) {
			System.out.println("there is not Shape at " + i + "position");
			return;
		}
		item[i] = null;
		System.out.println("Shape at index " + i + " was deleted");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		double sumArea = 0.0;
		result.append("Board info: " + System.lineSeparator());
		for (int i = 0; i < item.length; i++) {
			
			result.append(i +". " +  item[i] + System.lineSeparator());
			if(item[i] != null ){
				
				sumArea += item[i].getArea();
			}
			
		}
		return result.toString() + System.lineSeparator() + "SumArea is " + sumArea + System.lineSeparator();
	}

}
