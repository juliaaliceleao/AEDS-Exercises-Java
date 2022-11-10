public class Atividade06Fibonacci
{
    static long fibo(int num)
    {
        if (num == 1) 
        { return 0; }

        if (num == 2 || num == 3)
        { return 1; }

        else 
        { return fibo(num - 1) + fibo(num - 2); }
    }
    public static void main(String[] args) 
    {
        //Variaveis
        int ntermos = 1;

	    // teste do programa. Imprime os 100 primeiros termos
        System.out.print("Serie Fibonacci (100 primeiros números): \n");

        //Estrutura Condicional
        while(Atividade06Fibonacci.fibo(ntermos) <= 100) 
        {
            System.out.print(Atividade06Fibonacci.fibo(ntermos) + "\t");
            ntermos++;
        }

    }
}
