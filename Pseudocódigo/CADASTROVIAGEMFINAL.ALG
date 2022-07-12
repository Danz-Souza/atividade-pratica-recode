Algoritmo "Dviagem"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Daniel Souza
// Data atual  : 11/07/2022.
Var
   nome,sobrenome,email,senha,pais,destino,destino1: vetor [1..3] de CARACTERE
   resp: caractere
   i, opcao: inteiro
   paris: caractere
   rio: caractere
   japao: caractere
Inicio
   paris <- "paris"
   rio <- "rio de janeiro"
   japao <- "japão"
   escreval("===================")
   Escreval ("=AGENCIA DE VIAGENS Dviagem")
   escreval("===================")
   repita
      escreval ("[1] - CADASTRAR CLIENTE")
      escreval ("[2] - CADASTRAR DESTINO")
      leia (opcao)
      limpatela
      escreval ("=ESCOLHA UMA OPÇÃO VÁLIDA=")
   ate (opcao=1) ou (opcao=2)
   LIMPATELA
   escolha opcao
   caso 1
      para i de 1 ate 1 faca
         ESCREVAL ("=CADASTRO DE CLIENTE=")
         escreval ("Nome do cliente",i,":" )
         leia (nome[i])
         escreval ("Sobrenome do cliente",i,":" )
         leia (sobrenome[i])
         escreval ("Digite seu e-mail",i,":" )
         leia (email[i])
         escreval ("Digite sua senha",i,":" )
         leia (senha[i])
         escreval ("Qual seu país?",i,":" )
         leia (pais[i])
         escreval ("De qual cidade você é?",i,":" )
         leia (destino[i])
         escreval ("Para qual cidade você vai?",i,":" )
         leia (destino1[i])
         LIMPATELA
         escreval ("=ESCOLHA UMA OPÇÃO VÁLIDA=")
      fimpara
      LIMPATELA
      escreval ("=CLIENTES CADASTRADOS=")
      escreval ("======================")
      se (destino1[i] = paris) entao
         escreval(nome[i]," Com o destino ", destino1[i]," irá custar: R$ 1200")
      senao se (destino1[i] = rio) entao
         escreval(nome[i]," Com o destino ", destino1[i]," irá custar: R$ 450")
      FIMSE
      se (destino1[i] = japao) entao
         escreval(nome[i]," Com o destino ", destino1[i]," irá custar: R$ 2500")
      FIMSE
   caso 2
      escreval ("=CADASTRO DE DESTINO=")
      para i de 1 ate 2 faca
         escreval ("Destino", i, ":")
         leia (destino[i])
      fimpara
      LIMPATELA
      escreval ("=DESTINOS CADASTRADOS=")
      escreval ("======================")
      para i <- 1 ate 2 faca
         escreval (destino[i])
      fimpara
   fimescolha

Fimalgoritmo
