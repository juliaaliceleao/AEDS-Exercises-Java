public class ContaPoupanca extends Conta 
{
    public void atualiza( double taxapercentual) 
    {
        this.saldo += this.saldo * (taxapercentual * 3);
    }
}
