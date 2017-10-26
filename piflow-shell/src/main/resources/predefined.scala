import java.util._
import cn.piflow._
import cn.piflow.io._
import cn.piflow.dsl._
import cn.piflow.processor._
import cn.piflow.processor.ds._
import cn.piflow.shell._
import org.apache.spark.sql._
import sys.process._;

object PRELOAD_CODES {
	implicit val spark = SparkSession.builder.master("local[4]")
		.getOrCreate();

	spark.conf.set("spark.sql.streaming.checkpointLocation", "/tmp/");

	import spark.implicits._;

	implicit val runner = Runner.sparkRunner(spark);
	val jobs = new cn.piflow.shell.cmd.JobCmd(runner);
	val store = new cn.piflow.shell.cmd.StoreCmd(runner);

	private def THIS_METHOD_WILL_NEVER_BE_CALLED_ONLY_FOR_SYNTAX_CHECK() {
		if (false) {
			"ls" !;
			println(runner);
			println(jobs);
			println(store);
			new Date();
			val pl = SeqAsSource(1 to 1000) > DoMap[Int, Int](_ + 1) > ConsoleSink();
			asGraph(pl);
			pl !;
			pl !@ (Start.now)
		}
	}
}