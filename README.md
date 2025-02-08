# 💰 GorjetaApp - Calculadora de Gorjetas 💵  

Este é um **aplicativo simples** desenvolvido em **Kotlin** como um projeto de estudo, para calcular a divisão da conta e adicionar gorjetas. Criado como parte do meu **portfólio** para demonstrar conhecimentos em **desenvolvimento Android**. 🚀  

---

## 📌 Funcionalidades  
✔ Permite que o usuário insira **o valor total da conta** e **o número de pessoas na mesa**.  
✔ Permite selecionar a **porcentagem da gorjeta** (10%, 15% ou 20%).  
✔ Calcula automaticamente o **valor total por pessoa** incluindo a gorjeta.  
✔ Exibe mensagens de erro via **Snackbar** caso algum campo não esteja preenchido.  
✔ Botão para **limpar os campos** rapidamente.  

---

## 🖼️ Demonstração  
<img src="https://github.com/user-attachments/assets/b6ff54a7-bbc2-4db4-81d2-c942e0b75414" width="200" alt="Imagem do app"/>
<img src="https://github.com/user-attachments/assets/397c1cb6-94c2-4578-8344-8e89fc97e45a" width="200" alt="Imagem do app"/>
<img src="https://github.com/user-attachments/assets/400e4a59-3934-4a03-ae23-698d7e8a1c72" width="200" alt="Imagem do app"/>

---

## 🛠️ Tecnologias Utilizadas  

- **Kotlin** como linguagem principal.  
- **ViewBinding** para manipulação eficiente da UI.  
- **Material Design** para uma interface moderna.  
- **Snackbar** para exibição de mensagens interativas.  
- **ConstraintLayout** para organização da interface gráfica.  

---

## 📥 Como Baixar e Rodar o Projeto?  

### **📌 Pré-requisitos**  
- **Android Studio** versão **Arctic Fox (ou superior)**.  
- **Emulador ou dispositivo físico com Android 7+**.  
- **Gradle instalado e atualizado**.  

### 🔽 **Passos para rodar o projeto**  
1. **Clone este repositório** no seu computador:  
   ```bash
   git clone https://github.com/seu-usuario/gorjeta-app.git
   ```  
2. **Abra o Android Studio** e importe o projeto.  
3. **Conecte um dispositivo ou inicie um emulador**.  
4. **Clique no botão ▶️ Run** para compilar e executar o app!  

---

## 📜 Como funciona o código?  

O aplicativo segue uma estrutura simples baseada no **Activity Lifecycle**. O código principal está em `MainActivity.kt`:

- **Captura os valores de entrada do usuário** (`tieTotal`, `tieNumPeaple`).  
- **Verifica se os campos estão preenchidos** antes de calcular.  
- **Calcula o valor total por pessoa** incluindo a gorjeta escolhida.  
- **Exibe o resultado no `tvResult`**.  
- **Exibe mensagens de erro** via `Snackbar` caso algum campo esteja vazio.  
- **Limpa os campos e desmarca opções ao clicar no botão "Limpar"**.  

Trecho do código principal:
```kotlin
binding.done.setOnClickListener {
    val totalTableTemp = binding.tieTotal.text
    val numPeapleTemp = binding.tieNumPeaple.text

    if (totalTableTemp.isNullOrEmpty() || numPeapleTemp.isNullOrEmpty()) {
        Snackbar.make(binding.tieTotal, "Preencha os campos", Snackbar.LENGTH_LONG).show()
    } else {
        val totalTable: Float = totalTableTemp.toString().toFloat()
        val numPeaple: Int = numPeapleTemp.toString().toInt()

        val total = totalTable / numPeaple
        val tips = total * percentage / 100
        val totalTips = total + tips

        binding.tvResult.text = "Total: R$ ${"%.2f".format(totalTips)}"
    }
}
```

---

## 🚀 Melhorias Futuras  

🔹 Exibir mensagens animadas ao calcular.  
🔹 Permitir personalizar a porcentagem da gorjeta.  
🔹 Criar um histórico dos cálculos feitos.  
🔹 Melhorar o design com temas mais modernos.  

Se quiser sugerir melhorias ou contribuir, **sinta-se à vontade para abrir uma Issue ou Pull Request!** 🚀  

---

## 🤝 Conecte-se Comigo  

<a href="https://www.linkedin.com/in/wellington-furtado/"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
<a href="mailto:wellfurtado@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
<a href="https://github.com/wellfurtado"><img src="https://img.shields.io/badge/GitHub-000000?style=for-the-badge&logo=github&logoColor=white"/></a>

---

## 📜 Licença  

Este projeto foi desenvolvido para fins de estudo e está disponível sob a **licença MIT**.  

Se quiser contribuir, fique à vontade! 🚀✨  

---

Feito por [Wellington Damasceno](https://github.com/wellfurtado) 🚀  
