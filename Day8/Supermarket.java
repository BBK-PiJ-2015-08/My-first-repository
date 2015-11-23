public class Supermarket {
	private PersonQueue queue;

	public Supermarket() {
		queue = new PersonQueue();
	}

	//personListStart = null;


	public void addPerson(Person newPerson) {
		//Supermarket.insert(Person person);
		if (this.personListStart == null) {
			this.personListStart = person;
		} else {
			
			//add one side, retrieve from other.
		}
	}

	public static void servePerson() {
		PersonQueue.retrieve();
	}

	public static void main(String[] args) {

	}
}
