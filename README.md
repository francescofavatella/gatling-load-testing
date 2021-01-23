# Gatling Load Testing

[Gatling](https://gatling.io/) is an open-source load testing tool for web applications.
As part of this project you will run Gatling (`gatling-runner`) against a [Spring Boot](https://spring.io/projects/spring-boot) application exposing a Rest endpoint (`spring-app`).

The Gatling runner uses the official Gatling bundle and provides a custom scenario defined into the `SampleService.scala` file.

You will be able to run the application and the Gatling simulation using `docker-compose`, no other tools are required.

## How to use

Download the project:

```
git clone https://github.com/francescofavatella/gatling-load-testing.git
cd gatling-load-testing
```

Start the Spring application and the Gatling simulation using Docker compose:

```
docker-compose up
```

For each simulation Gatling provides us HTML report of the test that we performed.
Results will be saved into the `./gatling-runner/results`.

The SampleService.scala file (`./gatling-runner/simulations/sample/SampleService.scala`) contains the scenario setup.

## Spring-app

The Spring Boot application was generated using the [Spring Initializer](https://start.spring.io/) adding the following dependencies:

- spring-web
- lombok (not required)
- prometheus (not required)

### Start only the Spring Boot app using Docker (optional)

```
docker build -t spring-app .
docker images

docker run -d -it -p 8080:8080 --name=local.spring-app spring-app
docker logs local.spring-app -f

curl http://localhost:8080
Hello Docker World%

docker stop local.spring-app

docker ps -a
docker rm CONTAINER_ID

docker rmi spring-app
```
