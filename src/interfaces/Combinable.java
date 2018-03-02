package interfaces;

import orderedStructures.Progression;

public interface Combinable {
	public Progression add(Progression other);
	public Progression subtract(Progression other);
}
