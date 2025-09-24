# 🍕 Pizzaria SliceSpring - Seu Chef Digital de Pizzas! 

<h2 align="center"> <img width="512" height="312" alt="SpringSlice_square" src="https://github.com/user-attachments/assets/433d70a8-b5ea-476a-9da0-fe43119d6425" /> </h2>


<h2 align="center"> ✨ Transformando o caos da cozinha em harmonia digital! ✨ </h2>
<br>
<br>
<br>


## 🏗️ Arquitetura do Sistema 
<br>

### 🍕 Pizza - A Estrela do Show!
```
public class Pizza {
    private String nome;      // Ex: "Margherita Suprema"
    private Double preco;     // R$ 45,90
    private String tamanho;   // "Grande", "Média", "Brotinho"
    private Categoria categoria; // Tradicional, Doce, Especial
}
```
<br>

### 📦 Categoria - O Agrupamento Inteligente
```
public class Categoria {
    private String nome; // "Tradicional", "Doce", "Especial"
    private List<Pizza> pizzas; // Todas as pizzas da categoria
}
```
<br>

### 🪑 Mesa - O Palco dos Clientes
```
public class Mesa {
    private Integer numero;     // Mesa 5
    private Integer capacidade; // 4 pessoas
    private Boolean disponivel; // true = livre, false = ocupada
}
```
<br>

### 📋 Pedido - O Combo da Felicidade!
```
public class Pedido {
    private String status;     // "Preparando", "Entregue", "Pago"
    private Mesa mesa;         // Mesa que fez o pedido
    private List<Pizza> pizzas; // Pizzas escolhidas
}
```
<br>
<br>

## Como Eles Se Relacionam? 💞
```
🏢 RESTAURANTE
    │
    ├── 🪑 MESA 1 (4 pessoas)
    │   └── 📋 PEDIDO #101
    │       ├── 🍕 Margherita (Tradicional)
    │       └── 🍕 Chocolate (Doce)
    │
    ├── 🪑 MESA 2 (6 pessoas)
    │   └── 📋 PEDIDO #102
    │       ├── 🍕 Calabresa (Tradicional)
    │       ├── 🍕 Portuguesa (Tradicional)
    │       └── 🍕 Frango Catupiry (Especial)
    │
    └── 📦 CATEGORIAS
        ├── Tradicional: [Margherita, Calabresa, Portuguesa]
        ├── Doce: [Chocolate, Romeu e Julieta]
        └── Especial: [Frango Catupiry, 4 Queijos]
```

<br>
<br>

## 🍕 Como Usar?
  <br>
  
- 📖 Ver todas as pizzas disponíveis
```
GET http://localhost:8080/pizzas
```
<br>

- ➕ Adicionar uma nova pizza super especial
```
POST http://localhost:8080/pizzas
{
    "nome": "Pizza do Chef",
    "preco": 59.90,
    "tamanho": "Grande",
    "categoria": {"id": 1}
}
```
<br>

- 🗑️ Remover uma pizza (quando acaba o ingrediente)
```
DELETE http://localhost:8080/pizzas/3
```
<br>

- 📦 Organizando por Categorias
```
# 🏷️ Ver todas as categorias
GET http://localhost:8080/categorias
```
<br>

- 🆕 Criar categoria "Vegetariana"
```
POST http://localhost:8080/categorias
{
    "nome": "Vegetariana"
}
```
<br>

- 🪑 Ver todas as mesas
```
GET http://localhost:8080/mesas
```
<br>

- 🆕 Adicionar uma mesa nova
```
POST http://localhost:8080/mesas
{
    "numero": 7,
    "capacidade": 8
}
```
<br>

- 📋 Ver todos os pedidos ativos
```
GET http://localhost:8080/pedidos
```
<br>

- 🎉 Criar um pedido!
```
POST http://localhost:8080/pedidos
{
    "status": "Preparando",
    "mesa": {"id": 2},
    "pizzas": [
        {"id": 1},  // Margherita
        {"id": 3}   // Chocolate
    ]
}
```
<br>

