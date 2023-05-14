programa
{
	
	funcao inicio()
	{
		inteiro horaInicial, horaFinal, inicioExtra, fimExtra
		escreva("Inicío da jornada de trabalho: ")
		leia(horaInicial)
		escreva("Fim da jornada de trabalho: ")
		leia(horaFinal)
		escreva("Inicío da hora extra de trabalho: ")
		leia(inicioExtra)
		escreva("Fim da hora extra de trabalho: ")
		leia(fimExtra)
		inteiro horaTotal = horaFinal - horaInicial
		inteiro extraTotal = fimExtra - inicioExtra
		real calculoHora = horaTotal * 10
		real calculoExtra = extraTotal * 15

		escreva("O salário bruto diário do funcionário é de " + (calculoHora + calculoExtra) + " Reais")
		escreva("\nO salário brunto mensal do funcionário é " + (calculoHora + calculoExtra)*30 + " Reais")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 719; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */