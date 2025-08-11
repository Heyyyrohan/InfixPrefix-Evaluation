<h1>🧮 Infix to Prefix Converter (Kotlin)</h1>

<p>A simple Kotlin console application that converts infix expressions (e.g., <code>A+B*C</code>) into prefix notation (e.g., <code>+A*BC</code>) using a stack-based algorithm.</p>

<h2>📌 Features</h2>
<ul>
    <li>Convert infix expressions to prefix notation</li>
    <li>Supports:
        <ul>
            <li>Operators: + - * / ^</li>
            <li>Parentheses ( )</li>
            <li>Single-letter variables (A, B, etc.)</li>
            <li>Numeric values</li>
        </ul>
    </li>
    <li>Built with pure Kotlin (no external libraries)</li>
    <li>Easy to read &amp; modify for learning purposes</li>
</ul>

<h2>🚀 How It Works</h2>
<ol>
    <li>Reverse the infix expression</li>
    <li>Swap brackets ( &lt;=&gt; )</li>
    <li>Convert the reversed infix to postfix using a stack</li>
    <li>Reverse the postfix result → prefix expression</li>
</ol>

<h2>📂 Project Structure</h2>
<ul>
    <li>📦 infix-to-prefix
        <ul>
            <li>📜 Main.kt - Entry point</li>
            <li>📜 intixToPostfix.kt - Converts reverse infix to postfix</li>
            <li>📜 revOfInfix.kt - Reverse the infix</li>
            <li>📜 Evaluation.kt - Logic for evaluation</li>
            <li>📜 README.md - Project documentation</li>
        </ul>
    </li>
</ul>

<h2>🖥️ Example Run</h2>
<p><strong>Input:</strong><br>
Enter infix expression: (5+7)*3</p>
<p><strong>Output:</strong><br>
Prefix: <code>*+573</code><br>
Final Answer (Value): 36.0</p>

<h2>🛠️ Installation &amp; Usage</h2>
<ol>
    <li>Clone this repository:
        <br><code>git clone  https://github.com/Heyyyrohan/InfixPrefix-Evaluation.git</code>
    </li>
    <li>Open the project in IntelliJ IDEA or your favorite Kotlin IDE</li>
    <li>Run the Main.kt file</li>
    <li>Enter any valid infix expression when prompted</li>
</ol>

<h2>📜 Code Snippet</h2>
<pre><code>
fun infixToPrefix(expression: String): String {
    val reversed = swapBrackets(expression.reversed())
    val postfix = infixToPostfix(reversed)
    return postfix.reversed()
}
</code></pre>

<h2>📚 Learning Goals</h2>
<ul>
    <li>Understanding stack data structure</li>
    <li>Learning operator precedence</li>
    <li>Practicing string manipulation</li>
    <li>Preparing for DSA interview questions</li>
</ul>

<h2>🤝 Contributing</h2>
<p>Pull requests are welcome!<br>
If you find a bug or have an idea for an improvement, open an issue.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License - see the LICENSE file for details.</p>

<h2>⭐ Show Your Support</h2>
<p>If you found this project helpful, consider giving it a ⭐ on GitHub!</p>
