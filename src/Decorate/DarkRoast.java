package Decorate;

public class DarkRoast extends Beverage {

	public DarkRoast()
	{
		description = "다 로스트 커피";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}

}
