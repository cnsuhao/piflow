package cn.piflow.shell

import java.io.{File, FilenameFilter}

import cn.piflow.FlowException
import scala.collection.mutable.ArrayBuffer

object ShellRunner {
	def main(args: Array[String]) {
		if (args.length != 1) {
			val className = this.getClass.getName;
			println(s"wrong arguments: ${className} <class-path>");
		}
		else {
			val classPath2 = formatClassPath(args(0));
			println("starting piflow shell...");
			new Shell().run(classPath2);
		}
	}

	def formatClassPath(cp: String): String = {
		val sb = new ArrayBuffer[String]();
		cp.trim.split("[\r\n\t:;]").map(_.trim).filter(!_.isEmpty).
			foreach { path: String =>
				val file = new File(path).getCanonicalFile;
				val path2 = file.getAbsolutePath;
				if (!file.exists()) {
					throw new FlowException(s"wrong path: $path2");
				}

				sb += path2;
				if (file.isDirectory) {
					sb ++= file.listFiles(new FilenameFilter {
						def accept(dir: File, name: String) = name.endsWith(".jar");
					}).map(_.getAbsolutePath);
				}
			}

		sb.toArray.reduce(_ + ":" + _);
	}
}