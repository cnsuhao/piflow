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

# Tests and Examples

- BatchFlowTest: tests batch flow building and execution
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/BatchFlowTest.scala

- JobManagerTest: tests job management functions, including list, kill, pause operations
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/JobManagerTest.scala

- DslTest: tests PiFlow DSL
https://gitee.com/bluejoe/piflow/blob/master/piflow-core/src/test/scala/cn/piflow/flow/DslTest.scala

- ShellRunner: starts a PiFlow shell
https://gitee.com/bluejoe/piflow/blob/master/piflow-shell/src/main/scala/cn/piflow/shell/ShellRunner.scala