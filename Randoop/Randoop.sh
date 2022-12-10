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


class_path=../../../target/classes:$RANDOOP_JAR

true > output.txt
true > process.txt
true > time.txt


echo $class_path
for class in ${test_classes[@]}
do
  tmp=(${class//./ })
  echo $(date +%Y-%m-%d" "%H:%M:%S)
  echo "Begin generate tests for $class"
  START_TIME=$(date +%s)
  echo "Begin generate tests for $class, start time: $START_TIME" >> output.txt
  package_name=""
  for(( i=0;i<${#tmp[@]}-2;i++)) do
    package_name+=${tmp[i]}"."
  done;
  class_name=${tmp[${#tmp[@]}-1]}
  package_name+=${tmp[${#tmp[@]}-2]}
  regression_test_name=$class_name"RegressionTest"
  error_test_name=$class_name"ErrorTest"
  echo "package_name:$package_name"
  echo "Begin generate tests for:" >> process.txt
  echo "$class" >> process.txt
  java -classpath $class_path randoop.main.Main gentests --testclass=$class --junit-package-name $package_name --regression-test-basename $regression_test_name --error-test-basename $error_test_name --time-limit=30 --usethreads=true>> process.txt
  END_TIME=$(date +%s)
  echo "$class end time: $END_TIME"
  echo "$class end time: $END_TIME" >> output.txt
  EXECUTING_TIME=`expr $END_TIME - $START_TIME`
  echo "$class runtime: $EXECUTING_TIME (seconds)"
  echo "$class runtime: $EXECUTING_TIME (seconds)" >> output.txt
  total_time=$((${total_time} + $EXECUTING_TIME))
  echo "total time: $total_time"
  echo "total time: $total_time" >> output.txt
  echo "$class,$EXECUTING_TIME" >> time.csv
  echo "" >> output.txt
  echo
done