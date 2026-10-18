# Design Patterns in Java

> **Archived.** This is a 2018 training/learning project and is no longer maintained.

A collection of small Java examples, one package per design pattern, written as training material. Each pattern package has a `Runner` class with a `main` method that demonstrates the pattern. Some packages also contain a JUnit test.

Patterns covered (under `src/main/java/com/amadeus/training/patterns/`):

- **creational:** abstract factory, builder, factory, factory method, singleton
- **structural:** adapter, bridge, composite, decorator, flyweight, proxy
- **behavioral:** chain of responsibility (`cor`), command, interpreter, mediator, memento, observer, state, template method, visitor
- **rot:** small console and file copier examples

The slides used for the training are in `Design Patterns in Java.ppsx`.

## Tech stack

- Java (source/target 1.8)
- Maven (`pom.xml`)
- Project Lombok 1.18.0 (provided scope)
- JUnit 3.8.1 and 4.12

## Repository structure

```
pom.xml                                  Maven build file
libs/legacy.jar                          legacy enrolment-logger library used by the adapter example
src/main/java/com/amadeus/training/patterns/
  creational/   abstract_factory, builder, factory, factory_method, singleton
  structural/   adapter, bridge, composite, decorator, flyweight, proxy
  behavioral/   command, cor, interpreter, mediator, memento, observer, state, template_method, visitor
  rot/          copier examples
src/test/java/  JUnit test (AppTest)
```

## Build and run

Requires a JDK (8 or later) and Maven.

```
mvn compile
```

Run a pattern demo by executing its `Runner` class, for example `com.amadeus.training.patterns.behavioral.observer.Runner`. The `adapter` example uses classes from `libs/legacy.jar`, which is not declared in `pom.xml`, so that jar must be added to the classpath manually when running it.

Build and run were not re-verified during this cleanup.
