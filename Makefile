
# build scala project first then build java
.PHONY:build-scala-java
build-scala-java:
	cd ./scala_example && make build && cd ../java_example && make build

# build java project first then build scala
.PHONY:build-java-scala
build-java-scala:
	cd ./java_example && make build && cd ../scala_example && make build

.PHONY:run
run:
	cd ./java_example && make run
	cd ./scala_example && make run