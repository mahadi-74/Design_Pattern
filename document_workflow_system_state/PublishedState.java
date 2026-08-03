public class PublishedState implements DocumentState {
    @Override
    public void submitForReview(Document document) {
        System.out.println("Invalid transition: Document is already published.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Invalid transition: Document is already published.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Invalid transition: Document is already published.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Invalid transition: Document is already published.");
    }

    @Override
    public void sendBackForRevision(Document document) {
        System.out.println("Invalid transition: Cannot send back for revision. Document is already published.");
    }

    @Override
    public void modify(Document document) {
        System.out.println("Invalid operation: A published document cannot be modified.");
    }
}
