package main.java.start;

import main.java.hello.FisicalPerson;
import main.java.hello.JuridicalPerson;
import main.java.hello.PersonImpl;

public class Start {
	public static void main(String[] args) {
		PersonImpl person = new PersonImpl("Ana", "Ferreira");
		FisicalPerson fisicalPerson = person.createPF(person.getFirstName(), person.getLastName(), "999.999.999-00");
		JuridicalPerson juridicalPerson = person.createPJ(person.getFirstName(), person.getLastName(), "93251hkjehrw", "3465uhlkh24");
		
		System.out.println(fisicalPerson);
		System.out.println(juridicalPerson);
	}
}
