package commision.mvc.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Radek on 09.11.2017.
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(SalesChannelNullException.class)
    public ResponseEntity<Object> handle(SalesChannelNullException ex){
        String body = ex.getMessage();
        return new ResponseEntity<Object>(body, HttpStatus.BAD_REQUEST);
    }
}
