#!/bin/bash

# Update MSB config
sed -i "s|msbServiceUrl:.*|msbServiceUrl: http://$MSB_ADDR|" conf/console.yml
sed -i "s|serviceIp:.*|serviceIp: http://$SERVICE_IP|" conf/console.yml
cat conf/console.yml
