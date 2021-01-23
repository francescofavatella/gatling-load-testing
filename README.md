# gatling-load-testing

https://start.spring.io/
lombok
spring-web
prometheus

## Docker

### Build image

```
docker build -t spring-app .
docker images
```

### Run app

```
docker run -d -it -p 8080:8080 --name=local.spring-app spring-app
docker logs local.spring-app -f
```

### Test app

```
curl http://localhost:8080
Hello Docker World%
```

### Stop app

```
docker stop local.spring-app
```

### Remove container

```
docker ps -a
docker rm CONTAINER_ID
```

### Remove image

```
docker rmi spring-app
```

## Docker compose

```
docker-compose up
```
