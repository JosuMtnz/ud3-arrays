package Solution;

public class CapitalizeObserver extends Observer {

	public CapitalizeObserver(Subject subject){
        this.subject = subject;
        this.subject.registrarObservador(this);
    }
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}
	
	public int countLowerCase() {
		return 0;
	}
	
	public int countUpperCase() {
		return 0;
	}

}
