# 🛒 Projeto Loja – Sistema de Gerenciamento de Pedidos

## 📌 Descrição

Este projeto consiste em um sistema de gerenciamento de pedidos para uma loja, desenvolvido em Java. O sistema realiza o controle de pedidos, incluindo cálculo de frete, impostos, descontos, formas de pagamento e notificações.

Durante o desenvolvimento, foram aplicados padrões de projeto com o objetivo de melhorar a organização, manutenção e escalabilidade do sistema.

---

## 🧠 Padrões de Projeto Utilizados

- **Strategy** → utilizado para encapsular diferentes formas de frete, pagamento e impostos  
- **Decorator** → utilizado para composição de descontos  
- **Observer** → utilizado para envio de notificações baseadas em eventos do sistema  

---

## 🏗️ Principais Funcionalidades

- Criação e processamento de pedidos  
- Cálculo de frete de forma flexível  
- Aplicação de descontos combináveis  
- Processamento de diferentes formas de pagamento  
- Sistema de notificações automatizado  

---

## 👨‍💻 Tecnologias Utilizadas

- Java  
- Programação Orientada a Objetos (POO)  
- Design Patterns (Strategy, Decorator, Observer)

---

## 👥 Autores

- Marcella Lins  
- Ruan Miguel

---

## 📂 Estrutura do Projeto

- `pedido/` → lógica principal de pedidos  
- `frete/` → estratégias de cálculo de frete  
- `pagamento/` → formas de pagamento  
- `desconto/` → regras de desconto  
- `notificacao/` → sistema de notificações  
- `model/` → entidades do sistema  

---

## 🚀 Objetivo

O objetivo principal deste projeto é demonstrar a aplicação prática de padrões de projeto para resolver problemas reais de software, promovendo um código mais limpo, flexível e escalável.
