package beans;
public class Test
{

	public String gender;
	
    public void setGender(String gender) {
		this.gender = gender;
	}

    public void hello(String name)
    {
	System.out.println("Hello "+gender+" "+name);
    }
}
