import java.util.HashSet;

public class Entity {
	
	String name;
	String desc;
	
	HashSet<String> properties = new HashSet<String>(0);
	
	String state;
	
	Entity(String name){
		this.name = name;
	}
	Entity(String name, String desc){
		this.name = name;
		this.desc = desc;
	}
	Entity(String name, String desc, String state){
		this.name  = name;
		this.desc  = desc;
		this.state = state;
	}
	Entity(String name, String desc, String state, String[] properties){
		this.name  = name;
		this.desc  = desc;
		this.state = state;
		
		for (String prop : properties){
			this.properties.add(prop);
		}
		
	}
	Entity(String name, String desc, String[] properties){
		this.name = name;
		this.desc = desc;
		
		for (String prop : properties){
			this.properties.add(prop);
		}
		
	}
	
	String ToString(){
		return name;
	}
	
	String View(){
		return desc;
	}
	
	boolean HasProperty(String prop){
		if (properties.contains(prop))
			return true;
		return false;
	}
	
	boolean InState(String state){
		if (state.equals(this.state))
			return true;
		return false;
	}
	
	void ChangeState(String state){
		this.state = state;
	}
}
