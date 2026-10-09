# JobApp

JobApp is a Spring Boot-based job portal project built with Java and JSP. The project includes page templates for a home page, adding a job, viewing all jobs, and a success page, along with Bootstrap-based styling.

## Tech stack

- Java 17
- Spring Boot 4.1.1
- Spring MVC
- JSP with Apache Tomcat Jasper
- Maven
- Bootstrap 5

## Project structure

```text
src/
├── main/
│   ├── java/com/utkarsh/JobApp/
│   │   └── JobAppApplication.java
│   ├── resources/
│   │   └── application.properties
│   └── webapp/
│       ├── views/
│       │   ├── addjob.jsp
│       │   ├── home.jsp
│       │   ├── success.jsp
│       │   └── viewalljobs.jsp
│       ├── style.css
│       └── style1.css
└── test/
    └── java/com/utkarsh/JobApp/
        └── JobAppApplicationTests.java
```

## Prerequisites

- JDK 17 or later
- Internet access on the first build so Maven can download dependencies

Check your Java installation:

```bash
java -version
```

## Running the application

Clone the repository and move into the project directory:

```bash
git clone https://github.com/Utkarsh-rwt/JobApp.git
cd JobApp
```

Run the application with the Maven wrapper:

```bash
./mvnw spring-boot:run
```

On Windows, use:

```bat
mvnw.cmd spring-boot:run
```

The application uses Spring Boot's default port, `8080`.

## Building and testing

Create a packaged build:

```bash
./mvnw clean package
```

Run the test suite:

```bash
./mvnw test
```

## Current status

The project currently contains the Spring Boot application entry point, JSP page templates, CSS assets, and a context-load test. Controller and job persistence functionality can be added to connect the existing pages to application data.

## License

This project does not currently declare a license.
