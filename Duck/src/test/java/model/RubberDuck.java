package model;

public class RubberDuck extends Duck{
	public RubberDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String property = "ПрЅє";
		String display = super.display();
		return property + display;
	}
}