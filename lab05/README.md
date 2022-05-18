# Lab 05 - Mundo de Wumpus

## Arquivos Java sobre Mundo de Wumpus
[Arquivos](src/pt/c40task/l05wumpus)


## Destaque
Como destaque temos as funções de insereCaverna() e removeCaverna(), definidas na classe abstrata Componente, que solicitam a caverna a inserção/remoção, e a caverna solicita a sala a inserção/remoção. Cada componente sabe como é inserido e o que inserir com ele (exemplo: Wumpus e buraco) e sabe como é removido (por exemplo, o Wumpus ao ser removido pede a caverna para remover o fedor em volta dele). Isso permite a fácil inserção de movimentação dos componentes na caverna, caso quiséssemos que o Wumpus se movesse ou criar novos componentes que se movem.
```
public void insereCaverna() {
	caverna.inserirComponente(this, x, y);
}
	
public void removeCaverna() {
	caverna.removerComponente(tipoComponente, x, y);
}
```
