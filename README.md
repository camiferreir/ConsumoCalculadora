# ⚡ PowerCalc - Calculadora de Consumo Elétrico

## 📝 Descrição do Projeto

O **PowerCalc** é um aplicativo Android desenvolvido para calcular o consumo de energia elétrica de aparelhos eletrônicos e estimar o custo financeiro baseado na tarifa de energia da concessionária.

O usuário informa:

* Nome do aparelho
* Potência em Watts (W)
* Horas de uso diário
* Valor do kWh

Após isso, o aplicativo calcula automaticamente:

* Consumo diário em kWh
* Valor estimado gasto em reais (R$)

---

# 📱 Interface do Aplicativo

O aplicativo possui:

* Campo para nome do aparelho
* Campo para potência
* Campo para horas de uso
* Campo para preço do kWh
* Botão para calcular
* Área para exibir os resultados

---

# ⚡ Fórmulas Utilizadas

## 1️⃣ Consumo de Energia (CE)

CE = \frac{P \times H}{1000}

Onde:

* `P` = Potência do aparelho (Watts)
* `H` = Horas de uso diário

Resultado em:

* `kWh`

---

## 2️⃣ Custo da Energia (C)

C = CE \times PKWH

Onde:

* `CE` = Consumo de energia
* `PKWH` = Preço do kWh

Resultado em:

* `R$`

---

# 🧪 Exemplo de Simulação

### Aparelho:

Computador Gamer

### Dados:

* Potência: 400W
* Tempo de uso: 10 horas
* Valor do kWh: R$ 0,90

### Resultado:

* Consumo Diário: 4 kWh
* Custo Estimado: R$ 3,60

---

# 🛠️ Tecnologias Utilizadas

* Java
* Android Studio
* XML
* ConstraintLayout
* Material Design

---

# ✅ Funcionalidades

* [x] Cadastro do nome do aparelho
* [x] Entrada de potência em Watts
* [x] Entrada de horas de uso
* [x] Entrada do valor do kWh
* [x] Cálculo automático do consumo
* [x] Cálculo automático do custo
* [x] Validação de campos vazios
* [x] Exibição formatada dos resultados

---

# 📂 Estrutura do Projeto

```plaintext id="3g2v5x"
app
 ├── java
 │    └── br.ulbra.powercalc
 │
 └── res
      └── layout
             └── activity_main.xml
```

---

# 🚀 Como Executar o Projeto

1. Abra o Android Studio
2. Clique em:

   * Open Project
3. Selecione a pasta do projeto
4. Execute em:

   * Emulador Android
   * Ou dispositivo físico

---

# 👨‍💻 Autor

Projeto desenvolvido para fins de aprendizado em Desenvolvimento Mobile Android.
