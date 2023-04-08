package sample1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Waiter {
    public List<Person> give(String jsonFile) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            String json =  Files.readString(Paths.get(jsonPath(jsonFile)));
            return Arrays.asList(mapper.readValue(json, Person[].class));
        }catch (Exception ignored){
        }
        return new ArrayList<>();
    }


    private  String jsonPath(String src){
        return Paths.get("").toAbsolutePath() +"/src/main/java/sample1/" + src;
    }
}
