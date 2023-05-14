programa
{
	
	funcao inicio()
	{
		real valor
		inteiro valor1 = 0
		faca {
		escreva("Digite um número ou zero para encerrar\n")
		leia(valor)
		se(valor >= 100 e valor <= 200){
			valor1++
		}
		limpa()
		}enquanto(valor != 0)
			escreva("Foram digitados " + valor1 + " números entre 100 e 200.")
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 62; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */