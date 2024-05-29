./mvnw clean

./mvnw package -DskipTests

docker build -t spring-boot-docker .

docker run -d --name java-container --network=mybridge --ip 172.18.0.101 -p 10000:10000 spring-boot-docker
