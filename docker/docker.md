Docker
======

Remove all exited containers

    docker rm $(docker ps -a -f status=exited -q)

Remove dangling images

    docker rmi $(docker images -f dangling=true -q)

Remove dangling volumes 

    docker volume rm $(docker volume ls -f dangling=true -q)


