,,01. CRUD's (Cadastro, Alteração, Deleção e Listagem):
• O sistema deve ter no mínimo 3 CRUD's, permitindo o cadastro, alteração, 
deleção e listagem de informações relevantes para o contexto do projeto.

Crud 1 - Usuario 
Crud 2 - Produtora 
Crud 3 - Jogos


2. Relação entre CRUD's:
• É necessário estabelecer uma relação entre pelo menos 2 dos CRUD's. Um deles 
deve possuir uma chave estrangeira para estabelecer essa relação.

Relação: Jogos e Produtora


3. Super Classe:
• O sistema deve apresentar uma super classe que contenha atributos e métodos 
comuns a diferentes entidades do projeto, promovendo a reutilização de código 
e a organização da estrutura de classes.

SuperClasse: Usuario



4. Classe Abstrata:
• É preciso implementar pelo menos uma classe abstrata que sirva como base para 
outras classes. Essa classe abstrata deve conter pelo menos um método abstrato 
que será implementado nas classes filhas.

Classe Abstrata: usuario


5. Polimorfismo de Sobrescrita:
• Deve-se utilizar o conceito de polimorfismo de sobrescrita, onde um método da 
classe pai é redefinido nas classes filhas para se adequar às suas particularidades.

Cliente 
Funcionario

6. Polimorfismo de Sobrecarga:
• Utilize o polimorfismo de sobrecarga ao implementar métodos com o mesmo 
nome, mas com assinaturas diferentes, para lidar com situações específicas do 
projeto.



7. Classes
Usuario (superclasse e abstrata) (Nome, cpf, endereço, telefone, email, senha) - 

extends:
Cliente (Nome, cpf, endereço, telefone, email, senha) e 
Funcionário (Nome, cpf, endereço, telefone, email, senha, salário)

Produtora ( nome, Fundação, avaliação ) 

Jogos (Plataforma, genero, valor, descrição, versão, produtora) 
"# Scream" 
