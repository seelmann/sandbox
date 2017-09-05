Rsync
=====

Rsync with sudo on both sides:

    sudo -E -s rsync -avz --delete --rsync-path="sudo rsync" user@remote:/path/ /path/

