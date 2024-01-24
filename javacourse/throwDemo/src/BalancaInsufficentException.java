public class BalancaInsufficentException extends Exception{
    String message;
    public BalancaInsufficentException(String message) {
        this.message= message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
