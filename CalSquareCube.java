package pack1;

interface Printable
{
 void show();
}
interface Calculate
{
 int cal(int b);
}
class Cal_Sqr implements Printable,Calculate
{
 public void show()
 {
	 System.out.println("Square of Number is:");
 }
 public int cal(int a)
 {
	 return a*a;
 }
}
class Cal_cube implements Printable,Calculate
{
 public void show()
 {
	 System.out.println("Cube of Number is:");
 }
 public int cal(int a)
 {
	 return a*a*a;
 }
}
public class CalSquareCube {

	public static void main(String[] args) {
	Cal_Sqr cq=new Cal_Sqr();
	cq.show();
	System.out.println(cq.cal(4));
	Cal_cube cc=new Cal_cube();
	cc.show();
	System.out.println(cc.cal(2));
  }
}
	


