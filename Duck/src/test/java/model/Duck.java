package model;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public String swim(){
		return "��Ӿ";
	}
	
	public String display(){
		return "Ѽ ";
	}
	
	public String performQuack(){
		return quackBehavior.quack();
	}
	
	public String performFly(){
		return flyBehavior.fly();
	}
	
	public void setQuackBehavior(QuackBehavior behavior){
		this.quackBehavior = behavior;
	}
	
	public void setFlyBehavior(FlyBehavior behavior){
		this.flyBehavior = behavior;
	}
}
