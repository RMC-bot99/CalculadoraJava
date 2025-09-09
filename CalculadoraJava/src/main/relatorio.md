# Relatório do Projeto - Calculadora Java (v1.0)

## Autores
- Rodrigo Madeira Cervantes
- Cauan Henrique Silva

## Descrição do Projeto
Este projeto implementa uma calculadora básica em Java com as quatro operações matemáticas fundamentais: soma, subtração, multiplicação e divisão.

## Funcionalidades Implementadas

### Classe Calculadora
- **Método somar()**: Realiza a operação de adição entre dois números
- **Método subtrair()**: Realiza a operação de subtração entre dois números  
- **Método multiplicar()**: Realiza a operação de multiplicação entre dois números
- **Método dividir()**: Realiza a operação de divisão com tratamento de divisão por zero

### Classe Main
- Interface interativa com entrada de dados do usuário
- Demonstração com valores fixos
- Tratamento de exceções para divisão por zero
- Mensagens de erro amigáveis

## Melhorias Implementadas
- Adicionada documentação JavaDoc completa
- Organização em package `calculadora`
- Tratamento robusto de exceções
- Interface de usuário mais amigável
- Código limpo e bem documentado

## Como garantiríamos a integridade dessa versão?
- **Revisão por pares**: Todos os códigos passam por revisão antes do merge
- **Testes manuais**: Validação de todas as operações matemáticas
- **Mensagens de commit claras**: Descrevem exatamente o que foi alterado
- **Versionamento por tags**: Marcação de versões estáveis
- **Proteção da branch main**: Apenas merges aprovados são aceitos
- **Tratamento de exceções**: Validação de entrada e operações inválidas

## Histórico de commits
Cole aqui um resumo do `git log --oneline --decorate --graph --all` após os merges.

```text
(colar saída aqui)
```

## Procedimento realizado
1. Criada branch `feature-calculadora-basica`
2. Implementada classe Calculadora com operações básicas
3. Implementada classe Main com interface interativa
4. Adicionada documentação JavaDoc
5. Realizados commits com mensagens claras
6. Aberto Merge Request para `main`, revisado e aprovado
7. Realizado merge e criada a tag `v1.0`

## Como executar o projeto
```bash
# Compilar o projeto
javac -d . CalculadoraJava/src/main/Calculadora.java CalculadoraJava/src/main/Main.java

# Executar o programa
java calculadora.Main
```

