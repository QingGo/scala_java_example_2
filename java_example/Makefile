CLASSPATH=$(shell mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q)

.PHONY:build
build:
	mvn clean package

.PHONY:run
run:
	java -cp $(CLASSPATH):./target/java_example-1.0-SNAPSHOT.jar:${HOME}/.m2/repository/org/scala-lang/scala-library/2.12.12/scala-library-2.12.12.jar im.qinggo.scala_java_example_2.java_example.AppJava