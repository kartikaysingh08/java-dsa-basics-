


    //polymorphism method overloading
class Test {
  
    
    void show (int a){  // either change sequence of argument ,no of arg , args
       System.out.println(1); 
    }
    void show (){
          System.out.println(2); 
    }
    public static void main (String[]args){
    Test t = new Test();
    t.show(10);
}
}

