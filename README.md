# ☕ Java Quick Revision Notes

A rapid reference guide covering essential Java topics: Exceptions, Functional Programming, Generics, and core concepts.

## 1\. Exception Handling

An **Exception** is an unexpected event during program execution that disrupts the normal flow and can cause abnormal termination.

### 1.1. Core Concepts

  * **Errors:** Represent irrecoverable conditions (e.g., JVM running out of memory).
  * **Exception Types:**
      * **`RuntimeException`** (Unchecked)
      * **`IOException`** (Checked/Compile-time)

### 1.2. Exception Handling Blocks & Keywords

| Feature | Purpose / Syntax Rule |
| :--- | :--- |
| **`try...catch`** | Used to handle exceptions and prevent abnormal termination. `try` can exist without `catch` (if `finally` is present), but `catch` cannot exist without `try`. |
| **`finally`** | Block containing cleanup code (e.g., closing connections). **Execution is guaranteed** *except* for cases like `System.exit()`, a thread's death, or an exception occurring inside `finally`. |
| **`throw`** | Used to **explicitly throw a single exception** (manually or to move flow to the `catch` block). |
| **`throws`** | Used in the **method declaration** to *declare* the types of **checked exceptions** that *might* occur within the method. |

### 1.3. Advanced Exception Handling

  * **Multiple Catch Blocks:** Allows handling different exception types separately.
  * **Handling Multiple Exceptions (Java SE 7+):**
    ```java
    try {
        // code
    } catch (ExceptionType1 | ExceptionType2 ex) {
        // catch block for both types
    }
    ```
  * **`try-with-resources` (TWR):**
      * Automatically closes all resources (objects implementing `AutoCloseable`) at the end of the statement.
      * Eliminates the need for a `finally` block for resource cleanup.
      * **Multiple Resources:** Declared inside `try` separated by a semicolon (`;`).

## 2\. Functional Programming (Lambda & Streams)

### 2.1. Functional Interface

  * An interface that contains **one and only one abstract method**.
  * This single method defines the interface's purpose.
  * Annotated with `@FunctionalInterface`.

### 2.2. Lambda Expressions

  * An anonymous or unnamed method.
  * Used to **implement the single abstract method** defined by a functional interface.

### 2.3. Stream API (JDK 8+)

  * The `java.util.stream` package.
  * Allows performing operations like search, filter, map, reduce, or manipulate collections (e.g., `List`).
  * **Example Chain:**
    ```java
    myCollection.stream()
        .filter(...) // Selects elements
        .map(...)    // Transforms elements
        .sorted()    // Orders elements
        .forEach(...)// Terminal operation
    ```

## 3\. Generics

### 3.1. Overview

  * Allows creating a single class, interface, or method that can be used with **different types of data (objects)**.
  * Promotes **code reuse**.
  * **NOTE:** Generics **do not work with primitive types** (int, float, char, etc.).

### 3.2. Generics Class

  * A class defined to work with any type of data (e.g., `class MyClass<T> { ... }`).

### 3.3. Generics Method

  * A method defined to work with any type of data.
  * The type parameter `<T>` is declared before the return type.
  * **Type Inference:** The compiler can often infer the type parameter based on the argument passed, making the type parameter optional during the call (e.g., `demo.genericsMethod("String")`).

## 4\. Java Core Concepts

### 4.1. Annotations (Metadata)

  * **Definition:** Metadata (data about data) for source code.
  * **Categories:**
    1.  **Predefined:** `@Override`, `@Deprecated`, `@SuppressWarnings`, `@FunctionalInterface`, `@SafeVarargs`.
    2.  **Custom:** Defined using `@interface`.
    3.  **Meta-annotations:** Applied to other annotations (e.g., `@Retention`, `@Target`, `@Inherited`).

### 4.2. Core Terminology

| Term | Definition |
| :--- | :--- |
| **Keywords** | Predefined, reserved words with special meaning to the compiler (e.g., `public`, `static`, `class`). |
| **Identifiers** | Names given to variables, classes, methods, etc. |
| **Logging** | The process of creating and capturing log messages and files (via `java.util.logging`). |
| **Assertions** | Helps detect bugs by testing code that is assumed to be true (`assert <condition>`). |

### 4.3. Type Casting & Wrapper Classes

  * **Type Casting:** Converting the value of one data type to another.
      * **Implicit (Widening):** Automatic conversion (e.g., `int` to `double`).
      * **Explicit (Narrowing):** Manual conversion (e.g., `double` to `int`).
      * **Exception:** Converting a non-numeric `String` to an integer throws `NumberFormatException`.
  * **Wrapper Classes:** Convert primitive types (`int`, `char`) into their corresponding objects (`Integer`, `Character`).
  * **Autoboxing:** Automatic conversion of a primitive type to its wrapper class object.
  * **Unboxing:** Automatic conversion of a wrapper class object to its primitive type.

### 4.4. I/O and Command Line

  * **I/O Streams:** A sequence of data read from a source (Input Stream) or written to a destination (Output Stream).
      * **Types:** Byte Stream, Character Stream.
  * **Command-Line Arguments:** Arguments passed during program execution.
      * Arguments are always stored as **strings** and separated by **white-space**.
