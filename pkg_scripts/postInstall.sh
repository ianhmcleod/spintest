#!/bin/bash

# create log folder
install  --mode=755 --directory /var/log/spintest

# start services
systemctl enable spintest.service
service spintest start


