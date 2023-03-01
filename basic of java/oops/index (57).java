single level inheritence 
//initializing objects using method  (oops)

class Room {
  int length ;
  int breath ;
  Room ( int x , int y ){
    length =x ;
    breath =y ;
  }
  int area ( ){
   return length*breath;
  
  }
}
class BedRoom extends Room {
  int height;
  
  BedRoom (int x , int y ,int h ){
    super (x,y);
  height =h ;
  }
  int volume ( ){
    return (length*breath*height);
  }
 
  public static void main (String[]args){
    BedRoom bed1 = new BedRoom(11,12,14);
    int area1 = bed1.area( );
    int volume1=bed1.volume( );
    System.out.println(area1);
    System.out.println(volume1);
  }
  }
