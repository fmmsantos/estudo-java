package declaracaocontoleacesso;

public class HerancaPolimorfismo {
	public static void main(String[] args) {
		Animal a= new Dog();
		oQueComo(a);
		
		Animal b= new Cat();
		oQueComo(b);
	}
	static void oQueComo(Animal animal) {
		animal.comer();
		if(animal instanceof Dog) {
			Dog d = (Dog) animal;
			d.latir();
		}
	}
}

class Animal {
	public void comer() {
		System.out.println("COMENDO");
	}
}

class Dog extends Animal{
	@Override
	public void comer() {
		System.out.println("PEDIGRE");
	}
	public void latir() {
		System.out.println("AU-AU");
	}
}
class Cat extends Animal{
	@Override
	public void comer() {
		System.out.println("WISKAS");
	}
}
