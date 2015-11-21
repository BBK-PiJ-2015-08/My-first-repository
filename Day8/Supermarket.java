public class Supermarket implements PersonQueue {
	private Person personListStart = null;


	public void addPerson(Person person) {
		//Supermarket.insert(Person person);
		if (this.personListStart == null) {
			this.personListStart = person;
		} else {
			
			//add one side, retrieve from other.
		}
	}

	public void servePerson() {
		Supermarket.retrieve();
	}

	public static void main(String[] args) {

	}
}
