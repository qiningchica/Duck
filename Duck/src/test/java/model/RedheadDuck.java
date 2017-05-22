package model;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String property = "ºìÍ·";
		String display = super.display();
		return property + display;
	}
}