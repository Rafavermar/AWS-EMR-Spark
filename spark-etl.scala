import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import java.time.LocalDateTime

object SparkETL {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      System.err.println("Usage: SparkETL <input-folder> <output-folder>")
      System.exit(1)
    }

    val spark = SparkSession.builder
      .appName("SparkETL")
      .getOrCreate()

    import spark.implicits._

    val nyTaxi = spark.read
      .option("inferSchema", "true")
      .option("header", "true")
      .csv(args(0))

    val updatedNYTaxi = nyTaxi.withColumn("current_date", lit(LocalDateTime.now()))

    updatedNYTaxi.printSchema()

    println(updatedNYTaxi.show())

    println("Total number of records: " + updatedNYTaxi.count())

    updatedNYTaxi.write.parquet(args(1))

    spark.stop()
  }
}
