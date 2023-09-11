package za.ac.cput.util;

import java.util.UUID;

public class Helper {

    public  static Boolean isNullorEmpty(String s){
        if( s == null || s.isBlank()){
            return true;
        }
        return false;
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }
//    public static Boolean isValidEmail(String email){
//        EmailValidator emailValidator = EmailValidator.getInstance();
//        return emailValidator.isValid(email);
//
//    }
}
