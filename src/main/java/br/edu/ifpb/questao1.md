# Lista de Exercícios: Herança e Polimorfismo (Questões Teóricas)

## Questão 1

**a) Os construtores de superclasse não são herdados por subclasses.**

**Verdadeira.** Construtores não são herdados. Cada classe tem seus próprios construtores. A subclasse pode *chamar* o construtor da superclasse usando `super(...)`, mas não o herda como se fosse um construtor seu.

**b) Um relacionamento "tem um" é implementado via herança.**

**Falsa.** A herança implementa o relacionamento **"é um"** (ex.: `Guerreiro` *é um* `Personagem`). O relacionamento **"tem um"** é implementado por **composição** (ou agregação), isto é, uma classe possui um atributo que referencia objeto de outra classe (ex.: `Carro` *tem um* `Motor`).

**c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.**

**Falsa.** Redefinir um método da superclasse com a **mesma assinatura** é **sobrescrita** (*override*). **Sobrecarga** (*overload*) é ter métodos com o **mesmo nome, mas assinaturas diferentes** (parâmetros diferentes), na mesma classe ou entre classes.

---