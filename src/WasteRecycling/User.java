package WasteRecycling;

public class User {
	User(String name, String age, String id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	String name;
	String age;
	String id;
	public Boolean Login(String username,String password)
	{
		
		Boolean islogin=false;
		if(islogin)
		{
			System.out.println("User is Login");
		}
		else {
			System.out.println("User needs to be registered");
		}
		return islogin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	 
	
}
