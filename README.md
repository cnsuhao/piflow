# πFlow
a full big data flow system involving online data collection, real time computation, data output

```
        ______ _
       |  ____| |
 ______| |__  | | _____      __
/_ _  _|  __| | |/ _ \ \ /\ / /
 || ||_| |    | | (_) \ V  V /
 |/  \/|_|    |_|\___/ \_/\_/
	
```

# Running piflow-shell with maven

Since piflow-shell depends on piflow-core, so compile piflow-core project first:
```
cd piflow-core
mvn clean compile -DskipTests
```

Then, run mvn with following arguments:
```
cd ./piflow-shell
mvn clean test -Prun-shell
```

Now, piflow-shell will be started in which you can type commands:
```
πFlow> SeqAsSource(1 to 1000) > "_1:_1" > DoMap[Int, Int](_ + 1) > ConsoleSink()
πFlow> res0!
```

type ```:quit``` to quit the shell.

# Tests and Examples

- BatchFlowTest: tests batch flow building and execution
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/BatchFlowTest.scala

- JobManagerTest: tests job management functions, including list, kill, pause operations
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/JobManagerTest.scala

- DslTest: tests PiFlow DSL
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/DslTest.scala

- ShellRunner: starts a PiFlow shell
https://gitee.com/bluejoe/piflow/blob/master/piflow-shell/src/main/scala/cn/piflow/shell/ShellRunner.scala