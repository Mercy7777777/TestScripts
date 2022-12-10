#!/bin/bash
jpf_path=
# RANDOOP_JAR to refer to the location of randoop-all-4.3.1.jar within the unzipped archive.

if [ ! $RANDOOP_JAR ]; then
 echo "[Error] Please initialize jpf_path."
 exit


test_classes=(
    #put classes here
)

if [ ! $test_classes ]; then
 echo "[Error] Please initialize test_classes."
 exit

total_time=0

classpath={path-to-classes}
# define classpath

for class in ${test_classes[@]}
do
  tmp=(${class//./ })
  echo "Begin generate tests for $class"
  START_TIME=$(date +%s)
  echo "Begin generate tests for $class, start time: $START_TIME" >> jpf_log.txt
  java -Xmx1024m -ea -jar $jpf_path +classpath=$classpath $class >> jpf.txt
  END_TIME=$(date +%s)
  echo "$class end time: $END_TIME"
  echo "$class end time: $END_TIME" >> jpf_log.txt
  EXECUTING_TIME=`expr $END_TIME - $START_TIME`
  echo "$class runtime: $EXECUTING_TIME (seconds)"
  echo "$class runtime: $EXECUTING_TIME (seconds)" >> jpf_log.txt
  total_time=$((${total_time} + $EXECUTING_TIME))
  echo "total time: $total_time"
  echo "total time: $total_time" >> jpf_log.txt
  echo "" >> jpf_log.txt
done
