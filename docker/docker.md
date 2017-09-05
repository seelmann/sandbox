Docker
======

Build image

    docker build -t image-name .

Push image

    docker push image-name:tag

Run container interactive and remove

    docker run -it --rm image-name

Run container in background

    docker run -d image-name

Get container IP

    docker inspect --format '{{ .NetworkSettings.IPAddress }}' cid

Remove all exited containers

    docker rm $(docker ps -a -f status=exited -q)

Remove dangling images

    docker rmi $(docker images -f dangling=true -q)

Remove dangling volumes 

    docker volume rm $(docker volume ls -f dangling=true -q)


