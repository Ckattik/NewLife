package startegyPattern;

public class BluDuck extends Duck{

	public BluDuck() {
		gavBehavior = new Gav();
	}
	
	
	@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("I am a BlueDuck");
}
}
