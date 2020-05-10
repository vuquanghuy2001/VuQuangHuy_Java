package JSONDemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDeatils=new JSONObject();
        employeeDeatils.put("fitstname","Dang");
        employeeDeatils.put("lastname","Kim Thi");
        employeeDeatils.put("website","codelean.vn");

        JSONObject employeeObject=new JSONObject();
        employeeObject.put("employee",employeeDeatils);

        JSONObject employeeDeatils2=new JSONObject();
        employeeDeatils2.put("fitstname","Code");
        employeeDeatils2.put("lastname","Lean");
        employeeDeatils2.put("website","codelean.com");

        JSONObject  employeeObject2=new JSONObject();
        employeeObject2.put("employee",employeeDeatils2);

        JSONArray employeeList=new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try (FileWriter file=new FileWriter("employees.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
