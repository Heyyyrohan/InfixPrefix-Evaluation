🧮 Infix to Prefix Converter (Kotlin)

A simple Kotlin console application that converts infix expressions (e.g., A+B*C) into prefix notation (e.g., +A*BC) using a stack-based algorithm.

📌 Features
Convert infix expressions to prefix notation

Supports:
Operators: + - * / ^
Parentheses ( )
Single-letter variables (A, B, etc.)
Numeric values

Built with pure Kotlin (no external libraries)
Easy to read & modify for learning purposes

🚀 How It Works
The program uses the reverse + postfix trick:
Reverse the infix expression
Swap brackets ( ↔ )
Convert the reversed infix to postfix using a stack
Reverse the postfix result → prefix expression

📂 Project Structure

📦 infix-to-prefix
 ┣ 📜 Main.kt          # Entry point
 ┣ 📜 .kt     # Logic for conversion
 ┣ 📜 README.md        # Project documentation

🖥️ Example Run
Input:
Enter infix expression: (A+B)*C

Output:
Prefix: *+ABC

🛠️ Installation & Usage
Clone this repository:

git clone https://github.com/yourusername/infix-to-prefix.git

Open the project in IntelliJ IDEA or your favorite Kotlin IDE
Run the Main.kt file
Enter any valid infix expression when prompted

📜 Code Snippet

fun infixToPrefix(expression: String): String {
    val reversed = swapBrackets(expression.reversed())
    val postfix = infixToPostfix(reversed)
    return postfix.reversed()
}

📚 Learning Goals
This project is perfect for:

Understanding stack data structure
Learning operator precedence
Practicing string manipulation
Preparing for DSA interview questions

🤝 Contributing
Pull requests are welcome!
If you find a bug or have an idea for an improvement, open an issue.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

⭐ Show Your Support
If you found this project helpful, consider giving it a ⭐ on GitHub!
