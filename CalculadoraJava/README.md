# Calculadora Java

Uma calculadora simples implementada em Java com as quatro operações matemáticas básicas.

## Funcionalidades

- ✅ Soma
- ✅ Subtração  
- ✅ Multiplicação
- ✅ Divisão (com tratamento de divisão por zero)

## Estrutura do Projeto

```
CalculadoraJava/
├── src/main/
│   ├── Calculadora.java    # Classe principal com as operações
│   ├── Main.java          # Classe principal com interface interativa
│   └── relatorio.md       # Relatório detalhado do projeto
└── README.md              # Este arquivo
```

## Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Compilação e Execução

```bash
# Navegar para o diretório do projeto
cd CalculadoraJava

# Compilar o projeto
javac -d . src/main/Calculadora.java src/main/Main.java

# Executar o programa
java calculadora.Main
```

## Exemplo de Uso

O programa oferece duas formas de uso:

1. **Demonstração automática**: Executa operações com valores fixos (12 e 4)
2. **Modo interativo**: Permite ao usuário inserir seus próprios números

### Saída Esperada

```
=== CALCULADORA JAVA ===
Bem-vindo à calculadora!

--- Exemplo com valores fixos ---
Valores: 12.0 e 4.0
Soma: 16.0
Subtração: 8.0
Multiplicação: 48.0
Divisão: 3.0

--- Calculadora interativa ---
Digite o primeiro número: 10
Digite o segundo número: 2

Resultados:
10.0 + 2.0 = 12.0
10.0 - 2.0 = 8.0
10.0 * 2.0 = 20.0
10.0 / 2.0 = 5.0

Obrigado por usar a calculadora!
```

## Tratamento de Erros

- **Divisão por zero**: O programa detecta tentativas de divisão por zero e exibe uma mensagem de erro apropriada
- **Entrada inválida**: Tratamento de exceções para entradas não numéricas

## Autores

- Rodrigo Madeira Cervantes
- Cauan Henrique Silva

## Versão

v1.0 - Versão inicial com operações básicas
