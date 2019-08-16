FROM java:8
VOLUME /tmp
ADD spring-boot-rest-consumer-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080 8443 8000
COPY ./docker-entrypoint.sh /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]
RUN chmod +x /docker-entrypoint.sh
CMD ["start"]