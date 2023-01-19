 ## **Cadastro de alunos**
 Um sistema de cadastrar alunos com API REST,  onde a Entidade "Student" possui suas propriedades como:
 * id
 * name
 * studenRA
 * enrolled
 * classes
 * teachers

Obs: A classe Student possui relacionamento com as entidades "Classes" e "Teacher" de 1:N

**Para executar o projeto no terminal, digite o seguinte comando:**
> mvn spring-boot:run

 **Pré-requisitos para a execução do projeto**

 1. Java 19
 2. Apache Maven 3.8.7
   
   Após executar o comando *mvn spring-boot:run* , o caminho de visualizar e executar os comandos REST é
   > http://localhost:8080/api/students 

   
\
 Desenvolvido com aprendizado da trilha de java da Digital Innovation One, muito grato ao instrutor: **Rodrigo Peleias** 