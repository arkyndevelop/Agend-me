package br.com.agend.me.core.exception.infra;

import br.com.agend.me.core.exception.CustomException;
import br.com.agend.me.core.exception.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomRegisterHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> cpfIsWrong(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("CPF não aceito!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> emailIsWrong(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("E-mail não aceito!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> cellphoneIsWrong(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("Celular não aceito!"));
        return  ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }

    @ExceptionHandler(CustomException.class)
    private ResponseEntity<RestErrorMessage> passwordIsWrong(CustomException exception) {
        RestErrorMessage treatResponse = new RestErrorMessage(HttpStatus.CONFLICT, exception.getMessage("Senha não aceita!"));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(treatResponse);
    }
}
