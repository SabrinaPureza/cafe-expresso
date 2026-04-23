##### ☕ Café Expresso  #####

Sistema de autoatendimento para cafeteria desenvolvido em Java.

## 📌 Objetivo
Permitir que clientes realizem pedidos em um totem digital, reduzindo filas e erros.

## 🚀 Funcionalidades
- Cadastro de produtos
- Adição de itens ao pedido
- Cálculo automático do total
- Controle de status do pedido:
  - PENDENTE
  - PAGO
  - EM_PREPARO
  - FINALIZADO

## 🧩 Estrutura
- Produto: representa itens do cardápio
- ItemPedido: relaciona produto + quantidade
- Pedido: gerencia o carrinho e fluxo do pedido

## ▶️ Execução
Compile e execute:

```bash
javac src/*.java
java src/Main
