public class ApprovedState implements DocumentState {
    @Override
    public void submitForReview(Document document) {
        System.out.println("Invalid transition: Document is already approved.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Invalid transition: Document is already approved.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Invalid transition: Cannot reject an approved document.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document published.");
        document.setState(new PublishedState());
    }

    @Override
    public void sendBackForRevision(Document document) {
        System.out.println("Document sent back for revision.");
        document.setState(new DraftState());
    }

    @Override
    public void modify(Document document) {
        System.out.println("Invalid operation: Cannot modify an approved document. Send back for revision first.");
    }
}
