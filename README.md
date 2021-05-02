# Spring Boot REST + Docker 

Clone this example's source code:

```bash
git clone https://github.com/aliemreky/spring-boot-rest-docker.git
cd spring-boot-rest-docker
```

Run the application!

Maven build
```bash
mvn clean package
```

Create docker image by DockerFile
```bash
docker build -t springdocker -f Dockerfile .
```

Looking docker images

```bash
docker images -a
```
Run the spring rest project
```bash
docker run -p 9999:8080 springdocker
```

Spring project running...

Open Postman and test rest url: 

```bash
localhost:9999/api/welcome-docker
```

Response Message From Rest Service:
```bash
{
    "Message": "Hello World Docker"
}
```

# Spring Boot REST + Docker + Redis

Build Java Jar
```bash
mvn clean install
```

Docker Compose Build and Run
```bash
docker-compose build --no-cache
docker-compose up --force-recreate
```

Spring and Redis running...

Open Postman and test rest url: 

```bash
localhost:8080/api/welcome-redis-docker
```

Response message from rest service:
```bash
{
    "Message": "Hello World Docker & Redis",
    "Redis Cache": "count value : 3"
}
```

_Note: Every request increases number of the redis cache variable "count"._
