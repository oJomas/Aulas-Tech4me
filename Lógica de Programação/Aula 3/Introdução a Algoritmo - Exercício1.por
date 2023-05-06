programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3
		escreva("Qual a nota do aluno? " + "\n")
		leia(nota1, nota2, nota3)
		real media = (nota1 + nota2 + nota3)/3
		
		se(media >= 7) {
			escreva("Parabéns, você foi aprovado!!!")
		}senao se(media <= 4) {
			escreva("Infelizmente você foi reprovado!")	
		}senao {
			escreva("Você está de recuperação")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */