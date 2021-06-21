FROM adoptopenjdk/openjdk11:latest

WORKDIR /usr/local/tomcat

RUN apt-get update
RUN apt-get install -y maven

COPY . .

RUN mvn -DskipTests -Pprod clean package

ENTRYPOINT ["java", "-jar", "/usr/local/tomcat/target/pokeapi-0.0.1-SNAPSHOT.jar"]