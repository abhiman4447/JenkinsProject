package testProject;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}

class Singleton{
	
	private static Singleton singleton;
	
	private Singleton() {
		//database code
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
			return singleton; 
		}
		return singleton;	
	}
	
	
}

class Database{
	public Database() {
		
	}
}
