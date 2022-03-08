package bai_15.bai_tap;

public class ExceptionRectangle extends Exception {

    public ExceptionRectangle() {
        super("tam giac ko hop le");
    }

    public ExceptionRectangle(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
