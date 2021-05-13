
public class Algoritmo
{
   public String devolver(int n){
     int r = 1; 
     int cont = 1;
     System.out.print(r + "  ");
     String res;
     int s = 1 ;
      while(s < n){
  
        if(cont < 3){
         r = r + cont;
         cont++;
         s++;
         System.out.print(r + "  ");
         
        }else{
         while(cont > 1){ 
            r = r + cont;
            cont--;
            s++;
            System.out.print(r + "  ");
            }     
         }
        }
        res =  r + "  ";
     return res;
    }
}
