package l_9_t_2;

public class CircleAndSphere {
	final double PI = 3.142;
	private int Radius ;
	
	public void setRadius(int Radius) {
		this.Radius = Radius;
	}
	
	public void getCircumferenceOfCircle() {
		System.out.println("Circumference Of Circle Is : " + (2 * PI * Radius));
	}
	
	public void getAreaOfCircle() {
		System.out.println("The Area Of Circle Is : " + (PI * Radius * Radius));
	}
	public void getVolumeOfSphere() {
		System.out.println("The Volume Of Sphere Is : " + (4/3 * PI * Radius * Radius * Radius));
	}
	public void getSurfaceAreaOfSphere() {
		System.out.println("The Volume Of Sphere Is : " + (4 * PI * Radius * Radius ));
	}
	
	public static void main(String[] args) {
		CircleAndSphere Circle = new CircleAndSphere();
		Circle.setRadius(12);
		Circle.getCircumferenceOfCircle();
		
		Circle.setRadius(22);
		Circle.getAreaOfCircle();
		
		CircleAndSphere Sphere = new CircleAndSphere();
		Sphere.setRadius(20);
		Sphere.getVolumeOfSphere();
		
		Sphere.setRadius(01);
		Sphere.getSurfaceAreaOfSphere();
		
	}
}

