package streaming.core

/**
 * 5/11/16 WilliamZhu(allwefantasy@gmail.com)
 */
object LocalSparkApp {
  def main(args: Array[String]): Unit = {
    StreamingApp.main(Array(
      "-streaming.master", "local[2]",
      "-streaming.name", "god",
      "-streaming.rest", "true",
      "-streaming.platform", "spark"
    ))
  }
}
