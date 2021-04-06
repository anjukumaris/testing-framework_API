package apiTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import pojoclass.Book;
import pojoclass.BookPOJO;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class E2ETest {
    @Test
    public void authorizedUser(){

        String baseUrl="https://bookstore.toolsqa.com";
        RequestSpecification httpRequest= RestAssured.given();
        ObjectMapper mapper=new ObjectMapper();
        Book[] book=null;
        try {
            book=mapper.readValue(new File("src/test/resources/book.json"),Book[].class);
            for(Book book1:book){
                System.out.println(book1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
