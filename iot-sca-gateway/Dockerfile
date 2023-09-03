FROM openjdk:8-jdk-alpine as builder

LABEL author="glli" \
	email="admin@gllis.com"

ADD ./iot-sca-gateway/target/iot-gateway-*.jar /app.jar

RUN sh -c 'touch /app.jar'
EXPOSE 8888

ENTRYPOINT ["java", "-jar","/app.jar"]