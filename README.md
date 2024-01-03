# kafka practice project

Insallation of kafka in windows 

https://kafka.apache.org/quickstart
 download and extract


```powershell
   1 cd f:
   2 cd .\kafka\kafka\
   3 ls
   4 .\bin\windows\kafka-topics.bat --create --topic sample-topic
   5 .\bin\windows\kafka-topics.bat --create --topic sample-topic --bootstrap-server localhost:9092
   6 .\bin\windows\kafka-console-producer.bat --topic sample-topic --bootstrap-server localhost:9092
   7 bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic-example --from-beginning

```
## setting the kafka spring boot properties

with out spring boot we need to configure a lot of code

```properties
spring.kafka.consumer.bootstrap-servers=localhost:9092 
spring.kafka.consumer.group-id= myGroup
# what to do when offset is not available, set the offest to the earliest availbale
spring.kafka.consumer.auto-offset-reset= earliest
spring.kafka.consumer.key-deserializer= org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer= org.apache.kafka.common.serialization.StringDeserializer


spring.kafka.producer.bootstrap-servers= localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer



```

