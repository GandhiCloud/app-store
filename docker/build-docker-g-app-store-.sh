#!/usr/bin/env bash

echo "docker Started ...."

cd ..

docker build -f docker/Dockerfile -t gandhicloud/g-app-store .
#docker login -u gandhicloud
docker push gandhicloud/g-app-store:latest

echo "docker completed ...."