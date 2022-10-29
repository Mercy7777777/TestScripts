#!/bin/bash
RANDOOP_JAR=
# RANDOOP_JAR to refer to the location of randoop-all-4.3.1.jar within the unzipped archive.

if [ ! $RANDOOP_JAR ]; then
 echo "[Error] Please initialize RANDOOP_JAR."
 exit

test_classes=(
    #put classes here
)

if [ ! $test_classes ]; then
 echo "[Error] Please initialize test_classes."
 exit

total_time=0

touch output.txt
touch total_time.txt

for class in ${test_classes[@]}
do
  tmp=(${class//./ })
  echo "Begin generate tests for $class"
  START_TIME=$(date +%s)
  echo "Begin generate tests for $class, start time: $START_TIME" >> output.txt
  java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --testclass=$class --junit-package-name ${tmp[3]}
  END_TIME=$(date +%s)
  echo "$class end time: $END_TIME"
  echo "$class end time: $END_TIME" >> output.txt
  EXECUTING_TIME=`expr $END_TIME - $START_TIME`
  echo "$class runtime: $EXECUTING_TIME (seconds)"
  echo "$class runtime: $EXECUTING_TIME (seconds)" >> output.txt
  total_time=$((${total_time} + $EXECUTING_TIME))
  echo "total time: $total_time"
  echo "total time: $total_time" >> output.txt
  echo "" >> output.txt
done

echo "total time: $total_time" > total_time.txt