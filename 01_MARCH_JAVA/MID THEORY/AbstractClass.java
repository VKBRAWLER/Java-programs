abstract class Animal {
  Animal() {
    System.out.println("Animal");
  }
  public abstract void sound();
};
class Dog extends Animal {
  Dog() {
    super();
  }
  public void sound() {
    System.out.println("barks");
  }
};
class Sher extends Animal {
  Sher() {
    super();
  }
  public void sound() {
    System.err.println("Sheer!!");
  }
};
class AbstractClass {
  public static void main(String[] args) {
    Dog s1 = new Dog();
    Sher s2 = new Sher();
    s1.sound();
    s2.sound();
  }
}