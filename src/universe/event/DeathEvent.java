package universe.event;

import java.util.EventObject;

public class DeathEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public DeathEvent(Object source) {
		super(source);
	}

}
