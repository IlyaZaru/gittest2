public class PrinterCommits {
    private String message;

    public PrinterCommits(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printCommit(){
        System.out.println(message);
    }
}
