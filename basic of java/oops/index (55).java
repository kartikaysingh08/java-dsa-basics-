oops
//initializing objects using method  (oops)

class Rectangle
{
  int length ;
  int width ;
  
   
  void Value(int x ,int y){
      length = x;
      width=y;
  }
  int Area(){
      int area = length*width;
      return(area);
  }

      public static void main(String[] args){
          int area1,area2;
          Rectangle rect1 =new Rectangle();
           Rectangle rect2 =new Rectangle();
           rect1.length=5; //using ref
           rect1.width=6;
           area1 =(rect1.length*rect1.width); //using method
           rect2.Value(8,9);
          area2 = rect2.Area();
          System.out.println(area1);
             System.out.println(area2);
      }
  }