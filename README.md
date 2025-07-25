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

