## Questão 3

**Chamada de construtores em hierarquias de herança**

### Como funciona

Quando um objeto de uma subclasse é criado, os construtores são executados **de cima para baixo** na hierarquia, ou seja, **do construtor da superclasse mais alta até o da própria subclasse**.

Exemplo:

```java
class Animal {
    public Animal() { System.out.println("Construtor de Animal"); }
}

class Cachorro extends Animal {
    public Cachorro() {
        super(); // chamada à superclasse (implícita se omitida)
        System.out.println("Construtor de Cachorro");
    }
}

// new Cachorro() imprime:
// Construtor de Animal
// Construtor de Cachorro
```

Passo a passo ao executar `new Cachorro()`:

1. O construtor de `Cachorro` é chamado.
2. Sua **primeira instrução** é a chamada ao construtor da superclasse (`super(...)`).
3. O construtor de `Animal` executa (e, se `Animal` tivesse superclasse, ela seria chamada antes, até chegar em `Object`).
4. Quando a superclasse termina, o restante do construtor de `Cachorro` é executado.

### Chamada explícita ou implícita

- **Explícita:** o programador escreve `super(argumentos)` como primeira instrução do construtor.
- **Implícita:** se o programador não escrever nada, o compilador insere automaticamente `super()` (sem argumentos). Isso só compila se a superclasse tiver um construtor sem parâmetros acessível. Caso contrário, ocorre **erro de compilação**, e é obrigatório chamar `super(...)` explicitamente com os argumentos adequados.

### Por que é obrigatório chamar o construtor da superclasse?

Porque um objeto da subclasse **contém** a parte herdada da superclasse (atributos e estado). Essa parte precisa ser **inicializada corretamente** antes de a subclasse usá-la. Se o construtor da superclasse não fosse executado, os atributos herdados ficariam sem inicialização adequada, e a subclasse poderia trabalhar com um objeto em estado inconsistente. Por isso a chamada a `super(...)` deve ser a **primeira instrução** do construtor, garantindo que a base seja construída antes da especialização.