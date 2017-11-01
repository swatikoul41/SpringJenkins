package beans;
public class Car {
 
	 private String carname;
	 private Engine engine;
	 
	public void setCarnames(String carname) {
		this.carname = carname;
	}
	public void setEngines(Engine engine) {
		this.engine = engine;
	}
	 
	 public void carDetails()
	 {
			 System.out.println(carname);
		     System.out.println(engine.getModelyear());
		 
	 }
	}
	 

