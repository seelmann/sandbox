Nix
===

The purely functional package manager.

* Nix store: `/nix/store`
* Multiple versions
* Atomic upgrades and rollbacks
* Managing build and development environments
* Portable: Linux (Debian, Ubuntu, ...),  MacOS
* GC

Also

* Nix (the language)
* NixOS
* NixOps

Nix Package Manager
-------------------

### Install

    curl https://nixos.org/nix/install | sh

Creates `/nix` and `~/.nix-profile` and adds itself to `~/.bash_profile`.
By default uses single-user mode and unstable channel.

### Activate

    source ~/.nix-profile/etc/profile.d/nix.sh

Or logout/login.

Overrides your `$PATH`.

### Package management

Query

    nix-env -qa
    nix-env -qa python3

Install

    nix-env -i hello

Generations, Rollback, GC

    nix-env --list-generations
    nix-env --rollback
    nix-collect-garbage -d

### Profiles

Default profile

    ~/.nix-profile -> /nix/var/nix/profiles/default

### 

Nix Shell
---------

    $ cat default.nix                          
    with import <nixpkgs> {};
    stdenv.mkDerivation rec {
      name = "project-with-python3";
      env = buildEnv { name = name; paths = buildInputs; };
      buildInputs = [
        python36
      ];
    }
    
    $ nix-shell

