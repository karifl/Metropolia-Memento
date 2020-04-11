package memento;

public class Memento {

	private int state;
	private StringBuilder content; //säilöö stringin
	
		
	public Memento(int state, StringBuilder content) {
		this.state = state;
		this.content=new StringBuilder(content);
	}
	
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public StringBuilder getContent() {
		return content;
	}
	
}
