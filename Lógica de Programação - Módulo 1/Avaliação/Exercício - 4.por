programa
{
	
	funcao inicio()
	{
		inteiro peca = 0, relogio
		cadeia pulaLinha = "\n"
		faca{
			escreva("Digite 1 para sim e 2 para não" + pulaLinha)
			escreva("É um relógio?" + pulaLinha)
			leia(relogio)
			limpa()
			se(relogio == 1){
				limpa()
				peca++
				escreva("Uma peça foi adicionada: " + peca + pulaLinha)
					
			}senao se(relogio >= 2){
				escreva("O total de peças produzidas foi: " +  peca + " peças")
				}
		}enquanto(relogio == 1)



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */