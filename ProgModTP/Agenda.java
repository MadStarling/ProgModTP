package ProgModTP;
import java.util.HashMap;
import java.util.Set;

class Agenda {
	HashMap<String, Visit> visits;
	
	Agenda(){
		visits = new HashMap<String, Visit>();
	}
	
	public void addVisit(Visit v) {
		visits.put(v.getDatetime(), v);
	}
	
	public Visit removeVisit(Visit v) {
		return visits.remove(v.getDatetime());
	}
	
	public Visit geVisit(String dt){
		return visits.get(dt);
	}
	
	@SuppressWarnings("rawtypes")
	public Set geAllVisits(){
		return visits.entrySet();
	}
}