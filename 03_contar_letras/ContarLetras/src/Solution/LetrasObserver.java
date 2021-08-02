package Solution;

public class LetrasObserver extends Observer {

	public LetrasObserver(Subject subject){
        this.subject = subject;
        this.subject.registrarObservador(this);
    }
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

}
