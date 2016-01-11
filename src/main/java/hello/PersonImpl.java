package main.java.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import main.java.hello.face.Person;

@Entity
public class PersonImpl implements Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	private String lastName;

	public PersonImpl() {
	}

	public PersonImpl(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public FisicalPerson createPF(String firstName, String lastName, String cpf) {
		this.firstName = firstName;
		this.lastName = lastName;
		return new FisicalPerson(cpf, this);
	}

	@Override
	public JuridicalPerson createPJ(String firstName, String lastName,
			String cnpj, String rs) {
		this.firstName = firstName;
		this.lastName = lastName;
		return new JuridicalPerson(cnpj, rs, this);
	}

	@Override
	public String toString() {
		return String.format("PersonImpl [id=%s, firstName=%s, lastName=%s]",
				id, firstName, lastName);
	}

}
