# Kaiburr Task 1

## Prerequisites

Ensure you have the following tools installed before running the application:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)
- [MongoDB](https://www.mongodb.com/try/download/community)
- [Spring Boot](https://spring.io/projects/spring-boot) 

## API Endpoints

1. **Get All Tasks**
    - **URL:** `/tasks`
    - **Method:** `GET`
    - **Description:** Retrieve the list of all tasks.

2. **Get Task by ID**
    - **URL:** `/tasks/{id}`
    - **Method:** `GET`
    - **Description:** Retrieve a specific task by its ID.

3. **Save Task**
    - **URL:** `/tasks`
    - **Method:** `PUT`
    - **Description:** Save a new task. Send a JSON payload in the request body.

4. **Delete Task**
    - **URL:** `/tasks/{id}`
    - **Method:** `DELETE`
    - **Description:** Delete a task by its ID.

5. **Find Tasks by Name**
    - **URL:** `/tasks/findByName?name={taskName}`
    - **Method:** `GET`
    - **Description:** Find tasks that contain the specified name.

6. **Find First 10 Tasks by Assignee**
    - **URL:** `/tasks/findFirst10TasksByAssignee?assignee={assigneeName}`
    - **Method:** `GET`
    - **Description:** Retrieve the first 10 tasks for the specified assignee, sorted by start time.

## How to Run

1. Clone this repository.
2. Update MongoDB connection details in `application.yml`.
3. Build the project using `./mvnw clean install`
4. Run the application using `./mvnw spring-boot:run` 

# Dependencies

This project uses the following dependencies:

- [Spring Boot Starter Data MongoDB](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-mongodb)
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [Project Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
- [Apache Commons Lang](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3)


## Configuration

MongoDB connection details are specified in `application.yml`. Update the `uri` and `database` accordingly.

```yaml
spring:
  data:
    mongodb:
      uri : mongodb+srv://username:password@your-mongodb-uri
      database : YourDatabaseName

