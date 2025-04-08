# Hora-de-Codar-Kotlin-8
Projeto onde se estimula a criação de um Simulador de Animal de Estimação Virtual, permitindo cuidar do seu próprio animal de estimação virtual e aprender sobre programação orientada a objetos ao mesmo tempo.

Descreva o seu Pet
O animal de estimação virtual possui os seguintes atributos:
- Nome
- Nível de fome: um número inteiro que representa a fome do animal. Quanto maior, maior a fome.
- Nível de felicidade: um número inteiro que representa o quão feliz o animal está. Quanto maior, maior a felicidade.)

O animal de estimação virtual possui os seguintes comportamentos (métodos):
- Alimentação: Diminui o nível de fome em uma certa quantidade.
- Brincar: Aumenta o nível de felicidade em uma certa quantidade.
- Verificando status: Exibe o status atual do animal de estimação (nome, nível de fome, nível de felicidade)

O bichinho virtual também simula a passagem do tempo, onde o nível de fome aumenta gradativamente ao longo do tempo.

Há uma interface de usuário onde os usuários possam interagir com o animal de estimação virtual escolhendo ações (alimentar, brincar, verificar status).
Interagir para entender
1. Explore o Simulador: Entre no mundo do Simulador de Animal de Estimação Virtual e mergulhe na experiência! Experimente jogar um pouco, familiarize-se com o funcionamento do jogo e estabeleça alguns objetivos para si mesmo. Observe atentamente se tudo se comporta como você espera.
2. Adicione um Atributo de Cansaço: Agora é hora de elevar o nível do jogo! Experimente adicionar um novo atributo chamado "cansaço" ao bichinho virtual, juntamente com um método correspondente. Quanto mais o bichinho virtual brinca, mais cansado ele fica. Teste se a adição desse novo elemento funciona conforme o esperado.
3. Mas espera, se o bichinho virtual fica cansado, também é crucial que ele possa descansar, não é mesmo? Adicione um método que permita ao bichinho virtual descansar e diminuir o valor do atributo "cansaço". Vamos dar uma chance a essa nova funcionalidade?
4. Eleve o Nível: Agora é hora de levar as coisas para o próximo nível! Vamos criar um novo atributo chamado "idade" para o bichinho virtual. Sempre que o tempo passar, a idade do bichinho virtual aumentará em um! Prepare-se para dar um passo adiante e enriquecer ainda mais a experiência do jogo.

Agora que você adicionou um novo atributo, é hora de atualizar o método que exibe o status do bichinho virtual. Certifique-se de que o método "verificarStatus" agora também exibe a idade do bichinho virtual. Teste se a nova funcionalidade está funcionando conforme o esperado.
Aprofundando nas Regras

Agora crie um menu para o usuário interagir com o bichinho virtual. O menu deve ter as seguintes opções:
1. Alimentar o bichinho virtual.
2. Brincar com o bichinho virtual.
3. Descansar o bichinho virtual.
4. Verificar o status do bichinho virtual.
5. Sair do jogo.

Fica estabelecido que:
1. O objetivo do jogador é chegar à idade 50.
2. Se o jogador chegar ao nivel 100 de cansaço ou fome, ele perde.
3. Sempre que o tempo passar o nivel de felicidade diminui em 30.
4. Sempre que o tempo passar o nível de cansaço aumenta em 10.

Alguns ajustes que você fará neste programa:
1. O Bichinho Virtual não pode chegar ao nível 100 de fome ou o jogador perde.
2. O Bichinho Virtual não pode chegar ao nível zero de felicidade ou o jogador perde.
3. Sempre que o tempo passar, é necessário reduzir o nível de fome e de felicidade em 3 por dia passado.
4. Sempre que o tempo passar o nivel do Bichinho Virtual deve subir em um. 

Abaixo estão algumas outras sugestões de melhorias que podemos fazer ao nosso bichinho virtual:
- Sempre que o bichinho for descansar é necessário informar por quanto tempo ele descansaria, assim, sempre que chegar a 8 horas de descanso o bichinho estará completamente descansado.
- Implemente um medidor de vontade de ir ao banheiro que aumenta sempre que o bichinho se alimenta.
- Implemente um medidor de sujeira que aumenta sempre o bichinho brinca.
- Se o bichinho chegar a um nível limite (que você vai definir) de vontade de ir ao banheiro ou de sujeira, o jogador perde no jogo. 
