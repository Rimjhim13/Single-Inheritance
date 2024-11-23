//Example of Inheritance(Single Inheritance)
class Parent{
	public void sum(int x,int y){
		System.out.println("Sum="+(x+y));
	}
} 
class Child extends Parent{
	public void sub(int x,int y){
		System.out.println("Sub="+(x-y));
	}
}
class Prog1{
	public static void main (String arg[]){
		Child c=new Child();
		c.sum(10,2);
		c.sub(10,2);
	}
}