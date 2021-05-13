
public class Padovan
{
   public String padovan(int n){
    String res;
     int a = 1;
     System.out.print(a + " ");
     int b = 1;
     System.out.print(b + " ");
     int c = 1;
     System.out.print(c + " ");
     int r = 0;
     for (int i = 4; i <= n; i++){
        r = b + a;
        System.out.print(r + " ");
        a = b;
        b = c ;
        c = r;
        }
        res = r + "  ";
    return res;
    } 
}
