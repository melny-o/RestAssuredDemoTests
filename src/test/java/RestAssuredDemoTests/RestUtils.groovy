package RestAssuredDemoTests

import org.apache.commons.lang3.RandomStringUtils

public class RestUtils {
    public static String getFirstName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("John"+generatedString);
    }
    public static String getLastName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Smith"+generatedString);
    }
    public static String getUserName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        String generatedNumbers = RandomStringUtils.randomAlphanumeric(2);
        return ("John"+generatedString+generatedNumbers);
    }
    public static String getPassword(){
        String generatedNumbers = RandomStringUtils.randomAlphanumeric(2);
        return ("John"+generatedNumbers);
    }
    public static String getEmail(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        String generatedNumbers = RandomStringUtils.randomAlphanumeric(2);
        return ("John"+generatedString+generatedNumbers+"gmail.com");
    }

    public static String employeeName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return "Tom";
       // return("Tom"+generatedString);
    }
    public static String employeeSalary(){
        String generatedString = RandomStringUtils.randomNumeric(5);
        return(generatedString);
    }
    public static String employeeAge(){
        String generatedString = RandomStringUtils.randomNumeric(2);
        return("100"+generatedString);
    }

}
