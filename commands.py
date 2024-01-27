"""

ssh -i [key-pair] hadoop@[emr-master-public-dns-address]

nano spark-etl.scala

spark-submit spark-etl.scala s3://<YOUR-BUCKET>/input/ s3://<YOUR-BUCKET>/output/spark


spark-submit s3://<bucketname>/files/spark-etl.scala s3://<bucketname>/input s3://<bucketname>/output


"""