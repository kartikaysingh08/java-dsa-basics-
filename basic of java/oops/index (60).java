
 //polymorphism method overriding keep arguments same also sequence and no
class Test {
     void show (){  
       System.out.println(1); 
    }
}
    class Kartik extends Test{
     void show (){
          System.out.println(2); 
    }
    
    public static void main (String[]args){
    Kartik t = new Kartik();
    t.show(); //if we want first class method to be called we need to make a object for that class using new 
}
}



class Test {
     void show (){  
       System.out.println(1); 
    }
}
    class Kartik extends Test{
     void show (){
 super.show(); // using super we can access parent class through child class and this will print 1 first and then 2
          System.out.println(2); 
    }
    
    public static void main (String[]args){
    Kartik t = new Kartik();
    t.show(); //if we want first class method to be called we need to make a object for that class using new 
}
}

