public class DraftState implements DocumentState {
    @Override
    public void submitForReview(Document document) {
        System.out.println("Document submitted for review.");
        document.setState(new ReviewState());
    }

    @Override
    public void approve(Document document) {
        System.out.println("Invalid transition: Cannot approve a draft document.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Invalid transition: Cannot reject a draft document.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Invalid transition: Cannot publish a draft document.");
    }

    @Override
    public void sendBackForRevision(Document document) {
        System.out.println("Invalid transition: Cannot send back for revision from draft state.");
    }

    @Override
    public void modify(Document document) {
        System.out.println("Document modified in Draft state.");
    }
}
