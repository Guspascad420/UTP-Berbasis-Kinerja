public class ValidationException extends Throwable {

    private String message;

    ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void validate(String s) throws ValidationException {
        if (s.matches("[0-9]+")) {
            throw new ValidationException("Nama tidak boleh hanya berupa angka dan tidak boleh kosong");
        }
    }

    public static void validate(int i) throws ValidationException {
        if (i > 3) {
            throw new ValidationException("Masukkan nomor yang valid");
        }
    }
}
