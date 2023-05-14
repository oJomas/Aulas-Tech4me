programa
{
	
	funcao inicio()
	{
		inteiro alunos, pcd //Deixei em "inteiro" para arredondar a porcentagem!
		
		escreva("Informe a quantidade total de alunos \n")
		leia(alunos)
		escreva("Informe a quantidade total de deficientes \n")
		leia(pcd)
		limpa()
			
		se(pcd > alunos){
			faca {	
				limpa()
				escreva("Por favor, coloque o número correto! \n")
				leia(pcd)
			}enquanto(pcd > alunos)
		}
		escreva("O percentual de PCDs da escola é de " + pcd * 100 / alunos + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */