import alternative.AlternativePrinterCommits;
import alternative.CommitMessage;
import calculate.CalculaterImpl;
import randon.GenerateRandon;

public class MainClass {

    public static void main(String[] args) {
        CommitMessage commitMessage = new CommitMessage();
        commitMessage.setMessage("Commit message");
        AlternativePrinterCommits alternativePrinterCommits = new AlternativePrinterCommits(commitMessage);
        CalculaterImpl calculater = new CalculaterImpl();
        alternativePrinterCommits.printCommit();
        System.out.println(calculater.sumAndSub(GenerateRandon.generate(), GenerateRandon.generate()));
        System.out.println("______________");
    }
}
