package edu.ant.algorithms.intro
// in Groovy class is public by default
// content of class edu.ant.algorithms.intro.GroovyIntro.groovy
class GroovyIntro {

    /**
     * In Groovy, the class name isn’t required to match the name of the source file
     * */

    /**
     * Groovy compiles to the same bytecode as Java
     * Has own compiler: groovyc (reads Groovy source files and compiles to Java bytecode)
     * Bytecode is loaded by JVM like any other Java class
     * There is no Groovy VM :-)
     * The Groovy runtime is a single Java archive (JAR) file
     * To enable Groovy in existing Java project add Groovy JAR into the classpath (e.g. Maven dependency)
     * Groovy is a dynamic language (Java is static)
     * (dynamically typed or optionally typed, because Groovy still supports the Java way of explicit types)
     * Is a strongly typed language (same as Java)
     * Is object-oriented (same as Java)
     * Comes with the GDK (Java has the JDK )
     * Runs on the JVM (same as Java)
     * Favors concise code (Java is considered verbose compared to Groovy)
     * Offers its own libraries (for example, web and object relational frameworks)
     * Can use any existing Java library as-is (Java can also call Groovy code)
     * Has closures (Java 8 has lambda expressions)
     * Supports duck typing 1 (Java has strict inheritance)
     * */

    /**
     * BIGGEST DIFFERENCE: Groovy’s dynamic nature.
     * Java provides a direct mapping between a source file and a class.
     * If you know the source code, you know everything there is to know about a class.
     * In Groovy, a class/object can change during runtime in ways that are impossible in Java.
     * For example, it’s possible to add new methods to a Groovy object (that weren’t in its source code),
     * delegate existing methods to other objects, or even create completely new classes during runtime.
     * */


    /**
     * ### def keyword:
     * - def with variables - type of a variable unknown, will be known later
     * - def with methods - return type of a method unknown
     * */

    // fields are private by default
    int id
    String title // no semicolons

    // method is public by default
    // psvm method similar to Java-style
    static void main(String[] args) {
        GroovyExample groovyExample = new GroovyExample()
        // getters and setters available automatically
        groovyExample.setContent("testContent")
        // even simplier direct access
        groovyExample.content = "anotherTestContent"
        // directly or by getter
        println(groovyExample.content)
        // println is groovy helper shortcut but we can use
        // dollar
        println("Content of the file is $groovyExample.content")
        println(groovyExample.transform())
    }

    /**
     * Groovy code can create Java classes with the new keyword.
     * Groovy code can call Java methods.
     * Groovy classes can extend Java classes.
     * Groovy classes can implement Java interfaces.
     * */

    /**
     * ### return keyword:
     * - return keyword is also optional
     * - the last evaluated statement in a method is the result
     of the method in that case.
     * */

    /**
     * ### Groovy truth:
     * Groovy treats all objects 8 as true unless
     * The object is an empty string.
     * The object is a null reference.
     * The object is the zero number.
     * The object is an empty collection (map, list, array, and so on).
     * The object is the false Boolean (obviously).
     * The object is a regex matcher that fails.
     * */

}
