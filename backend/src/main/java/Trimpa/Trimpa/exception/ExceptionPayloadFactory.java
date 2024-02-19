package Trimpa.Trimpa.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionPayloadFactory {
    TECHNICAL_ERROR(0, HttpStatus.INTERNAL_SERVER_ERROR, "technical.error"),
    MISSING_REQUEST_BODY_ERROR_CODE(1, HttpStatus.BAD_REQUEST, "request.missing.body"),

    UNAUTHORIZED(401, HttpStatus.UNAUTHORIZED, "Unauthorized"),
    NOT_FOUND(404, HttpStatus.NOT_FOUND, "Not Found"),
    INTERNAL_SERVER_ERROR(500, HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error");

    private final Integer code;
    private final HttpStatus status;
    private final String message;

    public ExceptionPayload get() {
        return new ExceptionPayload(code, status, message);
    }
}
