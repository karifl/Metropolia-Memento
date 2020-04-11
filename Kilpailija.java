package memento;

public class Kilpailija extends Thread {

	private Object object;
	
	
	public void liityPeliin(Arvuuttaja arvuuttaja) {
		this.object = arvuuttaja.liityPeliin();
	}
	
	public void undo(Arvuuttaja Arvuuttaja) {
		Arvuuttaja.undoToLastSave(object);
		}
}
