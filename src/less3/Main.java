package less3;



import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Dog dog1=new Dog("Bobik",12);
		Dog dog2=new Dog("Warik",13);
		Dog dog3=new Dog("Byte",14);
		Dog dog4=new Dog("Virus",16);
//		DogComparator<Dog> comparator=new DogComparator();
		Comparator<Dog> comparator=new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				// TODO Auto-generated method stub
				return 0;
			}};
		TreeSet<Dog> dogSet = new TreeSet<Dog>(comparator);
		dogSet.add(dog1);
		dogSet.add(dog2);
		dogSet.add(dog3);
		dogSet.add(dog4);
		System.out.println(dogSet);

	}

}
