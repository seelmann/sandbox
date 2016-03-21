ASF Release Verification
========================

### Download packages

    sftp seelmann@home.apache.org
    get /home/smckinney/public_html/fortress*1.0-RC42*/fortres*1.0-RC42* .

### Verify checksums and signatures

    for file in *.md5; do cat $file; md5sum `basename $file .md5`; echo; done
    for file in *.sha1; do cat $file; sha1sum `basename $file .sha1`; echo; done
    for file in *.asc; do gpg -v $file; done

