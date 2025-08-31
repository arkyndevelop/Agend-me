package br.com.agend.me.domain.medic.exception;

import br.com.agend.me.core.exception.CustomException;
import br.com.agend.me.core.exception.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MedicException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> crmIsWrong(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("CRM não aceito!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> crmNotFound(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage("CRM não aceito!"));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);
    }
}
