package JSONDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJSONTest {
    public static void main(String[] args) {
       JSONParser jsonParser=new JSONParser();
        try (FileReader reader=new FileReader("employees.json")) {
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList=(JSONArray) obj;
            System.out.println(employeeList);
            employeeList.forEach(emp->parseEmployeeObject((JSONObject)emp));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    private static void parseEmployeeObject(JSONObject employee){
        JSONObject employeeObject=(JSONObject) employee.get("employee");

        String firstName=(String) employeeObject.get("fitstname");
        System.out.println(firstName);

        String lastName=(String) employeeObject.get("lastname");
        System.out.println(lastName);

        String website=(String) employeeObject.get("website");
        System.out.println(website);
    }
}





