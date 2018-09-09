#!/usr/bin/env bash

nohup ./bin/kafka-server-start ./etc/kafka/server.properties > /dev/null 2>&1 &

# if hostname = gz-test471-vm02 启动 Schema Registry

if [[ `hostname` == "gz-test471-vm02" ]] ;then
        nohup ./bin/schema-registry-start ./etc/schema-registry/schema-registry.properties > /dev/null 2>&1 &
fi;


if [[ `hostname` == "gz-test474-vm02" ]] ;then
        nohup ./bin/kafka-rest-start ./etc/kafka-rest/kafka-rest.properties > /dev/null 2>&1 &


fi;