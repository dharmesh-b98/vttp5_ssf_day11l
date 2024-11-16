# Maven Compiler Command

#run with commandline arguements
mvn spring-boot:run -Dspring-boot.run.arguments="--port=2020" 


## In project root folder
mvn compile

mvn package

mvn spring-boot:run

## clean
mvnw.cmd clean

## package the compiled bytecode classes into jar/war file
mvnw.cmd package

## delete target, redownoad dependencies, recompile to class files, package to jar/war
mvnw.cmd clean package

## run the application in embedded localhost server
mvnw.cmd spring-boot:run

mvn spring-boot:run -Dspring-boot.run.arguments="--port=5000 --file="file.txt""

"# vttp5_ssf_day11l" 