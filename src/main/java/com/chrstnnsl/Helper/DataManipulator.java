package com.chrstnnsl.Helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import com.chrstnnsl.interfaces.DataInterface;


public class DataManipulator implements DataInterface {

    JSONObject j = null;
    public DataManipulator() {
        return;
    }

    public DataManipulator convertJsonAsTestData() throws FileNotFoundException, IOException, ParseException {
        Object o = new JSONParser().parse(new FileReader("src/test/resources/Info.json"));

        j = (JSONObject) o;
        return this;
    }

    public DataManipulator createRegisteredNewUser() {

        System.out.println(j);
        return this;
    }

    @Override
    public void submitApplication() {
        System.out.println("TEST");
    }

    // public DataManipulator submitApplication() throws FileNotFoundException, IOException, ParseException {
    //     // return this;
    //     String full_name = (String) convertJsonAsTestData().get("full_name");
    //     String email = (String ) convertJsonAsTestData().get("email");
    //     String current_address = (String ) convertJsonAsTestData().get("current_address");
    //     String permanent_address = (String ) convertJsonAsTestData().get("permanent_address");

    //     System.out.println("Please see the information below");
    //     System.out.println("The password value will be hashed in this reference");
    //     System.out.println("");
    //     System.out.println("Full name: " + full_name);
    //     System.out.println("email: " + email);
    //     System.out.println("Current Address: " + current_address);
    //     System.out.println("Permanent Address: " + permanent_address);
    //     System.out.println("Password: 7d165e12-a5df-11ed-afa1-0242ac120002");
    //     return null;
    // }

    
    
}
