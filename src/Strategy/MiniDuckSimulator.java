package Strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.setQuackBehavior(new MuteQuack());
		
		model.performFly();
		model.performQuack();
	}
}
