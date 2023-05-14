programa
{
	
	funcao inicio()
	{
		cadeia nome, remedio, dosagem, pulaLinha = "\n", receituario
		faca{
			escreva("Digite o nome do paciente:" + pulaLinha)
			leia(nome)
			escreva("Digite o nome do remédio ou finalize digitando[FIM]" + pulaLinha)
			leia(remedio)
			se(nao(remedio == "fim" ou remedio == "Fim" ou remedio== "FIM")){
				escreva("Digite a dosagem do paciente:" + pulaLinha)
				leia(dosagem)
				receituario = "Nome: " + nome + " | " + "Remédio: "+ remedio + " | " + "Dosagem: " + dosagem
				receituario = receituario + pulaLinha
				limpa()		
			}senao{
				limpa()
				remedio = "fim"
			}	
		}enquanto(remedio != "fim")	
			escreva("Operação realizada com sucesso!" + pulaLinha)
			escreva(receituario)
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */