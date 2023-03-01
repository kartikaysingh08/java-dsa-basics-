
//initializing objects using method  (oops)

class Rectangle
{
  int length ;
  int width ;
  

void areaRect (int l , int w ){
     length = l;
     width =w;
    
}
void Display(){
    System.out.print(length +" "+width);
   
}
  public static void main(String[]args) 
  {
 Rectangle rect = new Rectangle();
rect.areaRect(5,6);

rect.Display();
  }
}