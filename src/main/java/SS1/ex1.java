package SS1;

public class ex1 {
    int result;
    public void divide(int num1,int num2){
        try {
            result=num1/num2;
        }catch (ArithmeticException ex){
            System.out.println("Denominator cannot be set to zero !!!"+ex.getMessage());
        }
    }
}
