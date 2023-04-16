class Point extends Object {
	Point(){}
	int x; 
	int y; 
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x:" + x + ", y :" + y;
	}	
}

class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z) {
//		super();
//		this.x = x;
//		this.y= y;
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return "x:" + x + ", y :" + y+ ",z: "+ z;
	}
}


public class superTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
