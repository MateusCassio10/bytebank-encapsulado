
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		paulo.setNome("paulo silveira");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		// em duas linhas ,usando uma variável temporária,chamada: "titularDaConta"
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
	}

}
