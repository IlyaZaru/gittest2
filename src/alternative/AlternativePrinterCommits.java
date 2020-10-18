package alternative;

public class AlternativePrinterCommits {
    private CommitMessage commitMessage;

    public AlternativePrinterCommits(CommitMessage commitMessage) {
        this.commitMessage = commitMessage;
    }

    public CommitMessage getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(CommitMessage commitMessage) {
        this.commitMessage = commitMessage;
    }

    public void printCommit(){
        System.out.println("This is alternative - "+commitMessage.getMessage());
    }
}
