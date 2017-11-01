package beans;
public class Car {
 
	 private String[] carnames;
	 private Engine[] engines;
	 
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	 
	 public void carDetails()
	 {
		 for(String car:carnames)
		 {
			 System.out.println(car);
		 }
		 
		 for(Engine e:engines)
		 {
			 System.out.println(e.getModelyear());
		 }
	 }
	}
	 

