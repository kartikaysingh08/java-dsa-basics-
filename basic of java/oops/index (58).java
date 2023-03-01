multiple level inheritence
//initializing objects using method  (oops)

class Person
{
  int age;
  String sname;
  Person()
  {
  }
Person(int a,String sn)
  {
  age=a;
  sname=sn;
  }
public void display()
  {
  System.out.println("the age is"+age);
  System.out.println("the name is"+sname);
  }
  }
class Stu extends Person
  {
  int rollno;
  String section;
  Stu()
  {
  }
Stu(int a,String sn,int r,String sec)
  {
  super(a,sn);
  rollno=r;
  section=sec;
  }
public void display1()
  {
  super.display();
  System.out.println("the rollno is"+rollno);
  System.out.println("the section is"+section);
  }
  }
  class Player extends Stu
  {
  String type,sport;
  Player()
  {
  }
  Player(int a,String sn,int r,String sec,String t,String s)
  {
    super(a,sn,r,sec);
    type=t;
    sport=s;
  }
  public void display2()
  {
    System.out.println("the type is"+type);
    System.out.println("the sport is"+sport);
  }
  }
  public class Multiple
  {
    public static void main(String[] args)
    {
      Player s1=new Player(18,"sunny",42,"mscs","beg","tennis");
      Player s2=new Player(19,"shreya",35,"bsc","intermediate","cricket");
      System.out.println("the details of s1 are");
      s1.display();
      s1.display1();
      s1.display2();
      System.out.println("the details of s2 are");
      s2.display();
      s2.display1();
      s2.display2();
    }
  }  

