package uebungen10jsp2;

import java.util.Map;
import java.util.TreeMap;

public class TestBean {
	  public Map<String,String> getPersons() {
	    Map<String, String> persons = new TreeMap<String, String>();
	    persons.put("Drachenfels", "Heiko von");
	    persons.put("Johner", "Christian");
	    return persons;
	  } 
	}
