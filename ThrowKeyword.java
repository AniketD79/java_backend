public class ThrowKeyword {
            int i=0;
        int j=20;
    public  void div(){
        try{
    
        if( i==0)
            throw new ArithmeticException("Cannot divide by zero");
        int c= j/i; 
         System.out.println(c);
        }
        catch(Exception e){
System.out.println(e);
        }
         
       
    }
    public static void main(String[] args) {
ThrowKeyword t = new ThrowKeyword();
t.div();
       
    }
}
