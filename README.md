![spring-boot-book-hero.jpg](http://codeboje.de/spring-boot-book/spring-boot-book-hero.jpg "spring boot book cover hero")

Learn to build your first Spring Boot application with an actionable and hands-on approach.

This is the sample application for the pocket guide [Spring Boot: How To Get Started and Build a Microservice](http://codeboje.de/spring-boot-book/ "Spring Boot book") - second edition.

The pocket guide is available on [my site](http://codeboje.de/spring-boot-book/ "the Spring Boot book home").

# Parts

1. _spring-core-exercise_ contains the sample application for the Spring Core Beginners chapter
2. _spring-boot-microservice_ contains the sample microservice we build

# Running the Microservice

The microservice is using a Maven Multimodule setup. To build it completely, follow these steps.

After cloning the project run

```bash
cd spring-boot-microservice
```

```bash
mvn clean install
```

Change into the comment-store directory

```bash
cd comment-store
```

and finally run it:

```bash
mvn spring-boot:run
```
