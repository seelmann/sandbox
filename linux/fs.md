Filesystem
==========


## tmpfs

### Permanently

In `/tmp/fstab`:

    tmpfs                /tmp            tmpfs   nodev,nosuid    0       0

### Ad-hoc

    mount -t tmpfs -o size=4g tmpfs /mnt/tmpfs

