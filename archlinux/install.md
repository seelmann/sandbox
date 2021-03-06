Arch Linux Installation
=======================

```
fdisk /dev/sda
n p 1 2048 +256M
n p 2 526336 rest
t 2 8e
w

shred -v -n 1 /dev/sda2

cryptsetup luksFormat /dev/sda2
cryptsetup -y -c aes-xts-plain64 -s 512 luksFormat /dev/sda2
cryptsetup open --type luks /dev/sda2 crypt01

pvcreate /dev/mapper/crypt01
vgcreate vg01 /dev/mapper/crypt01
lvcreate -L 20GB -n root vg01
lvcreate -L 80GB -n home vg01
lvcreate -L 8GB -n swap vg01

mkfs.ext4 /dev/sda1
mkfs.ext4 /dev/mapper/vg01-root
mkfs.ext4 /dev/mapper/vg01-home
mkswap /dev/mapper/vg01-swap

mount /dev/mapper/vg01-root /mnt
mkdir /mnt/boot
mount /dev/sda1 /mnt/boot
mkdir /mnt/home
mount /dev/mapper/vg01-home /mnt/home
swapon /dev/mapper/vg01-swap

vi /etc/pacman.d/mirrorlist
hs-esslingen, rwth-aachen
rub, fau
hosteurope, 23media

pacstrap /mnt base

genfstab -p /mnt >> /mnt/etc/fstab

arch-chroot /mnt

echo computer_name > /etc/hostname
ln -s /usr/share/zoneinfo/Europe/Berlin /etc/localtime
echo LANG="en_US.UTF-8" > /etc/locale.conf
vi /etc/locale.gen # de_DE*, en_US*
locale-gen

vi /etc/vconsole.conf
KEYMAP="us"
CONSOLEFONT=
CONSOLEMAP=

vi /etc/mkinitcpio.conf
HOOKS="base udev autodetect modconf block keymap encrypt lvm2 resume filesystems keyboard fsck"
mkinitcpio -p linux

passwd # root

pacman -S grub
vi /etc/default/grub
GRUB_CMDLINE_LINUX="cryptdevice=/dev/sda2:crypt01 resume=/dev/mapper/vg01-swap"
grub-mkconfig -o /boot/grub/grub.cfg
grub-install /dev/sda

exit
umount /mnt/home
umount /mnt/boot
umount /mnt
reboot

ip link
dhcpcd enp4s0

pacman -S zsh sudo
visudo
%wheel ALL=(ALL) ALL

useradd -m -g users -s /usr/bin/bash user
gpasswd -a user wheel audio video games power lp scanner optical storage vboxusers docker whireshark
passwd user

pacman -S xorg-server xorg-xinit xorg-utils xorg-server-utils
lspci |grep VGA
pacman -S xf86-video-intel xf86-input-evdev xf86-input-synaptics
pacman -S ttf-dejavu

pacman -S xfce4 xfce4-goodies human-icon-theme slim
vi /home/user/.xinitrc
#!/bin/sh
exec startxfce4
chmod +x /home/user/.xinitrc

systemctl enable slim
reboot
```


