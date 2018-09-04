package less02;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Cat extends Animal implements Cloneable,Serializable,Externalizable{

private Owner owner;

public Cat(){}
public Cat(String name, int age) {
	this.name = name;
	this.age = age;
}

public Owner getOwner() {
	return owner;
}

public void setOwner(Owner owner) {
	this.owner = owner;
}


@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
@Override
public String toString() {
	return "Cat [name=" + name + ", age=" + age + ", owner=" + owner + "]";
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeInt(age);
	out.writeObject(owner);
	
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	name=(String) in.readObject();
	age=in.readInt();
	owner=(Owner) in.readObject();
	
}

}
