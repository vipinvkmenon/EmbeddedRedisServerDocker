#!/bin/sh

set -e -x


uname -a
chmod 777 /tmp
mkdir /tmp/redisServer
chmod 777 /tmp/redisServer

cd source-code
cp ci/RedisServer/* /tmp/redisServer
chmod 777 /tmp/redisServer/*
ls
pwd
./mvnw clean install 
cp source-code/target/*  build-output/.


