package week3;

public class Calculator {
public  void add (int n1,int n2) {

	System.out.println(n1+n2);
}
public  void add (int n3,int n4,int n5) {

	System.out.println(n3+n4+n5);
}
public  void sub (double n1,double n2) {

	System.out.println(n1-n2);
}
public  void sub (int n3,int n4) {

	System.out.println(n3-n4);
}
public  void mul (int n1,double n2) {

	System.out.println(n1*n2);
}
public  void mul (double n1,double n2) {

	System.out.println(n1*n2);
}
public static void main(String[] args) {
	Calculator cl=new Calculator(); 
	cl.add(2, 3);
	cl.add(2, 3, 5);
	cl.sub(2.1, 3.5);
	cl.sub(5, 4);
	cl.mul(5, 6.2);
	cl.mul(3.5, 4.5);
	
 
}
}

