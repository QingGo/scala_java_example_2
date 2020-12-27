### About

Another simple example for interoperate Scala with Java

让Scala和Java在同两个项目里面相互调用。现在在vscode使用语法提示没有问题，但是点进去还是看不到源码。

第一次调用需要注释掉两个项目之间互相调用的部分，目前没有想到更好的办法。

### Related Project:

scala_java_example: https://github.com/QingGo/scala_java_example

### Usage:
``` bash
# build java project first then build scala
make build-java-scala
# or build scala project first then build java
make build-scala-java
# run
make run
```