package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8, firnum=0,secnum=1,sum;
System.out.println(firnum);
for(int i=1;i<range;i++)
{
	sum=firnum+secnum;
	firnum=secnum;
	secnum=sum;
	System.out.println(sum)	;
}
	}

}
