package company.Ajacs;
class Engine{
	int horsepower;
	String fuelType;
	public void start() {
		System.out.println("Engine start");
	}
	public void stop() {
		System.out.println("Engine stop");
	}
}
class Cars{
	private Engine engin;
	private String fuelType;
	private int horsepower;
	public Cars(String fuelType,int horsepower,Engine engine) {
		this.fuelType=fuelType;
		this.engin=engine;
		this.horsepower=horsepower;
		
	}
	
	public void start() {
		System.out.println("car Engine start"+fuelType);
		engin.start();
	}
	public void stop() {
		System.out.println("car Engine stop"+horsepower);
		engin.stop();
	}
	
	
}
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e=new Engine();
		Cars c=new Cars("Petrol",74,e);
		c.start();
		c.stop();
	}

}
