public class ErrorInputException extends RuntimeException {
    @Override
    public String getMessage() {
        return "wrong input";
    }
}
