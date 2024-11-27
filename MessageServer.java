public class MessageServer extends Subject {
	private List<String> _messages;
	private List<Observer> _observers;
	public Observer _unnamed_Observer_;
	public User _unnamed_User_;

	public void registerObserver(Observer aObserver) {
		throw new UnsupportedOperationException();
	}

	public void sendMessage(String aMessage) {
		throw new UnsupportedOperationException();
	}

	public void removeObserver(Observer aObserver) {
		throw new UnsupportedOperationException();
	}

	public void notifyObservers() {
		throw new UnsupportedOperationException();
	}
}