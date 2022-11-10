/**
* @file   Atividade8.java
* @brief  Imprime uma certa tabela
* @author Julia Alice Leao
* @date   2022-10-05
*  -- juliaaliceleao@ufmg  --
*/

public class Atividade08Tabela
{
	public static void main(String args[])
	{
        //Variables Statements
        int n = 10;

        //For Loop: to All the Numbers in the range between 1 a n
		for(int number = 1; number <= n; number++)
        {
            //multiplying "number" to each number < ou = a ele
            for(int counter = 1; counter <= number; counter++)
            {
                int result = number * counter;
                System.out.print(result + " ");
            }
             System.out.print("\n");
        } 
	}
}
