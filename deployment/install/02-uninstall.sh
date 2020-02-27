#!/usr/bin/env bash

echo 'installation started .............................'

cd ../src

oc delete -f 05-service-monitor.yaml
oc delete -f 04-route.yaml
oc delete -f 03-service.yaml
oc delete -f 02-deployment.yaml
oc delete -f 01-namespace.yaml

echo 'installation completed .............................'
