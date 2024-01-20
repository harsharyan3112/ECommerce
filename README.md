# eCommerce Website with Java Spring Boot

This repository contains the source code for an eCommerce website built using Java Spring Boot, Spring MVC, JDBC, and an inbuilt H2 database for development purposes. The front-end is implemented with Bootstrap, CSS, HTML, and JavaScript.

## Project Overview

The eCommerce website is designed to showcase the basic functionalities of an online shopping platform. It includes features such as:

- Product catalog with details
- User registration and authentication
- Shopping cart functionality
- Order processing

## Technologies Used

- **Java Spring Boot:** Provides a robust framework for building and deploying Java-based applications.
- **Spring MVC:** Implements the Model-View-Controller design pattern for the web application.
- **JDBC:** Enables Java applications to interact with databases using standard SQL.
- **H2 Database (in-memory):** A lightweight, embedded database for development and testing.
- **Bootstrap:** A popular CSS framework for building responsive and visually appealing web pages.
- **HTML, CSS, JavaScript:** Standard web development technologies for creating the user interface and enhancing interactivity.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) with Spring Boot support
- Web browser

### Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/harsharyan3112/ECommerce.git
    cd ecommerce-website
    ```

2. Run the application:

    ```bash
    ./mvnw spring-boot:run
    ```

3. Access the application:

    Open your web browser and go to [http://localhost:8080](http://localhost:8080)

## Database Access

During development, you can access the H2 console at [http://localhost:8080/h2-console](http://localhost:8080/h2-console) to view and manage the in-memory database.

- JDBC URL: `jdbc:h2:file:./db`
- Username: `root`
- Password: `root`

## Contributing

Feel free to contribute to this project by forking the repository and submitting pull requests. If you find any issues or have suggestions, please open an issue.


## Acknowledgments

- Thanks to the Spring Boot and Bootstrap communities for providing excellent tools and resources.

