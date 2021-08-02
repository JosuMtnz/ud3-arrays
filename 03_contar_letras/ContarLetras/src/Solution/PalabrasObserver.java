package Solution;

public class PalabrasObserver extends Observer {

	public PalabrasObserver(Subject subject){
        this.subject = subject;
        this.subject.registrarObservador(this);
    }
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}
	
	public int countWords() {
		return 0;
	}

}
