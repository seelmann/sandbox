#!/bin/sh

docker run -it --rm -p 8888:8888 -v $(pwd):/home/jovyan/work -e NB_UID=$(id -u) -e NB_GID=$(id -g) jupyter/scipy-notebook

