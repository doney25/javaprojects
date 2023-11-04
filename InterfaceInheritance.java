package javalab;

public class InterfaceInheritance {
	public static void main(String [] args) {
	Fish fish=new Fish();
	Cat cat=new Cat();
	Spider spider=new Spider();
	System.out.println("FISH");
	fish.setName("Mimi");
	System.out.println("This fish's name is "+fish.getName());
	fish.eat();
	fish.walk();
	fish.setName("Momo");
	System.out.println("This fish's name is "+fish.getName());
	System.out.println("");
	System.out.println("CAT");
	cat.setName("Fluffy");
	System.out.println("This cat's name is "+cat.getName());
	cat.walk();
	cat.eat();
	cat.setName("Moose");
	System.out.println("This cat's name is "+cat.getName());
	System.out.println("");
	System.out.println("SPIDER");
	spider.eat();
	spider.walk();
	}
}

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();	
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs.");
	}
}
	class Spider extends Animal{
		public Spider(){
			super(8);//spider have 8 legs
		}
		@Override
		public void eat() {
			System.out.println("Spider eats insect.");
		}
	}
interface Pet{
	String getName();
	public void setName(String name);
	public void play();
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);//cat have 4 legs	
		this.name=name;
	}
	Cat(){
		this("");
	}
	@Override
	public void eat() {
		System.out.println("Cat eat fish. ");
	}
	@Override
	public void setName(String name) {
		this.name=name;	
	}
	@Override
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("Cat is playing.");
	}
}
class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	@Override
	public void eat() {
		System.out.println("This fish eats plants.");
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;	
	}
	public void play() {
		System.out.println("Fish is playing.");
	}
	@Override
	public void walk() {
	 System.out.println("Fish has no legs.");	
	}
}