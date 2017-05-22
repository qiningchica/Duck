package model;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithRocket();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String property = "Ұ��";
		String display = super.display();
		return property + display;
	}
}
