Eclipse on Linux
================

Eclipse/SWT has issues with GTK 3, use GTK 2 instead

    #!/bin/sh
    export SWT_GTK3=0
    ./eclipse

