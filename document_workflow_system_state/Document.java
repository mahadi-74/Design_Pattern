public class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public DocumentState getState() {
        return this.state;
    }

    public void submitForReview() {
        state.submitForReview(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public void publish() {
        state.publish(this);
    }

    public void sendBackForRevision() {
        state.sendBackForRevision(this);
    }

    public void modify() {
        state.modify(this);
    }
}
