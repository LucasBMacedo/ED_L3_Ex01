📁 Projeto: Quantidade de Dígitos (Recursivo)

📌 Descrição: >
  Aplicação em Java que calcula recursivamente a quantidade de dígitos de um número inteiro positivo.
  A cada chamada, o número é dividido por 10 até que reste apenas um dígito.

🗂️ Estrutura de Arquivos:

  📄 src/controller/QtdDeNumeros.java:
    - Contém o método recursivo que calcula a quantidade de dígitos do número informado.

  📄 src/viewer/Principal.java:
    - Responsável pela interação com o usuário via JOptionPane, obtendo a entrada e exibindo o resultado.

🧠 Lógica da Recursividade:
  método: qtdResultado(int numero)
  explicação:
    - ✋ Condição de parada: Se `numero < 10`, retorna 1, pois o número tem apenas um dígito.
    - 🔁 Relação recursiva: Retorna `1 + qtdResultado(numero / 10)`, ou seja, reduz o número retirando o último dígito a cada chamada.

💬 Exemplo de Execução:

  entrada:
    - Número: 2457
  
  saída:
    - A quantidade de dígitos de 2457 é: 4

📥 Entrada:

- O usuário insere um número inteiro positivo por meio de uma caixa de diálogo (JOptionPane).

📤 Saída:

- O programa exibe em um JOptionPane a quantidade de dígitos contida no número informado.

📌 Observações:

- A divisão inteira por 10 (`numero/10`) remove o último dígito do número a cada chamada recursiva.
- A função lida apenas com números inteiros positivos maiores que zero.
- Código limpo, modularizado e de fácil compreensão e manutenção.

👨‍💻 Autor: Criado por Lucas Bezerra de Macedo.
