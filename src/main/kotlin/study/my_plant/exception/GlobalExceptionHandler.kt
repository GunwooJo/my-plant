package study.my_plant.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@RestControllerAdvice
class GlobalExceptionHandler {

    // Validation 예외 처리
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationException(ex: MethodArgumentNotValidException): ResponseEntity<ErrorResponse> {
        val errorMessage = ex.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage}" }
        val errorResponse = ErrorResponse(message = errorMessage)
        return ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST)
    }

    // 일반 예외 처리
    @ExceptionHandler(Exception::class)
    fun handleGlobalException(ex: Exception): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(message = "예상치 못한 에러 발생: ${ex.message}")
        return ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
