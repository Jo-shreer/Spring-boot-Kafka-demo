## Testing Steps

Follow these steps to test your Spring Boot Kafka application:

### 1. Start Kafka Broker

- Make sure Apache Kafka and Zookeeper are running on your machine.
- By default, Kafka runs on `localhost:9092`.

### 2. Build and Run the Application

- In the project root, run:
  ```sh
  ./mvnw spring-boot:run
  ```
  or use the "Run" button in VS Code.

### 3. Send a Test Message

- You can trigger the producer method (`publishMessage`) from a REST endpoint, a command line runner, or directly in code.
- Example (if using REST):
  ```
  sh got to browser - http://localhost:8080/publish?message=HelloKafka
  ```

### 4. Check Consumer Logs

- The consumer should automatically log received messages.
- Look for log output like:
  ```
  Message consumed  topic: HelloKafka
  ```

### 5. Verify in Kafka Console (Optional)

- Start a Kafka console consumer to see messages:
  ```sh
  kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic ktopic1 --from-beginning
  ```

### 6. Stop the Application

- Press `Ctrl+C` in the terminal to stop the Spring Boot application.

---
**Note:**  
Make sure your `application.properties` is configured with the correct
