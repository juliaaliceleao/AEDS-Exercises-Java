public class ContaCorrente extends Conta 
{
    public void atualiza(double taxapercentual) 
    {
        this.saldo += this.saldo * (taxapercentual * 2);
    }
    public void deposita(double valordepositado) 
    {
        this.saldo += valordepositado - 0.10;
    }
}
