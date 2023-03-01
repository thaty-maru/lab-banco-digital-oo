
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Thatianne");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.depositar(250);
		cc.transferir(180, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
