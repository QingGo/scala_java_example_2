.PHONY:build
build:
	ln -s ../../java_example/target/java_example-1.0-SNAPSHOT.jar ./
	sbt clean package

.PHONY:run
run:
	scala -cp ./lib/java_example-1.0-SNAPSHOT.jar ./target/scala-2.12/scala_example_2.12-1.0-SNAPSHOT.jar