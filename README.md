# kafka-example
se tiene que inicializar zookeeper y el broker kafka y crear el topico "my-topic"

1. descargar kafka https://kafka.apache.org/downloads
2. iniciar zookeeper "este monitorea los brokers y distribuye los mensajes entre las particiones"
   zookeeper-server-start.bat ..\..\config\zookeeper.properties
  * nota: se tiene que estar parado en la carpeta kafka\kafka\bin\windows y ejecutar comando desde cmd
3. iniciar broker de mensajeria
  * kafka-server-start.bat ..\..\config\server.properties
4. se tiene que crear el topico my-topic
  * kafka-topics.bat --create --topic my-topic -zookeeper localhost:2181 --replication-factor 1 --partitions 1
5. se inician los proyectos en donde el aplicativo recibe parametros via rest
  * http://localhost:8082/send?input=prueba
6. se puede verificar los mensajes del consumidor por consola o tambien ingresando a la bd en memoria
  * http://localhost:8080/h2-console/

https://github.com/dilipsundarraj1/TeachApacheKafka/blob/master/Kafka_Commands.md
