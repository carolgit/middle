package main.java.hello;

public class JuridicalPerson {
	private String cnpj;
	private String rs;
	private PersonImpl person;

	public JuridicalPerson(String cnpj, String rs, PersonImpl person) {
		super();
		this.cnpj = cnpj;
		this.rs = rs;
		this.person = person;
	}

	@Override
	public String toString() {
		return String.format("JuridicalPerson [cnpj=%s, rs=%s, person=%s]",
				cnpj, rs, person);
	}
}
