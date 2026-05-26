class MyExc extends Exception{

    MyExc(String mString){
        super(mString);
    }
}


public class CustomException {
     public void divide() throws MyExc{
           int a =4;
           int b= 0;
           if( b==0)
            throw new MyExc("Number cannot be divide by Zero!");
           int c= a/b;
           System.out.println(c); 
        }
    public static void main(String[] args) {
       CustomException c = new CustomException();
       try {
        c.divide();
    } catch (MyExc e) {
        // TODO Auto-generated catch block
        // e.printStackTrace();
        System.out.println(e);
    }
    }
}
