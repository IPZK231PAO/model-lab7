import java.util.Vector;

public class User implements Observer {
	private String _userID;
	private List<String> _receivedMessages;
	public Vector<MessageServer> _unnamed_MessageServer_ = new Vector<MessageServer>();

	public void update(String aMessage) {
		throw new UnsupportedOperationException();
	}
}