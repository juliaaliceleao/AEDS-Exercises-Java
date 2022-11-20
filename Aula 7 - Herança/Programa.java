public class Programa
{
    public static void main(String[] args)
    {
        Conta MinhaConta = new Conta();
        AtualizadorDeContas Meuatualizador = new AtualizadorDeContas(2.00);

        MinhaConta.depositar(300);
        System.out.println("\nDeposito feito");
        System.out.println("Saldo Atual: " + MinhaConta.pegar());

        MinhaConta.sacar(4.5);
        System.out.println("Saque feito");
        System.out.println("Saldo Atual: " + MinhaConta.pegar());

        MinhaConta.atualizar(20);
        System.out.println("Conta atualizada");
        System.out.println("Saldo Atual: " + MinhaConta.pegar());

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar (1000);
        cp.depositar (1000);

        cc.atualizar (0.01);
        cp.atualizar (0.01);

        System.out.println("\nSaldo C.Corrente: " + cc.getSaldo());
        System.out.println("Saldo C.Poupança: " + cp.getSaldo());

        Banco meuBanco = new Banco();
        meuBanco.adiciona(cc);
        meuBanco.adiciona(cp);

        //criando novas contas 
        ContaCorrente cc1 = new ContaCorrente();
        meuBanco.adiciona(cc1);
        ContaPoupanca cp1 = new ContaPoupanca();
        meuBanco.adiciona(cp1);
        ContaCorrente cc2 = new ContaCorrente();
        meuBanco.adiciona(cc2);
        ContaPoupanca cp2 = new ContaPoupanca();
        meuBanco.adiciona(cp2);
        ContaCorrente cc3 = new ContaCorrente();
        meuBanco.adiciona(cc3);
        ContaPoupanca cp3 = new ContaPoupanca();
        meuBanco.adiciona(cp3);
        
        System.out.println();
        for(int j = 0; j < meuBanco.ArrayConta.length; j++)
        {
            Meuatualizador.roda(meuBanco.ArrayConta[j]);
            System.out.println();
        }
    }
}
