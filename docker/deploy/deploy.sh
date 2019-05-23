#!/bin/sh

nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://127.0.0.1:2375 --storage-driver=overlay&
timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"

git clone https://github.com/fuckis/project.git

cd project

mvn clean
mvn install -P test