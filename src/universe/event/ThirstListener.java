package universe.event;

import java.util.EventListener;

public interface ThirstListener extends EventListener {

	public void thirsted(ThirstEvent event);
	
}
