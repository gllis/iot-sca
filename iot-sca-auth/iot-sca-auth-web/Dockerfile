FROM openjdk:8-jdk-alpine as builder

LABEL author="glli" \
	email="admin@gllis.com"

ADD ./iot-sca-auth-web/target/iot-sca-auth-*.jar /app.jar

RUN sh -c 'touch /app.jar'
EXPOSE 9001

ENTRYPOINT ["java", "-jar","/app.jar"]