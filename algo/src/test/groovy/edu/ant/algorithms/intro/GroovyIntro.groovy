package edu.ant.algorithms.intro

// In Groovy, every class is public by default
// Content of class edu.ant.algorithms.intro.GroovyIntro.groovy

class GroovyIntro {

    /**
     * In Groovy, the class name is not required to match the name of the source file.
     **/

    /**
     * Groovy class compiles to the same bytecode as Java.
     * Groovy language has its own compiler: groovyc (reads Groovy source files and compiles to Java bytecode).
     * Groovy bytecode is loaded by JVM like any other Java class.
     * There is no Groovy VM. It runs on JVM.
     * The Groovy runtime is a single Java archive (JAR) file.
     * To enable Groovy in existing Java project: add Groovy JAR into the classpath (e.g. Maven / Gradle dependency).
     * Groovy is a dynamic language (Java is static).
     * Groovy is called dynamically typed or optionally typed, because Groovy still supports the Java way of explicit types,
     * and user can choose any of them for a given variable when declaring.
     * It is strongly typed language (same as Java) - type of a variable cannot be changed once it is declared.
     * Groovy is object-oriented (same as Java) - but allows scripting (in Java, everything must be put into a class).
     * Groovy has GDK (Java has JDK).
     * Groovy runs on the JVM (same as Java).
     * Java is considered more verbose when compared to Groovy.
     * Groovy has its own libraries (for example, web and object relational frameworks).
     * Groovy code can use any existing Java library as-is (Java can also call Groovy code).
     * In Groovy there are closures (since Java 8 there are lambda expressions).
     * Groovy (like Ruby or Python) supports duck typing, when Java has strict inheritance and polimorphism.
     * Duck typing: object type is recognized / determined on the basis on methods implemented by this object or its properties.
     * Java is using nominative typing (contrary to duck typing): object type depends on its declaration and inheritance (place it has in objects' hierarchy).
     * */

    /**
     * BIGGEST DIFFERENCE: Groovy is dynamic language:
     * a class / an object can change during runtime (it is not happening in Java)
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

        // so-called map-based constructors (instead of setters or parametrized constructors)
        def anotherGroovyExample = new GroovyExample(content: "test content")

        // map
        // it's LinkedHashMap by default
        Map<String, Integer> map = ["input1":1, "input2":2]

        // list
        List<String> list = ["A"]
        // add
        list << "B" << "C"
        print(list)
        // replace
        list[0] = "X"
        print(list)

        // input reading
        // String testInput = new File ( "src/test/resources/quotes.txt").text
        // line by line
        // File("src/test/resources/quotes.txt").readLines()
        // to read xml or json, use Slurper (deprecated)

        /**
         * Closures
         * */

        // full notation
        Closure simple = { int x -> return x * 2}
        // if not fails, shows nothing
        assert simple(3) == 6
        // simple notation, return is optional
        def simpler = { x -> x * 2}
        assert simpler(3) == 6
        // bi-function
        def twoArguments = { x,y -> x + y}
        assert twoArguments(3,5) ==8

        /**
         * Methods using closures, eg. on collections, like list.every(elem ->  elem.endsWith()):
         * every(closure)
         * any (closure)
         * find(closure)
         * findAll(closure)
         * */
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

    /**
     * In Groovy, the == operator isn’t testing identity like Java.
     * It calls the equals() method of the object.
     * Object identity in Groovy is compared by the is() method.
     * Thus object1.is(object2) is the Groovy way of testing identity.
     * */

}
