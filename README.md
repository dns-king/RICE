# Rice?
**Rice**, the programming language by Dennis King.

Okay so let's get one thing out of the way first, why Rice?... the  answer to that question is quite simple, I called the language Rice because I love rice, I mean I really really love to **Eat** rice, I'm obssessed with rice, hell, sometimes I'll even go as far as having 6 bowls of rice a day. I absolutely adore rice in its simplest form – plain, dry, and unsalted. There's something about its unadorned simplicity that truly captivates me. The texture of each individual **Grain** as it dances on my taste buds is pure bliss. The subtle nuttiness of the rice shines through, unhindered by any seasoning distractions. It's almost as if every mouthful takes me to a place of culinary enlightenment. Many people find this preference unusual, but I revel in the natural flavors and wholesome essence of plain rice. There's a certain purity to it, a blank canvas awaiting my appreciation. It literally complements any dish I pair it with, acting as a neutral foundation for flavors to build upon. I relish the opportunity to let the rice take center stage, allowing me to truly appreciate its humble and unpretentious nature. Just plain, dry and unsalted rice, that's the way I love it and that's the best way to serve it.

Just give me a **Bowl** of rice and I'm happy.

# Rice
Rice is a simple and lightweight programming language **not designed for basic arithmetic operations**, but is designed for string manipulation, and console output. It aims to provide an intuitive and readable syntax similar to Java while offering an incredibly reduced set of features. Software engineers often enjoy challenging problems and coming up with complex solutions to those problem, it's in our DNA to be complex, it feels great to demonstrate our technical skills and expertise, to showcase our knowledge and abilities to our peers in the industry... but complex doesn't always have to be the solution. And that's the case with Rice. Rice is not complex, Rice is the "basic b*tch" of programming languages. Rice is the odd one out. Rice is for dummies like myself. Rice is for anyone that thinks building software can only done by "geniuses", which is a common misconception about software development. Rice is incredibly flawed but there is a certain beauty to it. It was not created by a genius but it was created by a man with a vision.

# The Vision
Nurturing a child's interest in technology from an early age is crucial in today's rapidly advancing world. The digital age has transformed the way we live, work, and communicate, and it's becoming increasingly essential for individuals to have a strong foundation in technology. Kids are really smart these days, I mean children as young as 4 already know how to read and operate certain technologies. And I see an opportunity to capatalise on this. In this context, I hope saying "capatalise" doesn't sound wrong but hear me out. Because Rice is so easy to understand, I think it could be a great intro to programmaing for these young ones. As I mentioned earlier, kids are smart and I strongly believe that they would easily grasp Rice. Rice could be the language that ignites the spark of curiosity and passion for programming in young minds. It could serve as a gateway to the world of technology, enabling children to take their first steps into the realm of coding with ease and excitement. I want Rice to become a simple and accessable platform for learning. Rice could empower kids to explore their creative potential, experiment with ideas, and see tangible results quickly. But most importantly I want Rice to promote inclusivity, especially in the society that I live in, here in South Africa. I want to ensure that children from all backgrounds and resource levels can participate in the joy of programming, breaking down some barriers that might prevent some children from accessing technology education, allowing a wider audience to benefit from the wonders of coding. Rice is very limited and as children outgrow these limitations, they hopefully will seek to expand their coding horizons. Rice will serve as an excellent stepping stone for young learners to transition to more advanced languages and concepts later on. Once they have a solid foundation in Rice's simplified syntax and logic, they can easily adapt to languages that support arithmetic expressions.
Rice could even help to address the gender gap in technology and encourage more young girls to enter the world of programming. Its simplicity and approachability could create an environment where all children, regardless of gender or background, feel comfortable and motivated to participate. And hopefully in the long run, Rice could contribute to a future workforce that is more technologically adept and innovative. By making Rice accessible to children as young as 5, Rice could foster a generation of young problem-solvers, inventors, and entrepreneurs who are unafraid to tackle the world's most pressing issues with the help of technology. This could have long-term benefits in terms of developing computational thinking, problem-solving skills, and creativity from an early age.
By nurturing the interests of young children and providing them with an accessible and exciting entry into programming, Rice could play a pivotal role in shaping a brighter, more technologically proficient future for all.

# Rice program structure and Syntax
Rice programs follow a structure similar to Java:

````
Rice {
  Cook main() {
    // Program code goes here
  }
}
````
The main reason behind this idea, was that Rice should be structured in a way that follows the concept or the process of actually cooking rice. You see this clearly if you pay attention to the structure of a Rice program.

<li>The <b>Rice block</b> is the top-level structure of a Rice program.
<li>The <b>Cook main() block</b> contains the entry point of the program, similar to the main method in Java.
<li>Write your <b>Rice code</b> inside the main block.

## Data Types
Rice only supports two data types.

<ol>
<li><b>bowl</b>: Represents integer values.</li>
<li><b>grain</b>: Represents string values.</li>
</ol>

## Variables
You can declare variables using the following syntax:

````
dataType variableName = expression;
````
<li><b>dataType</b> can either be <b>bowl</b> or <b>grain</b>, representing the variable's data type.
<li><b>variableName</b> is the name you choose for the variable.
<li><b>expression</b> is the initial value assigned to the variable.

## Printing to the Console
After cooking your rice, you wanna **Eat** it right??

````
Eat.print(expression)
````
To print output to the console, use the **Eat.print** statement:
<li><b>expression</b> can be a variable or a string literal. 

## Arithemetic Expressions
Haha, probably gonna get some slack for this one, Rice does **NOT** support basic arithmetic expressions.

<li><b>Addition</b>: nope!!
<li><b>Subtraction</b>: no ma'am!!
<li><b>Multiplication</b>: haha, funny.
<li><b>Divsion</b>: I'm in divsion 1 on Fifa online!!

Arithmetic expressions can be written using the following syntax:

````
bowl result = expression1 operator expression2;
````

<li><b>expression1</b> and <b>expression2</b> can be variables or numeric values.
<li><b>operator</b> represents the desired arithmetic operation.
  
#### trust me, this will not give you the desired result!

## Why Rice does not support this feature
<li><b>Simplicity</b>: The decision to omit complex arithmetic expressions is so that Rice can focus on teaching fundamental programming concepts and logic without overwhelming beginners. I'm hoping that young users will be able to grasp the basics of programming without the added complexity of arithmetic calculations.
<li><b>Understanding</b>: Prioritizing simplicity, Rice encourages users to think in terms of logical operations and problem-solving rather than becoming overly reliant on arithmetic calculations. It should promote a deeper understanding of programming concepts beyond simple arithmetic manipulation.

## More unsupported features
<li> Conditional statements, <b>if, else, switch. 😫</b>
<li> Data Types, <b>booleans, floating point numbers, etc. ☹️</b>
<li> Object Oriented Programming, <b>Many modern languages support OOP principles. Haha but Rice doesn't. 😅</b>
<li> Loops, <b>for, while, none of that! 😲 </b>
<li> Arrays and Lists, <b>I am so sorry. 😢 </b>


## Example Rice Program
Here's an example of a Rice program.

````
Rice{
  Cook main(){
    grain message = "David Guetta's Sunshine is easily one of his greatest hits!!";
    bowl year = 2012;
    Eat.print("thank you for your continued support!");
  }
}
````
# How it works

Technically Rice is not its own unique programming language, it was created using ANTLR and JAVA and so it's heavily reliant on them.

### But frst, let me explain the relationship between them.

#### ANTLR (Another tool for language recognition)
ANTLR is a powerful parser generator that allowed me to define the grammar for Rice. It takes Rice's grammar specification as input and generates lexer and parser code in various programming languages, including Java. The generated lexer and parser are responsible for transforming the source code into a parse tree, which represents the hierarchical structure of the code.
#### Rice the programming language
The language I created using ANTLR is a custom programming language. Although it's not entirely new because it relies on existing components (ANTLR and Java) to function. However, it does have its unique syntax, semantics, and features. Rice's grammar, which defines its syntax, is specified in ANTLR's grammar file format. The grammar file contains rules that describe how the language's statements, expressions, and other constructs should be structured.
#### JAVA
Java is a general-purpose programming language that I chose as the target language for Rice. This means that the code written in Rice will ultimately be translated into equivalent Java code through the process of parsing and translation.

### Relationship
The relationship between Rice, ANTLR, and Java can be explained through the following steps:
<li><b>Grammar Definition:</b> Defined the grammar for Rice using ANTLR. This grammar serves as a blueprint for how the language's code should be structured.
<li><b>ANTLR Code Generation:</b> After I defined the grammar, ANTLR generates lexer and parser code in Java based on Rice's grammar specification.
<li><b>Parsing process:</b> When a program written in Rice is executed, the ANTLR-generated lexer reads the source code and converts it into a stream of tokens. These tokens represent the basic building blocks of your language, such as keywords, identifiers, literals, and operators.
<li><b>Building the Parse Tree:</b> The generated parser then takes the stream of tokens and constructs a parse tree based on the grammar rules. The parse tree represents the syntactic structure of the code, capturing how different language constructs are related to each other.
<li><b>Translation to Java:</b> Once the parse tree is constructed, you can implement a custom Java code generator (or use ANTLR's built-in capabilities) that traverses the parse tree and generates equivalent Java code. This translation step ensures that the code written in Rice can be executed as Java code.
<li><b>Execution:</b>
After the code has been translated to Java, it is treated as regular Java code and can be executed by the Java Virtual Machine (JVM). The execution flow follows standard Java practices, allowing Rice to leverage the power of Java's runtime environment.

So, Rice relies on ANTLR to define its grammar and generate the necessary lexer and parser code in Java. The parsed code is then translated into equivalent Java code, which can be executed using the Java Virtual Machine. This relationship has allowed me to create Rice while leveraging the flexibility and robustness of Java.

# How to execute a Rice program
As I mentioned before, Rice relies on JAVA, so to execute a Rice program you will need to have JAVA installed.

````
Rice{
  Cook main(){
  grain complain = "ahh man writing the documentation for this is taking too long!";
  bowl age = 23;
  Eat.print("I wonder where my birth certificate is.");
  }
}
````

One unique aspect about Rice is that it runs in its own file, so you don't have to write Rice code in some main java class file. The code above will be executed in its own file with an extension of `.rice`. All you have to do to run a Rice program is to switch to the main java class file and hit <b>run!!</b>

The program above will print the following output to the console:

`Variable declaration: "ahh man writing the documentation for this is taking too long!"`

`Variable declaration: 23`

`Variable declaration: "ahh man writing the documentation for this is taking too long!"`



