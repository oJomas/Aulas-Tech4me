programa
{
	
	funcao inicio()
	{
		inteiro resultado, fatorial = 1
		cadeia pulaLinha = "\n"
		faca{
			escreva("Qual fatorial será calculado acima de 0? \n")
			leia(resultado)
			limpa()
		}enquanto(resultado <= 1)
		
		enquanto(resultado > 0) {
			fatorial = fatorial * resultado
			resultado--
			escreva("Fatorial: " + fatorial + pulaLinha)
		}
			


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */