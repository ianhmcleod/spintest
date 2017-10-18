#!/bin/bash

# create log folder
install  --mode=755 --directory /var/log/spintest

chown ubuntu:ubuntu /opt/spintest/spintest-0.0.1-SNAPSHOT.jar

# start services
systemctl enable spintest.service
service spintest start


