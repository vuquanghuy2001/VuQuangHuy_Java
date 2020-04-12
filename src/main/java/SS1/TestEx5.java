package SS1;

public class TestEx5{
   public static void main(String[] args) {
       try {
           ex5 objCalc=new ex5();
           objCalc.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
       }catch (ArithmeticException ex){
           System.out.println("Denominator cannot be set to zero");
       }
   }
}
