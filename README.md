# Java Trail

## OOP
1. Real-world objects contain ___ and ___.  
Ans: state and behavior
2. A software object's state is stored in ___.  
Ans: fields
3. A software object's behavior is exposed through ___.  
Ans: methods
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data ___.  
Ans: encapsulation
5. A blueprint for a software object is called a ___.  
Ans: class
6. Common behavior can be defined in a ___ and inherited into a ___ using the ___ keyword.  
Ans: superclass, subclass, extends
7. A collection of methods with no implementation is called an ___.  
Ans: interface
8. A namespace that organizes classes and interfaces by functionality is called a ___.  
Ans: package
9. The term API stands for ___.  
Ans: application programming interface.

## Variables
1. The term "instance variable" is another name for ___.  
Ans: non-static field
2. The term "class variable" is another name for ___.  
Ans: static field
3. A local variable stores temporary state; it is declared inside a ___.  
Ans: method
4. A variable declared within the opening and closing parenthesis of a method signature is called a ____.  
Ans: parameter
5. What are the eight primitive data types supported by the Java programming language?  
Ans: byte, short, int, long, double, float, boolean, char
6. Character strings are represented by the class ___.  
Ans: java.lang.String
7. An ___ is a container object that holds a fixed number of values of a single type.  
Ans: array

## Operators
1. Consider the following code snippet.
arrayOfInts[j] > arrayOfInts[j+1]
Which operators does the code contain?  
Ans: >, +
2. Consider the following code snippet: 
`int i = 10;
int n = i++%5;`
What are the values of i and n after the code is executed?  
What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?  
Ans 1: i = 11, n = 0
Ans 2: i = 11, n = 1
3. To invert the value of a boolean, which operator would you use?  
Ans: !
4. Which operator is used to compare two values, = or == ?  
Ans: ==
5. Explain the following code sample: result = someCondition ? value1 : value2;  
Ans: if "someCondition" evaluates to true, then result = value1. otherwise, result = value2  
Exercise 2: because i++ evaluates to the value prior to reassignment

## Expressions, Statements and Blocks

1. Operators may be used in building ___, which compute values.  
Ans: expressions
2. Expressions are the core components of ___.  
Ans: statements
3. Statements may be grouped into ___.  
Ans: blocks
4. The following code snippet is an example of a ___ expression.
`1 * 2 * 3`  
Ans: compound
5. Statements are roughly equivalent to sentences in natural languages, but instead of ending with a period, a statement ends with a ___.  
Ans: semicolon
6. A block is a group of zero or more statements between balanced ___ and can be used anywhere a single statement is allowed.  
Ans: braces

Identify the following kinds of expression statements:
aValue = 8933.234;  
**assignment**  
aValue++;  
**increment**  
System.out.println("Hello World!");  
**method invocation**
Bicycle myBike = new Bicycle();  
**object creation**

## Control Flow Statements
1. The most basic control flow statement supported by the Java programming language is the ___ statement.
2. The ___ statement allows for any number of possible execution paths.
3. The ___ statement is similar to the while statement, but evaluates its expression at the ___ of the loop.
4. How do you write an infinite loop using the for statement?
5. How do you write an infinite loop using the while statement?

Answers:
1. if-then
2. switch
3. do-while, end
   
4.      for ( ; ; ) {

        }
5.  
        while (true) {
        
        }

Consider the following code snippet.

    if (aNumber >= 0)
        if (aNumber == 0)
            System.out.println("first string");
    else System.out.println("second string");
    System.out.println("third string");
a. What output do you think the code will produce if aNumber is 3?
**"third string""**
b. Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
c. Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
d. Use braces, { and }, to further clarify the code.