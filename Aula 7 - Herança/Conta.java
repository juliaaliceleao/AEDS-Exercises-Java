public class Conta 
{
    //atributos
    protected double saldo;
    //metodos
    //-- sacar
    public double getSaldo()
    { 
        return this.saldo; 
    }
    public double sacar(double valorsacado)
    {
        if(valorsacado > this.saldo)
        { return 0;  }
        this.saldo = this.saldo - valorsacado;
        return this.saldo;
    } 
    //-- depositar saldo na conta
    public double depositar(double valordepositado)
    {
        this.saldo = this.saldo + valordepositado;
        return this.saldo;
    } 
    //--pegar saldo
    public double pegar()
    {
        return this.saldo;
    }
    //--atualizar conta
    public void atualizar(double taxapercentual)
    {
        this.saldo +=  this.saldo * taxapercentual;
    }
}
