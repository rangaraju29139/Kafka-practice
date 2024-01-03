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

