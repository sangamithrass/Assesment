package method_overloading;

public class distance {
	public static void main(String[] args) {
		Distancebwpoint p1 = new Distancebwpoint(2, 3);
		System.out.println("The distance of p1 from origin is: " + p1.distance());
		Distancebwpoint p2 = new Distancebwpoint(5, 6);
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
		}
}