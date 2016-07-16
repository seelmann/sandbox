Git
===

List merged branches:

    git branch --merged
    git branch -r --merged

List local branches:

    git branch

List remote branches:

    git branch -r

Fetch remote branches:

    git fetch origin

Checkout remote branch:

    git checkout -b test origin/test

Squash commits:

    git reset --soft HEAD~3
    git commit

List remote tags:

    git ls-remote --tags

Delete tag (remote and local):

    git push origin :tagname
    git tag -d tagname

