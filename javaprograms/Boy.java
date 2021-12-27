class Man
{   
void eat()
{
System.out.println("Man is eating");
}  
}    
class Boy extends Man
{  
void eat()
{
System.out.println("Boy is eating");
}  
public static void main(String args[])
{  
Boy obj = new Boy();  
obj.eat();  
}  
}  
