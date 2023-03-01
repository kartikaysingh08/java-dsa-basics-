initializing objects using reference variable (oops)

class Rectangle
{
  int length ;
  int width ;
int area;
  public static void main(String[]args) 
  {
 Rectangle rect = new Rectangle();
rect.length=6;// initializing values of variables using .
rect.width=6;
rect.area =( rect.length*rect.width);
System.out.println(rect.length +" "+rect.width);
System.out.print(rect.area);
  }
}