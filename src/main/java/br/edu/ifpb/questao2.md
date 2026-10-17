## Questão 2

**`protected` vs. `private` em superclasses**

### Argumentos a favor de `private`

- **Preserva o encapsulamento:** só a própria superclasse acessa seus atributos, então ela controla totalmente como o estado é alterado.
- **Menor acoplamento:** as subclasses não dependem da representação interna da superclasse. Se a superclasse mudar a forma de guardar um dado, as subclasses não quebram.
- **Validação garantida:** o acesso passa por métodos (`get`/`set`), onde é possível validar valores e manter a classe consistente.
- **Manutenção mais simples:** alterações internas ficam restritas a uma única classe.

### Argumentos a favor de `protected`

- **Conveniência e desempenho:** a subclasse acessa o atributo diretamente, sem precisar de chamadas a métodos.
- **Facilita a extensão:** é útil quando a subclasse realmente precisa manipular dados ou comportamentos da superclasse.
- **Menos código repetitivo:** evita a criação de vários getters/setters.

### Desvantagens de `protected`

- Quebra parcialmente o encapsulamento: qualquer subclasse (e também qualquer classe do mesmo pacote) pode alterar o atributo sem validação.
- Cria forte dependência entre a superclasse e as subclasses. Mudar a implementação da superclasse pode exigir alterações em todas as subclasses.
- Dificulta garantir que os dados da superclasse permaneçam consistentes.

### Conclusão

A recomendação geral é **usar `private` por padrão** e expor o acesso por métodos `public` ou, quando necessário, por métodos `protected` (getters/setters ou métodos auxiliares). Assim, a superclasse mantém o controle do seu estado e ainda permite que as subclasses a estendam. O atributo `protected` pode ser aceitável em hierarquias bem controladas e com forte relação entre as classes, mas deve ser usado com cautela.

---