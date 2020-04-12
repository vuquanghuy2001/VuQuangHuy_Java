package SS1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex4 {
    PrintWriter objPwOut=null;
    public void writeToFile() throws FileNotFoundException{
        try {
            objPwOut=new PrintWriter("C:\\MyFile.txt");
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException();
        }finally {
            if (objPwOut!=null){
                objPwOut.close();
                System.out.println("PrintWriter closed");
            }
        }
    }

    public static void main(String[] args) {
        try {
            ex4 fw =new ex4();
            fw.writeToFile();
        }catch (FileNotFoundException ex){
            System.out.println("File does not exist "+ex.getMessage());
        }
    }
}
