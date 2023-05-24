<B>⚠️ Repositório em construção!</B>

</br>
</br>


<h1 align="center" >
 Challenge ONE | Java | Back-end | Hotel Alura
</h1>
</br>

<p align="center" >
     <img width="500" heigth="400" src="https://user-images.githubusercontent.com/101413385/173164615-192ca98a-1a44-480e-9229-9f82f456eec8.png">

</p>

</br>


## Sobre o projeto

<b>Cenário:</b>


O Hotel Alura, conhecido por suas espetaculares instalações e pacotes promocionais para Desenvolvedores de Software, está tendo problemas para acompanhar as reservas feitas por seus clientes, razão pela qual solicitam nossa ajuda para desenvolver um sistema de reservas que contenha:

* Sistema de autenticação de usuários para que somente usuários pertencentes ao hotel possam acessar o sistema;
* Permitir criar, editar e excluir uma reserva para clientes;
* Pesquisar na base de dados toda a informação de clientes e reservas;
* Registrar, editar e excluir os dados dos hóspedes;
* Calcule o valor da reserva com base no número de dias da reserva e uma taxa diária com o valor atribuído por você na moeda Real. Por exemplo, se tivermos uma reserva de 3 dias e o valor de nossa diária for de R$20 devemos multiplicar esses 3 dias pelo valor da diária, totalizando R$60. Tudo isso deve ser feito automaticamente e mostrado ao usuário antes de salvar a reserva;
* Banco de dados para armazenar todos os dados solicitados anteriormente.

A parte visual do projeto foi disponibilizada pela One, sendo necessário desenvolver somente a parte lógica do programa. 
</br>

[
https://github.com/AndMqs/trilha-java-developer/assets/93685200/225845f5-c326-4e73-a310-977e4d0e40f9.mp4](https://github.com/AndMqs/Hotel-Alura/assets/93685200/37107edf-7d07-450a-ad54-69d0148c9064
)


## Desenvolvendo o Código

### Menu principal
* Botão de login que ao ser clicado deve levar à janela de login
* Botão Sair que deve perguntar ao usuário se ele realmente deseja sair do aplicativo.

### Janela de login
Por "debaixo dos panos", devemos verificar se os dados inseridos estão corretos ou incorretos e notificar o usuário sobre esse status, por exemplo, se os dados estiverem incorretos, uma mensagem deve ser mostrada ao usuário dizendo "Nome de usuário e senha inválidos"


### Janela do menu usuario
Nesta janela as opções serão apresentadas quando o usuário autenticado estiver dentro do sistema, você tem as seguintes opções:

* Reserva: Você deve ir para a janela de Reservas
* Buscar: Deve levá-lo para a janela Sistema de Busca.
* Sair do Sistema: Você deve ir para a janela de Login

### Janela de reservas

A janela de Reservas deve permitir que o usuário registre os seguintes dados:

* Dia de chegada
* Dia de saída
* Valor da reserva, que será calculado com base em um valor diário fixo que você mesmo pode escolher.
* Forma de pagamento onde o usuário pode escolher entre:
* Cartão de crédito
* Cartão de débito
* Boleto
* Botão continuar  </br>
É importante que no momento de guardar os dados seja gerado um número de reserva que será utilizado automaticamente na seção de Registo de Hóspedes, pois será um campo que o usuário não poderá manipular.
 </br>
Lembre-se de que você deve notificar o usuário tanto para o registro bem-sucedido dos dados quanto para a ocorrência de um erro.

### Janela de registro de hospedes

Esta seção terá os dados pessoais dos hóspedes com os seguintes campos:

* Nome
* Sobrenome
* Data de nascimento
* Nacionalidade
* Telefone
* Número de reserva que foi gerado anteriormente.
</br>
Lembre-se de que você deve notificar o usuário tanto para o registro bem-sucedido dos dados, quanto para a ocorrência de um erro.
</br>
Mostre o número da reserva como uma mensagem para o usuário.

### Sistema de busca

Esta seção deve permitir que o usuário pesquise as informações que estão em nosso banco de dados.

Existem dois critérios de pesquisa:
- Sobrenome
- Número da reserva

Esses dados serão apresentados através de duas tabelas, ao selecionar qualquer registro o usuário poderá editar ou excluir o referido registro.

### Editar dados da reserva e do hospede
Caso o usuário precise editar alguma informação, clicar no registro a ser modificado e no ícone de edição deverá permitir modificar os dados. Uma vez efetuada a modificação, o usuário deverá ser notificado que as alterações foram salvas ou se houve algum erro.


### Deletar dados do hospede e da reserva
Caso o usuário precise deletar um registro, clicar no registro a ser eliminado e no ícone de apagar deverá permitir deletar os dados. Uma vez efetuada a modificação, o usuário deverá ser notificado que as alterações foram feitas ou se houve algum erro, além de atualizar a tabela com os dados atualizados.
     
     
 ## 🖥️ Tecnologias Utilizadas:

- Java
- VSCode
- MySql
- Biblioteca JCalendar
- Plugin WindowBuilder 
</br>




