package farmstory.exception;

public class DataAccessException extends Exception {
  public DataAccessException(String message, Throwable e) {
    super(message, e);
  }
}
