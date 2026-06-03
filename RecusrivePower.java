public class RecusrivePower {
public int powerN(int base, int n) {
  if(n==0){
    return 1;
  }
   if (n == 1) {
        return base;
    }

    return base * powerN(base, n - 1);
}

    public static void main(String[] args) {
        RecusrivePower r = new RecusrivePower();
     int v=   r.powerN(3, 3);
     System.out.println(v);
    }
}