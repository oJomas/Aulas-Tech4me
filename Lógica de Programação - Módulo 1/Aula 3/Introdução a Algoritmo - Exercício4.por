programa
{
	funcao inicio()
	{
	real salario, vendas
	escreva("Qual o salário do funcionário? \n")
	leia(salario)
	escreva("Quanto que o funcionário vendeu? \n")
	leia(vendas)
	limpa()
	real comissao =  0.04 * vendas
	
	escreva("A comissão do funcionário é de " + comissao + " reais" + "\n")
	escreva("O salário total do funcionário é de " + (salario + comissao) + " reais" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */