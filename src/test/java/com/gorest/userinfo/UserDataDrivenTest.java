package com.gorest.userinfo;

import com.gorest.steps.UsersSteps;
import com.gorest.testbase.TestBase;
import com.gorest.utils.PropertyReader;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

//@UseTestDataFrom("src/test/java/resources/testdata/data.csv")
//@RunWith(SerenityParameterizedRunner.class)
public class UserDataDrivenTest extends TestBase {



    private String  name;
    private String gender;
    private String email;

    private String status;
    static  String token= PropertyReader.getInstance().getProperty("token");


    @Steps
    UsersSteps usersSteps;

    @Title("Data driven test for adding multiple users to the application")
    @Test
    public void createMultipleUsers(){
        usersSteps.createUser(name,gender,email,status,token).statusCode(201);
    }
}
