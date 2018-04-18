#!/bin/bash

# Update MSB config
sed -i "s|msbServiceUrl:.*|msbServiceUrl: http://$MSB_ADDR|" conf/console.yml
sed -i "s|serviceIp:.*|serviceIp: $SERVICE_IP|" conf/console.yml
cat conf/console.yml
