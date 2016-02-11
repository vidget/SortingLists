import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name){
		
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
		
	}
	
}




//Used to sorts according to the size of the strings.
class StringLenthComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;

		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		//compareTo is a method in the interface
		return s1.compareTo(s2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		//compareTo is a method in the interface
		return -s1.compareTo(s2);
	}
}


public class App {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");

		// If I want to sort this list I can use a static method of the
		// the COLLECTIONS class.

		System.out.println("\nSorted by String Length");
		Collections.sort(animals, new StringLenthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}
				
		System.out.println("\nSorted Alphabetically");
		Collections.sort(animals, new AlphabeticalComparator());
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nSorted Reverse Alphabetically");
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("\nSorted Numerically line by line");
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(45);
		numbers.add(9);
		numbers.add(2);
		numbers.add(64);
		numbers.add(1);
		
		
		//Sorting Integers using an Anonymous Class using the -num1.compartTo(num2) returns the numbers in reverse order

		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return -num1.compareTo(num2);
			}
			
		});
		
		//displays the list line by line ex:
		//1
		//2
		//9
		//45
		//64
		
		for(Integer number: numbers){
			System.out.println(number);
		}
		
		
		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return num1.compareTo(num2);
			}
			
		});
		
		for(Integer number: numbers){
			System.out.println(number);
		}
		
		
		
		System.out.println("\nDisplying the list Object also shows the list naturally sorted");
		//displays the list as an object ex: [1,2,9,45,64]
		System.out.println(numbers);
		
		
		
		/////////////////////Sorting Objects////////////////////////////////
		
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(4,"Thomas"));
		people.add(new Person(7,"David"));
		people.add(new Person(1,"Joe"));
		people.add(new Person(2,"Mary"));
		people.add(new Person(3,"Paul"));
		people.add(new Person(6,"Ringo"));
		
		///this displays the List as created before sorting
		for(Person person: people){
			System.out.println(people);
		}
		
		//the sorting command using Anonymous Comparator class is needed to sort an Object
		Collections.sort(people, new Comparator<Person>(){
//implements the compare method below on what to sort by.
			@Override
			public int compare(Person p1, Person p2) {
				
				//The ID of each object is called using if then else then a  getId() method and compared with the other object's ID
				
				
				if (p1.getId() > p2.getId()){
					return 1;
				}
				else if(p1.getId()<p2.getId()){
					return -1;
				}
					return 0;
				
				
			}
			
			
			
			
		});
		
		
		///this displays the List as after sorting before sorting
				for(Person person: people){
					System.out.println(people);
				}
		
		
		///sort by name
		
		Collections.sort(people, new Comparator<Person>(){
			//implements the compare method below on what to sort by.
						@Override
						public int compare(Person p1, Person p2) {
							
							//The ID of each object is called using if then else then a  getId() method and compared with the other object's ID
							
							
							
								return p1.getName().compareTo(p2.getName());
							
							
						}
						
						
						
						
					});
					
		
		
		
		
		
		
		///this displays the List as after sorting before sorting
		for(Person person: people){
			System.out.println(people);
		}
		
		
		
		
		
		
		

	}

}
