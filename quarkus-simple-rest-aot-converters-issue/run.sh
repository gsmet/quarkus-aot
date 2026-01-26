#!/bin/sh

echo "############ TEST !"

echo $$ > pidfile
exec "$@"
