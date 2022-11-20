public class AtualizadorDeContas 
{
    protected double saldoTotal = 0;
    protected double selic;
    
    public AtualizadorDeContas(double selic)
    { this.selic = selic; }

    public void roda(Conta c)
    {
        System.out.println(c.getSaldo());       // impressao do saldo anterior 
        c.atualizar(selic);                     // atualizacao da conta
        System.out.println(c.getSaldo());       // impressao do saldo final

        saldoTotal += c.getSaldo();             // somar saldo final ao atributo saldoTotal  
    }
}
