# Spring-boot-demo
Spring boot concepts with code

# Apache Kafka Notes

## Overview
Apache Kafka is a distributed streaming platform designed for high-throughput, fault-tolerant, real-time data pipelines and streaming applications. It enables publishing and subscribing to streams of records, storing them reliably, and processing streams in real time.

---

## Architecture

- **Producer**: Sends data (messages) to Kafka topics.
- **Broker**: Kafka server that stores data and serves clients.
- **Topic**: Category or feed name to which records are published.
- **Partition**: A topic is divided into partitions for scalability.
- **Consumer**: Reads data from topics.
- **ZooKeeper** (Kafka versions < 3.0): Manages cluster metadata and leader election. (Kafka 3.0+ uses KRaft mode to remove ZooKeeper)

---

## Key Components

| Component      | Description                                  |
|----------------|----------------------------------------------|
| Producer       | Application that publishes messages to topics |
| Broker         | Kafka server instance                          |
| Topic          | Logical channel to organize messages          |
| Partition      | Subdivision of topic for parallelism          |
| Consumer       | Application that subscribes and reads messages|
| Consumer Group | Group of consumers sharing the workload       |

---

## Usage

- Real-time analytics
- Event sourcing
- Log aggregation
- Messaging system replacement
- Stream processing with tools like Kafka Streams or ksqlDB

---

## Common Kafka CLI Commands

> **Note:** These commands assume you have Kafka installed and the `bin` folder added to your system PATH, or you’re running them from Kafka's `bin` directory.

### Start ZooKeeper (Kafka versions < 3.0)
```bash
zookeeper-server-start.sh config/zookeeper.properties
# Start Kafka Broker
kafka-server-start.sh config/server.properties

# Create a topic named "my-topic" with 3 partitions and replication factor 1
kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1

# List all topics
kafka-topics.sh --list --bootstrap-server localhost:9092

# Describe a topic named "my-topic"
kafka-topics.sh --describe --topic my-topic --bootstrap-server localhost:9092

# Send messages to topic "my-topic"
kafka-console-producer.sh --topic my-topic --bootstrap-server localhost:9092

# Read messages from topic "my-topic" from the beginning
kafka-console-consumer.sh --topic my-topic --bootstrap-server localhost:9092 --from-beginning

# Delete a topic named "my-topic"
kafka-topics.sh --delete --topic my-topic --bootstrap-server localhost:9092

# List consumer groups
kafka-consumer-groups.sh --list --bootstrap-server localhost:9092

# Describe a consumer group named "my-group"
kafka-consumer-groups.sh --describe --group my-group --bootstrap-server localhost:9092


