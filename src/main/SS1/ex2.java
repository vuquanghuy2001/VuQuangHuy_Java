package SS1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex2 {
    PrintWriter objPwOut=null;
    public void WriteToFile(){
        try {
            objPwOut=new PrintWriter("C:\\MyFile.txt");
        }catch (FileNotFoundException ex){
            System.out.println("File Does Not Exist"+ex.getMessage());
        }finally {
            if (objPwOut!=null){
                objPwOut.close();
                System.out.println("PrintWriterclosed");
            }
        }
    }
}
