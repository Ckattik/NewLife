package startegyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Duck mallard = new MallardDuck();
		mallard.perfomQuack();
		mallard.perfomFly();
		
		
		Duck model = new ModelDuck();
		model.perfomFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.perfomFly();
		
		model.perfomQuack();
		
		System.out.println();
		System.out.println();
		
		Duck blueDuck = new BluDuck();
		blueDuck.perfomGav();
	   
	}

}
