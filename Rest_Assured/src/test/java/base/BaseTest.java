package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.AuthUtil;

public class BaseTest {

    public static String token;
    public static RequestSpecification rs; 

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        token = AuthUtil.getToken(); 
    }
}
