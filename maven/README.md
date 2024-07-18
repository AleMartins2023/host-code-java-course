# Comandos

- Conferir instalação e versão da jdk instalada ```javac -version```
- Acesso ao comando básico do Mave ```mvn```. Caso não reconheça, encaminhe até a pasta bin do apache-mave e repita o comando. Para ter o acesso sem precisar entrar na pasta, adicione o caminho no path do sistema do Windows (variável que contém os utilitários do ambiente shell).

## Criando a pasta de trabalho

- No prompt de comando, acesse a pasta que hospedará o projeto.
- ```mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false``` -> busca um arquétipo (no caso, maven-archetype-quickstart) que é um template que existe remotamente com uma estrutura de projeto java pré-definido.


## Outros comandos

- Para compilar as classes: ```mvn compile```.
- Para testar a aplicação: ```mvn test```.
- Gerar o jar da aplicação: ```mvn package```.
- Para limpar o diretório de trabalho: ```mvn clean```.


## Exemplos de arquetypes para teste

- [Maven Archetype Webapp](https://maven.apache.org/archetypes/maven-archetype-webapp/)

