Java on Mac OSX
===============


Print Java version:

    $ java -version
    java version "1.8.0_51"

Print Java home directory:

    $ /usr/libexec/java_home
    /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home

Print full JVM list:

    $ /usr/libexec/java_home -V
    Matching Java Virtual Machines (4):
        1.8.0_51, x86_64:   "Java SE 8"  /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home
        1.8.0_45, x86_64:   "Java SE 8"  /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
        1.6.0_65-b14-466.1, x86_64:      "Java SE 6"        /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
        1.6.0_65-b14-466.1, i386:        "Java SE 6"        /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home

    /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home

Print "old" Apple Java version:

    $ /System/Library/Frameworks/JavaVM.framework/Commands/java -version
    java version "1.6.0_65"

Path to `ApacheDirectoryStudio.ini`:

    /Applications/ApacheDirectoryStudio.app/Contents/ApacheDirectoryStudio.ini

Force JVM to use:

    ...
    -vm
    /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/bin/java
    -vmargs
    ...


