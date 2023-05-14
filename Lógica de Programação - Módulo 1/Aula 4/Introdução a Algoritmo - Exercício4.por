programa
{
	
	funcao inicio()
	{
		inteiro codigo
		real valor = 0.0
		inteiro qtd

		faca{
			escreva("Produto 1: Código - ABCD - R$5.30 \n")
			escreva("Produto 2: Código - XYPK - R$6.00 \n")
			escreva("Produto 3: Código - KLMP - R$3.20 \n")
			escreva("Produto 4: Código - QRST - R$2.50 \n")
	
			escreva("\nDigite o número do produto que deseja ou 0 para sair: ")
			leia(codigo)
			escreva("\nQual a quantidade desejada: ")
			leia(qtd)
	
			escolha(codigo){
				caso 1:
					valor += qtd * 5.30
					
				caso 2:
					valor += qtd * 6.00
					
				caso 3:
					valor = valor + qtd * 6.00
					
				caso 4:
					valor = valor + qtd * 6.00
					
				caso 0:
					pare
					
				caso contrario:
					escreva("Opção inválida.")
			}
		}enquanto(codigo != 0)
	escreva("O valor total da compra foi de R$" + valor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 759; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */