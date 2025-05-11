# KPJavaSpringBoot

# Welcome to KPJavaSpringBoot & Docker

This is a repo for new users getting started with Spring Boot Application running inside a Docker Container.

# Building

Maintainers should see [MAINTAINERS.md](MAINTAINERS.md).

Build and run:
```
docker build -t kpjavaspringboot-docker . 
docker run -d -p 8181:8080 --name kpjavaspringboot-docker kpjavaspringboot-docker
```
Open `http://localhost:8181` in your browser.


