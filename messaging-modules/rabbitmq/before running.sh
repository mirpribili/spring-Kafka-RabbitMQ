fuser -k 8082/tcp
fuser -k 8081/tcp
fuser -k 8080/tcp

docker stop $(docker ps -a -q)
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10.5-management


