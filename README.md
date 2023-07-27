# Rice?
**Rice**, the programming language by Dennis King.

Okay so let's get one thing out of the way first, why Rice?... the  answer to that question is quite simple, I called the language Rice because I love rice, I mean I really really love to **Eat** rice, I'm obssessed with rice, hell, sometimes I'll even go as far as having 6 bowls of rice a day. I absolutely adore rice in its simplest form – plain, dry, and unsalted. There's something about its unadorned simplicity that truly captivates me. The texture of each individual **Grain** as it dances on my metaphorical taste buds is pure bliss. The subtle nuttiness of the rice shines through, unhindered by any seasoning distractions. It's as if every mouthful transports me to a realm of culinary enlightenment. While others may find this preference unusual, I revel in the natural flavors and wholesome essence of plain rice. There's a certain purity to it, a blank canvas awaiting my appreciation. It complements any dish I pair it with, acting as a neutral foundation for flavors to build upon. I relish the opportunity to let the rice take center stage, allowing me to truly appreciate its humble and unpretentious nature. Just plain, dry and unsalted rice, that's the way I love it and that's the best way to serve it.

Just give me a **Bowl** of rice and I'm happy.

# Rice
Rice is a simple and lightweight programming language **not designed for basic arithmetic operations**, but is designed for string manipulation, and console output. It aims to provide an intuitive and readable syntax similar to Java while offering an incredibly reduced set of features. All engineers are always focused on building the most complex and hard to understand software, which is great and stuff but sometimes complex isn't always better, and that's the case with Rice. Rice is for dummies like you and I. Rice is for anyone that thinks building software is only done by geniuses, which is true but that is not the point. As you will see with Rice, it's incredibly flawed but there is a certain beauty to it. It was not created by a genius but it was created by a man with a vision.

# The Vision
Nurturing a child's interest in technology from an early age is crucial in today's rapidly advancing world. The digital age has transformed the way we live, work, and communicate, and it's becoming increasingly essential for individuals to have a strong foundation in technology. Kids are really smart these days, I mean children as young as 4 already know how to read and operate certain technologies. And I see an opportunity to capatalise on this. In this context, I hope saying "capatalise" doesn't sound wrong but hear me out. Because Rice is so easy to understand, I think it could be a great intro to programmaing for these young ones. As I mentioned earlier, kids are smart and I strongly believe that they would easily grasp Rice. Rice could be the language that ignites the spark of curiosity and passion for programming in young minds. It could serve as a gateway to the world of technology, enabling children to take their first steps into the realm of coding with ease and excitement. I want to provide a simple and accessable platform for learning. Rice could empower kids to explore their creative potential, experiment with ideas, and see tangible results quickly. But most importantly I want Rice to promote inclusivity, especially in the society that I live in, here in South Africa. I want to ensure that children from all backgrounds and resource levels can participate in the joy of programming, breaking down some barriers that might prevent some children from accessing technology education, allowing a wider audience to benefit from the wonders of coding. Rice is very limited and as children outgrow these limitations, they hopefully will seek to expand their coding horizons. Rice could even help to address the gender gap in technology and encourage more young girls to enter the world of programming. Its simplicity and approachability could create an environment where all children, regardless of gender or background, feel comfortable and motivated to participate. And hopefully in the long run, Rice could contribute to a future workforce that is more technologically adept and innovative. Rice could foster a generation of young problem-solvers, inventors, and entrepreneurs who are unafraid to tackle the world's most pressing issues with the help of technology.

# Syntax
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
<li><b>Early Age Accessability</b>: By making Rice accessible to children as young as 5, I'm hoping to foster an early interest in programming. This could have long-term benefits in terms of developing computational thinking, problem-solving skills, and creativity from an early age.
<li><b>Gradual Learning Progression</b>: Rice will serve as an excellent stepping stone for young learners to transition to more advanced languages and concepts later on. Once they have a solid foundation in Rice's simplified syntax and logic, they can easily adapt to languages that support arithmetic expressions.

## Example Rice Program
Here's an example of a Rice program.

````
Rice{
  Cook main(){
    grain compliment = "David Guetta's Sunshine is easily one of his greatest hits!!";
    bowl year = 2012;
    Eat.print(message);
    Eat.print(year);
  }
}
````
This code needs to be saved in a **.rice** file
