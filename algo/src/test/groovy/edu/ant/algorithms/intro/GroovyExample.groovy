package edu.ant.algorithms.intro

class GroovyExample {

    // def with variables: wildcard for variable type
    def content

    // def with methods: wildcard for return type
    def transform() {
        // return keyword is not necessary
        // last evaluated statement is being returned
        "Content transformed: transformed " + content
    }

}
