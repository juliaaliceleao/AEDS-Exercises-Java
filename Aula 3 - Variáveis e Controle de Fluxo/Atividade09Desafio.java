public class Atividade09Desafio
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
        //1 VARIAVEL
        int NumberA = 1;

        System.out.print("Serie Fibonacci (100 primeiros números): \n");

        //Estrutura Condicional
        while(Atividade06Fibonacci.fibo(NumberA) <= 100) 
        {
            System.out.print(Atividade06Fibonacci.fibo(NumberA) + "\t");
            NumberA++;
        }
    }
}
