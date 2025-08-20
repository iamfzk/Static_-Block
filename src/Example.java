public class Example {
    static  int  count;
    // static block
    static {
        System.out.println("Static block executed");
        count = 10; // initializing static variable
    }
     Example(){
         System.out.println("Constructor executed ");

     }
     public static void main(String[] args){
         System.out.println("Main methood executed");
         Example obj = new Example();
         System.out.println("count =" + count);
     }
}

