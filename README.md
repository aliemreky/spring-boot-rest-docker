# Spring Boot REST + Docker Example

## Getting Started

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

Response Service:
```bash
{
    "Message": "Hello World Docker"
}
```
