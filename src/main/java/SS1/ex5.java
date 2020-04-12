package SS1;

public class ex5 {
    public void divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();
        }
        int result=a/b;
        System.out.println("Result"+result);
    }
}
