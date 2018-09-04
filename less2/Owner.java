package less02;

import java.io.Serializable;

public class Owner implements Serializable{
private String name;
public Owner(Owner owner){
	name=owner.name;
}
public Owner(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Owner [name=" + name + "]";
}

}
