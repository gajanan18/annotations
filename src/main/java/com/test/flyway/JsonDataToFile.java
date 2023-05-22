package com.test.flyway;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.test.flyway.service.request.Company;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class JsonDataToFile {

    public static void main(String[] args) {


        /*A simple solution is to create a new PrintWriter instance from the character-output stream and use its write() method to write the JSON string to a file.
        You can construct and pass a FileWriter given a file name, using the specified charset or the platform’s default one.
        Note that if the file does not exist, a new file will be created;
        otherwise, the existing file will be truncated.*/

       /* File JsonToFile = new File("JsonToFile.pdf");

        JSONObject json = new JSONObject();
        try {
            json.put("name", "Google");
            json.put("employees", 140000);
            json.put("offices", List.of("Mountain View", "Los Angeles", "New York"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(JsonToFile))) {
            out.write(json.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }*/


/* an alternative solution that uses the Gson Java library to convert an object to its JSON representation.
Gson provides the toJson() method to convert a Java object to a JSON string and write it to a file using PrintWriter.*/

/*        Company companies = new Company("Google", 140000,
                Arrays.asList("Mountain View", "Los Angeles", "New York"));

        File usingGsonLib = new File("usingGsonLib.txt");

        try (PrintWriter out = new PrintWriter(new FileWriter(usingGsonLib))) {
            Gson gson = new Gson();
            String jsonString = gson.toJson(companies);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

/*2. Using Jackson library
Jackson is a high-performance library for processing JSON data in Java.
It provides an ObjectMapper class for reading and writing JSON.
The idea is to use the writeValue() method to serialize Java objects as JSON String and write the JSON to the supplied file.
The following program demonstrates it:*/

        Company companies = new Company("Google", 140000,
                Arrays.asList("Mountain View", "Los Angeles", "New York"));

        File usingJacksonLib = new File("usingJacksonLib.txt");

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(usingJacksonLib, companies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
