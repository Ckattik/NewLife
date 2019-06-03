package startegyPattern;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	GavBehavior gavBehavior;
	
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void perfomQuack() {      
		quackBehavior.quack();       // Обьект Duck делегирует свое поведение обьекту на который ссылаеться quackBehavior() 
	}
	
	public void swim() {
	
		System.out.println("All ducks float, evendecoys!");
	}
	
	
	
	public void perfomFly() {
		flyBehavior.fly();
		
	}
	
	public void perfomGav() {
		gavBehavior.gav();
	}
	
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void setGavBehavior(GavBehavior gb) {
		gavBehavior = gb;
	}
	
}
