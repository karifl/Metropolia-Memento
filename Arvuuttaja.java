package memento;

public class Arvuuttaja {
	
	private int value;
	private StringBuilder content; //säilöö valuen

	
	public Arvuuttaja(int value) {
		this.value = value;
		this.content = new StringBuilder();
	}
	public String toString() {
		return this.content.toString();
	}

	
	
	public Object liityPeliin() {
		content.append(value); //content sisältää arvon
		return new Memento(this.value, this.content);
	}
	
	
	
	public void undoToLastSave(Object obj) {
		Memento memento = (Memento) obj;
		this.value = memento.getState();
		this.content = memento.getContent();
		

	}
	private class Memento {

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
	
	

}
