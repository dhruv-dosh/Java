# ☕ Java Revision Guide (Complete)

This comprehensive guide covers all Java topics, structured for quick and efficient revision.

## I. Java Architecture and Basics

| Topic | Quick Revision Note |
| :--- | :--- |
| **JDK, JVM and JRE** | **JDK (Development Kit):** JRE + Development Tools (Compiler, Debugger). Used to **develop**. **JRE (Runtime Environment):** JVM + Libraries. Used to **run**. **JVM (Virtual Machine):** Executes bytecode. |
| **Variables and Literals** | **Variable:** A named memory location. **Literal:** The constant value assigned to a variable (e.g., `100`, `"Java"`). |
| **Operators** | Symbols performing operations (Arithmetic: `+`, `-`; Logical: `&&`, `||`; Relational: `>`, `<`; etc.). |
| **Input and Output** | Standard I/O operations. Input typically handled by `Scanner`, output via `System.out.println()`. |
| **Data Types** | **Primitive** (8 types: `int`, `char`, `boolean`, etc., stored directly) and **Non-Primitive** (Objects, Arrays, stored by reference). |

## II. Control Flow

| Topic | Quick Revision Note |
| :--- | :--- |
| **Loops and conditions** | **Loops** (`for`, `while`, `do-while`) for repetition. **Conditions** (`if`, `else`, `switch`) for decision making. |
| **Ternary Operator** | A single-line `if/else` for value assignment: `(condition) ? value_if_true : value_if_false;` |
| **`break` and `continue`** | **`break`:** Exits the innermost loop or `switch` block entirely. **`continue`:** Skips the remaining code in the current iteration and proceeds to the next loop iteration. |

## III. String and Character Manipulation

| Topic | Quick Revision Note |
| :--- | :--- |
| **String and StringBuilder** | **String:** **Immutable** (creates a new object on modification), Thread-Safe. **StringBuilder:** **Mutable** (modifies in place), **Not** Thread-Safe, best for fast, single-threaded modification. |

## IV. Collections

| Topic | Quick Revision Note |
| :--- | :--- |
| **Arrays** | Fixed-size collection of elements of the same data type. Accessed using a 0-based index. |

## V. Functions and Advanced Logic

| Topic | Quick Revision Note |
| :--- | :--- |
| **methods** | A block of code that performs a specific task. Used for modularity, reusability, and encapsulation. |
| **var arguments** | Allows a method to accept zero or more arguments of a specified type (e.g., `(int... numbers)`). |
| **recursion** | A method calls itself to solve a smaller version of the same problem. Requires a **base case** to terminate. |

## VI. Object-Oriented Programming (OOP)

| Concept/Topic | Quick Revision Note (Pillars, Mechanisms, Keywords) |
| :--- | :--- |
| **class** | The blueprint from which objects are created. Defines state (fields) and behavior (methods). |
| **constructors** | Special method used to initialize objects. Name must match the class name. |
| **inheritance** | Mechanism where one class (`subclass`) acquires properties/methods of another (`superclass`) using `extends`. **Goal:** Code Reusability. |
| **encapsulation** | Wrapping data (fields) and code (methods) into a single unit (class). Achieved by hiding fields (`private`). **Goal:** Data Hiding. |
| **abstraction** | Showing only essential information and hiding the implementation details. Achieved using Abstract Classes and Interfaces. |
| **`this` and `super` keyword**| **`this`:** Refers to the current object. Used to call current class constructor or differentiate instance/local variables. **`super`:** Refers to the immediate parent class object. Used to call parent constructor/method. |
| **method overloading** | **Compile-Time Polymorphism.** Methods in the **same class** have the same name but different argument lists (number, type, or order). |
| **method overriding** | **Run-Time Polymorphism.** Subclass provides a specific implementation for a method already defined in its superclass. |
| **Dynamic method dispatch**| The runtime mechanism where the overridden method to be called is decided based on the object type, not the reference type. |
| **Abstract class and Method**| **Abstract Class:** Cannot be instantiated. Can contain abstract methods (no body) and concrete methods. **Abstract Method:** Declared with `abstract` keyword, must be implemented by the first concrete subclass. |
| **Interface** | A blueprint of a class containing constants and abstract methods (pre-Java 8). Used for achieving 100% abstraction and multiple inheritance of type. |
| **Default Method** | Method in an interface (Java 8+) with a body. Used for non-breaking additions to interfaces. |
| **inheritance in interface**| An interface can inherit from another interface using the `extends` keyword. |
| **polymorphism in interface**| A reference variable of an interface type can hold an object of any class that implements that interface. |
| **package** | A namespace that organizes a set of related classes and interfaces. |
| **Access Modifier** | Specifies the accessibility scope: `private`, `default` (package-level), `protected`, `public`. |

## VII. Multithreading (Concurrency)

| Topic | Quick Revision Note |
| :--- | :--- |
| **Thread life cycle** | New $\rightarrow$ Runnable $\rightarrow$ Running $\rightarrow$ Blocked/Waiting $\rightarrow$ Terminated. |
| **thread priority** | A hint to the scheduler (1 to 10) to determine which thread should be executed next. |
| **thread method** | Core methods: `start()`, `run()`, `sleep()`, `join()`, `interrupt()`, `yield()`. |
| **synchronized keyword**| Used on methods or blocks to enforce that only one thread can access that code section at a time. |
| **locks in java** | Explicit locking mechanism via the `java.util.concurrent.locks` package (e.g., `ReentrantLock`). Provides more control than `synchronized`. |
| **thread safety** | Code that executes correctly when multiple threads access and modify shared mutable state concurrently. |
| **thread communication** | Achieved using `wait()`, `notify()`, and `notifyAll()`. **Must** be called inside a `synchronized` block/method. |
| **Atomic And volatile keyword**| **`volatile`:** Guarantees visibility (read/write from main memory). **`Atomic`:** Provides thread-safe, non-blocking operations on single variables (e.g., `AtomicInteger`). |

## VIII. Exception Handling

| Topic | Quick Revision Note |
| :--- | :--- |
| **Exception handling (error and exception)** | **Error:** Irrecoverable JVM problem (e.g., `OutOfMemoryError`). **Exception:** Recoverable event. Categories: **Checked** (compile-time) and **Unchecked** (`RuntimeException`). |
| **`throw` and `throws`** | **`throw`:** Used to explicitly throw a single exception *instance* (in method body). **`throws`:** Used to *declare* the exceptions a method *might* throw (in method signature). |
| **`finally` block** | Block that **always executes** after the `try` and `catch` blocks, primarily used for cleanup code (closing files, connections). |

## IX. Collections Framework

| Topic | Structure / Key Feature |
| :--- | :--- |
| **`iterabls interface`** | Root of the collection hierarchy. Enables use of the **`for-each`** loop. |
| **`collection interface`** | Base interface for most data structures (`List`, `Set`, `Queue`). |
| **`list Interface(arraylist, linklist, stack)`** | **`List` (Ordered, Allows Duplicates).** **`ArrayList`:** Dynamic Array (Fast random access). **`LinkedList`:** Doubly Linked List (Fast insertions/deletions). **`Stack`:** LIFO (Last-In, First-Out). |
| **`set interface( hash set , linked hash set, tree set )`** | **`Set` (Unique Elements).** **`HashSet`:** Hashing (Fastest, no order). **`LinkedHashSet`:** Maintains **insertion order**. **`TreeSet`:** Maintains **sorted order**. |
| **`queue(linkedlist, priority queue, deque, blocking queue, synchronous queue)`** | **`Queue` (FIFO).** **`PriorityQueue`:** Head is the least element. **`Deque`:** Double-ended queue. **`BlockingQueue`:** Thread-safe, blocks on full/empty. **`SynchronousQueue`:** Zero capacity (transfer between producer/consumer). |
| **`map (hashmap , tree map, linked hash map, navigable map)`** | **`Map` (Key-Value Pairs, Unique Keys).** **`HashMap`:** Hashing (Fastest, no order). **`TreeMap`:** Sorted by **key**. **`LinkedHashMap`:** Maintains **insertion order** of keys. **`NavigableMap`:** Extends `SortedMap` with navigation methods. |
| **`comparator and comparable`**| **`Comparable`:** Defines the **natural ordering** (`compareTo()`). **`Comparator`:** Defines **custom ordering** (uses `compare()`). |

## X. Java 8 Features

| Topic | Quick Revision Note |
| :--- | :--- |
| **`lamda experession`** | Anonymous function/unnamed method. Concise way to implement the single abstract method of a Functional Interface. |
| **`functional interface`** | Interface with **exactly one** abstract method (SAM - Single Abstract Method). Often annotated with `@FunctionalInterface`. |
| **`predicate`** | Built-in Functional Interface: Takes one input, returns **boolean**. Used for filtering/testing. |
| **`function`** | Built-in Functional Interface: Takes one input (`T`), returns one output (`R`). Used for mapping/transformation. |
| **`consumer`** | Built-in Functional Interface: Takes one input, returns **void**. Used for consuming/side effects (e.g., printing). |
| **`supplier`** | Built-in Functional Interface: Takes **no** input, returns an output (`T`). Used for providing/generating values. |
| **`method reference`** | Shorthand for a lambda expression that simply calls an existing method. Syntax: `ClassName::staticMethod`. |
| **`constructor reference`**| Shorthand for a lambda expression that calls a constructor. Syntax: `ClassName::new`. |
| **`streams`** | A sequence of elements that supports sequential and parallel aggregate operations. Used for declarative data processing. |

## XI. Advanced and Utility Topics

| Topic | Quick Revision Note |
| :--- | :--- |
| **`file handling`** | Reading from and writing to files. Involves I/O streams (`InputStream`/`OutputStream` for bytes, `Reader`/`Writer` for chars). |
| **`bit manipulation`** | Operating directly on the binary representation (bits) of data using bitwise operators (`&`, `|`, `^`, `~`, `<<`, `>>`). |
| **`heap and min heap`** | **Heap:** A complete binary tree that satisfies the heap property. **Min Heap:** Parent node value $\leq$ child node values (smallest element at the root). |


*For In Depth MySQL DataBase Notes [MySQL](https://github.com/dhruv-dosh/MySQL_Relational_Database_Notes)*
 
 *For Learning Spring Boot [Spring boot](https://github.com/dhruv-dosh/Spring_Java_Framework)*
 
 *For Learning Docker [Docker](https://github.com/dhruv-dosh/Docker_Notes_And_Commands)*
 
 *For Learning Jenkins [Jenkins](https://github.com/dhruv-dosh/Jenkins_Declarative_Pipeline_Setup)*

*Created and maintained by [dhruv-doshi](https://github.com/dhruv-dosh)*
