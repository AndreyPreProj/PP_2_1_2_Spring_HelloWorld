import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("helloworld")
public class HelloWorld {
 
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
}