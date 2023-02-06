
package method_overloading;


public class Distancebwpoint {
	private int x;
	private int y;
	
	public Distancebwpoint(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public double distance() {
	    return(Math.sqrt(x*x + y*y));
	}

	public double distance(Distancebwpoint point) {
	    int xDiff = x - point.x;
	    int yDiff = y - point.y;
	    return(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
	}

	public int getX() {
	    return x;
	}

	public int getY() {
	    return y;
	}

}
