package company.Ajacs;
class Animal{
	String makeSound() {
		return "sound of animal";
	}
}
class Dog extends Animal{
	String makeSound() {
		return "bhow-bhow";
	}
}
class Cat extends Animal{
	public String makeSound() {
		return "meow-meow";
	}
}
class Cow extends Animal{
	String makeSound() {
		return "Amba-Amba";
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] a=new Animal[3];
		a[0]=new Dog();
		a[1]=new Cat();
		a[2]=new Cow();
		System.out.println(a[0].makeSound());
		for(Animal animal:a)
			System.out.println(animal.makeSound());
			
//		Animal a=new Dog();
//		Animal b=new Cat();
//		Animal c=new Cow();
//		System.out.println(a.makeSound());
//		System.out.println(b.makeSound());
//		System.out.println(c.makeSound());
	}

}
