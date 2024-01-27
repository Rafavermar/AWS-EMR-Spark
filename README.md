# AWS EMR Data Processing for Data Engineers

## Description
This project demonstrates the use of Amazon Elastic Map Reduce (EMR) for processing large datasets using Apache Spark. It includes a Spark script for ETL (Extract, Transform, Load) operations, AWS command line instructions for setting up and managing the EMR cluster, and a dataset for testing and demonstration purposes.

## System Architecture
![aws-EMR-Rvm.png](assets%2Faws-EMR-Rvm.png)

## Project Structure
- `spark-etl.py`: The main Spark script used for ETL operations.
- `commands.py`: Scripts for AWS EMR cluster setup and management.
- `data/`: Directory containing the dataset used in the ETL process.

## Spark Script
The `spark-etl.py` is a Python script that uses Apache Spark to perform ETL operations. It reads data from an input directory, processes it by adding a timestamp, and writes the result to an output directory in Parquet format.

### Usage
To run the script, use the following command:
```
spark-submit spark-etl.py [s3-input-folder] [s3-output-folder]
```
Replace `[s3-input-folder]` with the path to the input data directory and `[s3-output-folder]` with the path where you want to save the output.

## AWS Commands
The `commands.py` directory contains detailed instructions and necessary scripts to set up and manage an AWS EMR cluster. This includes steps for creating an EMR cluster, configuring necessary services, and submitting Spark jobs.

## Data
The `data/` directory contains the dataset used for the ETL process. This dataset is a sample that represents the type of data the Spark script is designed to process.

## Requirements
- Apache Spark
- AWS CLI
- An AWS account with necessary permissions to create and manage EMR clusters

## Comprehensive Step by Step interactive guide
It was not only accomplishing the project but gaining a deep understanding as well. The better way to learn is explaining it to others, that's why I created this detailed step by step guide, which followed in strict order ensure a very straight forward performance.
I added many comments and explanations as well. Hope you find it all useful.

## Acknowledgements:
This project was inspired by [airscholar's RealtimeStreamingEngineering](https://github.com/airscholar/RealtimeStreamingEngineering#) and posible following the great explanations of Yusug Ganiyu
