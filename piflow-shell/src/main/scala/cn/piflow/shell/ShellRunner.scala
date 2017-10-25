package cn.piflow.shell

object ShellRunner {
	def main(args: Array[String]) {
		println("starting piflow shell...");
		new Shell().run();
	}
}