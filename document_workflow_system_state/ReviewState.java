public class ReviewState implements DocumentState {
    @Override
    public void submitForReview(Document document) {
        System.out.println("Invalid transition: Document is already under review.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document approved.");
        document.setState(new ApprovedState());
    }

    @Override
    public void reject(Document document) {
        System.out.println("Document rejected. Returning to draft state.");
        document.setState(new DraftState());
    }

    @Override
    public void publish(Document document) {
        System.out.println("Invalid transition: Cannot publish a document under review.");
    }

    @Override
    public void sendBackForRevision(Document document) {
        System.out.println("Invalid transition: Cannot send back for revision directly from review state.");
    }

    @Override
    public void modify(Document document) {
        System.out.println("Invalid operation: Cannot modify a document while under review.");
    }
}
