programa
{
	
	funcao inicio()
	{
		inteiro num1, maior = 0
		cadeia pulaLinha = "\n"
		faca {
			limpa()
			escreva("Escolha um número ou -1 para finalizar: \n ")   
			leia(num1)
			se(num1 < -1){
				escreva("Não digite um número negativo Tecle enter")
				cadeia enter
				leia(enter)
			}
			se(num1 > maior){
				maior = num1
			}
		}enquanto(nao(num1 == -1))
			escreva("O maior número foi o: " + maior)
		}	
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */