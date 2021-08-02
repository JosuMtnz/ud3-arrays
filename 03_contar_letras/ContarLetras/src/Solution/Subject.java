package Solution;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	List<Observer> observers;
    private String estado;
    
    public Subject(String state) {
        observers = new ArrayList<>();
        setEstado(state);
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
        System.out.println("\\nCurrent State: " + estado + "\n");
        notificarObservadores();
    }
    public void registrarObservador(Observer observador){
        for(Observer o: observers)
            this.observers.add(o);
    }
    public void eliminarObservador(Observer observador){
        observers.remove(observador);
    }
    public void notificarObservadores(){
        for(Observer o: observers)
            o.actualizar();
    }
}
