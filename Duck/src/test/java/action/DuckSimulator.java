package action;

import model.Duck;
import model.FlyNoWay;
import model.FlyWithRocket;
import model.FlyWithWings;
import model.MallardDuck;
import model.MuteQuack;
import model.Quack;
import model.RedheadDuck;
import model.RubberDuck;
import model.Squeak;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//“∞—º≤‚ ‘
		Duck mallard = new MallardDuck();
		String property1 = mallard.display();
		mallard.setQuackBehavior(new Quack());
		String quack1 = mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		String fly1 = mallard.performFly();
		System.out.println(property1 + quack1 + "≤¢«“" + fly1 + "∑…");
		
		
		//œΩ∫—º≤‚ ‘
		Duck rubber = new RubberDuck();
		String property2 = rubber.display();
		rubber.setQuackBehavior(new Squeak());
		String quack2 = rubber.performQuack();
		rubber.setFlyBehavior(new FlyNoWay());
		String fly2 = rubber.performFly();
		System.out.println(property2 + quack2 + "≤¢«“" + fly2 + "∑…");
		
		//∫ÏÕ∑—º≤‚ ‘
		Duck redhead = new RedheadDuck();
		String property3 = redhead.display();
		redhead.setQuackBehavior(new MuteQuack());
		String quack3 = redhead.performQuack();
		redhead.setFlyBehavior(new FlyWithRocket());
		String fly3 = redhead.performFly();
		System.out.println(property3 + quack3 + "≤¢«“" + fly3 + "∑…");
	}

}
