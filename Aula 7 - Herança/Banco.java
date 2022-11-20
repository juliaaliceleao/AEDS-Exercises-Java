public class Banco
{
    private static int i = 0;
    Conta[] ArrayConta = new Conta[8];

    public void adiciona(Conta c)
    {
        this.ArrayConta[i] = c;
        i++;
    }
    public Conta pegaConta(int x)
    {
        return this.ArrayConta[i];
    }
    public int pegaTotalDeContas()
    {
        return this.ArrayConta.length;
    }
}
