package EMailValidateDemo.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMailValidator {

    private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean eMailValidate(String eMail){
        Matcher matcher = pattern.matcher(eMail);
        return matcher.matches();        
    }
    
}
