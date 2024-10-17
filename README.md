# Projeto Interface (POO)

Descrição:

Crie um sistema que simule diferentes tipos de transporte (Carro, Bicicleta, Ônibus). Todos os tipos de transporte devem implementar a interface Transporte, que terá um método chamado mover().

Requisitos:

1. Crie uma interface chamada Transporte com o seguinte método:
◦ void mover(): Este método deve ser implementado por todas as classes que
representam meios de transporte.

3. Crie as seguintes classes que implementam a interface Transporte:
◦ Carro: O método mover() deve imprimir: "O carro está se movendo pelas
estradas.".

◦ Bicicleta: O método mover() deve imprimir: "A bicicleta está sendo
pedalada.".

◦ Ônibus: O método mover() deve imprimir: "O ônibus está se movendo pela
rota urbana."

Dicas:

• Interface: A interface Transporte é o "contrato" que todas as classes de transporte
(Carro, Bicicleta, Ônibus) devem seguir.

• Polimorfismo: Ao usar a interface Transporte como tipo da variável, você poderá
tratar todos os meios de transporte de forma uniforme, independentemente da
classe concreta. 
