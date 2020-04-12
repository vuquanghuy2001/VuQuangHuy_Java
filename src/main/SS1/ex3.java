package SS1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex3 {
    PrintWriter objPwOut=null;
    public void writeToFile() throws FileNotFoundException{
        try {
            objPwOut=new PrintWriter("C:\\MyFile.txt");
        }finally {
            if (objPwOut!=null){
                objPwOut.close();
                System.out.println("PrintWriter closed");
            }
        }
    }
}
