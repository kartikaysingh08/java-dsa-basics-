simple parametarize constructor 
//initializing objects using method  (oops)

class Employee {
    String name;
    int age;
   Employee(String N , int A){  //initializing const. method
        this.name=N;
        this.age=A;
    }
     
        public static void main (String[]args){
         Employee emp1 = new Employee("zlatan",12); //calling const.
          Employee emp2 = new Employee("militao" , 14);
            System.out.println(emp1.name +" "+ emp1.age);
           System.out.println(emp2.name +" "+ emp2.age);
        
    }
}
