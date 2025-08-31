package br.com.agend.me.core.exception.infra;

import br.com.agend.me.core.exception.CustomException;
import br.com.agend.me.core.exception.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomReportsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> cpfNotFound(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("CPF não encontrado!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> emailNotFound(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage("Email não encontrado!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> cellphoneNotFound(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage("Celular não encontrado!"));
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> idNotFound(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage("Id não encontrado!"));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> NotFound(CustomException exception){
         RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage("Nenhum dado encontrado!"));
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);

    }
}


