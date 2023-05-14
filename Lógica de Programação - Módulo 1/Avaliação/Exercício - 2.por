programa
{
	
	funcao inicio()
	{
		cadeia produto, pulaLinha = "\n"
		real valor, dinheiro = 0.90, pix = 0.95
		inteiro pagamento, operacao
		faca{
			faca{
				escreva("Digite o produto que deseja ou caso queira sair digite[Fim]" + pulaLinha)
				leia(produto)
				se(nao(produto == "Fim" ou produto == "FIM" ou produto == "fim")){
					escreva("Digite o valor do produto:" + pulaLinha)
					leia(valor)
					limpa()
				}senao{
					produto = "FIM"
				}
			}enquanto(produto != "FIM")
				limpa()
				escreva("A forma de pagamento vai ser [1] para Dinheiro ou [2] para o Pix" + pulaLinha)
				leia(pagamento)
				limpa()
				escreva("O valor bruto foi de " + valor + "R$" + pulaLinha)
				
				escolha(pagamento){
					caso 1:
						valor = valor * dinheiro
					pare
					caso 2:
						valor = valor * pix
				}
				escreva("O valor com desconto foi de " + valor + "R$" + pulaLinha)
				escreva("Deseja confirma? [1 para Sim ou 2 para Não]" + pulaLinha)
				leia(operacao)
				escolha(operacao){
					caso 1:
						escreva("A venda foi realizada com sucesso!")
						pare
					pare
					caso 2:
						escreva("A venda foi cancelada!")
						pare
				}			
		}enquanto(produto != "FIM")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */