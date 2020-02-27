#!/usr/bin/env bash

echo 'installation started .............................'

cd ../src

oc apply -f 01-namespace.yaml
oc apply -f 02-deployment.yaml
oc apply -f 03-service.yaml
oc apply -f 04-route.yaml
# oc apply -f 05-service-monitor.yaml

echo 'installation completed .............................'
