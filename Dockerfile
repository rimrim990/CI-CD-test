# JVM 설정
FROM azul/zulu-openjdk:17
# 도커 이미지 빌드시 사용될 JAR_FILE 파라미터 설정
ARG JAR_FILE=build/libs/*.jar
# JAF_FILE 을 지정된 이름으로 복사
ADD ${JAR_FILE} ci-cd-server.jar
# 도커 컨테이너에서 실행할 명령어 지정 - JAR_FILE 실행
ENTRYPOINT ["java","-jar","/ci-cd-server.jar"]
