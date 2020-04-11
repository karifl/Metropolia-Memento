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
	
	

}
