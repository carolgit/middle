package main.java.hello.face;

import main.java.hello.FisicalPerson;
import main.java.hello.JuridicalPerson;
import main.java.hello.PersonImpl;

public interface Person {
	public FisicalPerson createPF(String firstName, String lastName, String cpf);
	public JuridicalPerson createPJ(String firstName, String lastName, String cnpj, String rs);
}
