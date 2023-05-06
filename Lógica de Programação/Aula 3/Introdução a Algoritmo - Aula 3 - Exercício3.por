programa
{
	
	funcao inicio()
	{
		inteiro calculadora[11] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		
		inteiro a = 0
		inteiro numerador
		leia(numerador)
		

		para(inteiro i = 0; i < 11; i++) {
			escreva("O cálculo de " + i + " vezes "+ numerador + " é igual a " + calculadora[a] * numerador  )
			escreva("\n")
			a++
		}
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {calculadora, 6, 10, 11}-{a, 8, 10, 1}-{numerador, 9, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */