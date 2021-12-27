class Ani{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Ani{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Ani{  
void meow(){System.out.println("meowing...");}  
}  
class Inheritance{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
}}  
