package WasteRecycling;
import WasteRecycling.User;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome to waste recyling system");
		User obj = new User("Jackie","23","01");
 		System.out.println(obj.getName()+" User age is: "+obj.getAge());
		obj.Login("Hajra", "123456");
		
	}

}
