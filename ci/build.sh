#!/bin/sh

set -e -x

chmod 777 /tmp
cd source-code
ls
pwd
./mvnw clean install 
cp source-code/target/*  build-output/.


