# Password-Validation
---

## Indice:
- [Sobre](#-sobre)
- [Criterios de validação](#-Criterios-de-validação)
- [Técnologias usadas](#-Técnologias-usadas)
- [Pré-Requisitos](#-Pré-Requisitos)
- [Classes de serviços principais](Classes-de-serviços-principais)
- [Classes de teste unitário](Classes-de-teste-unitário)
- [Como baixar o projeto](Como-baixar-o-projeto)
- [Como iniciar o serviço](Como-iniciar-o-serviço)
- [Como realizar chamadas no serviço](Como-realizar-chamadas-no-serviço)

## Sobre

A API Password-Validation tem como objetivo realizar validações de senhas de acordo com o seu critério, retornado **TRUE** quando ela for válida e **FALSE** quando ela for inválida.

---

## Criterios de validação:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial(!@#$%^&*()-+)
- Não possuir caracteres repetidos dentro do conjunto

---

## Técnologias usadas:

- [Java JDK 15](https://www.oracle.com/java/technologies/javase/15-relnote-issues.html)
- [Spring Framework Versão 2.4.1](https://spring.io/projects/spring-framework)
- [Maven Versão 3.6.3](https://maven.apache.org/plugins/maven-war-plugin/index.html)
- [GIT Versão 2.24.1](https://git-scm.com/)

---

## Pré-Requisitos:

- Java JDK 15 instalado.
- Maven versão 3.6.3 ou superior instalado.
- Postman instalado.
- GIT versão 2.24.1 instalado

---

## Classes de serviços principais:

#### Clase de implementação e lógica da API
- PasswordValidationServiceImpl

#### Classe controladora
- PasswordValidationController

#### Classe de inicialização da aplicação:
- PasswordValidationApplication

---

## Classes de teste unitário:

- PasswordValidationServiceImplTest

- PasswordValidationApplicationTests

---

## Como baixar o projeto:

- Com o seu terminal de preferencia, digite o seguinte comando:

```bash
# Irá baixar todo o projeto localmente em sua máquina
$ git clone https://github.com/LeoFernandes193/Password-Validation.git
```

---

## Como iniciar o serviço:

- Após ter feito o clone do projeto, use o seu terminal de preferencia, e acesse o local do projeto.
- Dentro do diretório rode o seguinte comando:

```bash
# Irá limpar todos os arquivos compilados que você possui, certificando-se de que você está realmente compilando cada módulo do zero.
$ mvn clean install
```
- Certifique-se que nenhuma outra aplicação esteja usando a porta local 8080.
- Na sua IDE de preferencia, acesse a classe de inicialização(PasswordValidationApplication) e aperte o botão start.

---

## Como realizar chamadas no serviço:

#### Abra o postman na sua máquina e faça as seguintes configurações:
- Configure sua requisição para ser um **POST**.
- Use o seguinte end-point para realizar chamadas:
```postman
http://localhost:8080/password-validate
```
- Configure os parametros para ser **Headers**
- No campo **KEY** use o seguinte parametro: **password**
- No campo **Value** passe uma **String**. **Exemplo:** AbTp9!fok
- Verifique o resultado no Postman, caso sua senha seja válida, a API irá retornar um boolean **TRUE**, caso a  senha não seja válida, a API irá retornar um boolean **FALSE**

---
#### Desenvolvido por:
- **Leonardo Perez Fernandes**




