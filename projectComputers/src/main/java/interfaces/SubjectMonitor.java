package interfaces;

public interface SubjectMonitor {

	    void registerObserver(ObserverMonitor observerMonitor);  
	    void removeObserver(ObserverMonitor observerMonitor);    
	    void notifyObservers();                    

}
