package main.java.hello;

public class FisicalPerson {
	private String cpf;
	private PersonImpl person;
	
	public FisicalPerson(String cpf, PersonImpl person) {
		super();
		this.cpf = cpf;
		this.person = person;
	}

	@Override
	public String toString() {
		return String.format("FisicalPerson [cpf=%s, person=%s]", cpf, person);
	}
	
}
