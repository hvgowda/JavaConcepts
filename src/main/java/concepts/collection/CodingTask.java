package concepts.collection;

public final class CodingTask extends Task {
	
	private final String spec;
	

	public CodingTask(String spec) {
		super();
		this.spec = spec;
	}

	public String getSpec() {
		return spec;
	}

	@Override
	public String toString() {
		return spec;
	}

}
