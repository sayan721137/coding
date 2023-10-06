# How to install Oracle JDK (JDK - Java Development Kit)

Install guide for all operating systems from Oracle:
https://docs.oracle.com/en/java/javase/12/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A

## Windows
Follow the guide here:
https://docs.oracle.com/en/java/javase/12/install/installation-jdk-microsoft-windows-platforms.html

1. Downloading the JDK Installer
2. Running the JDK Installer
3. Installing the JDK Silently
4. Setting the PATH Environment Variable

## Mac 
Follow the guide here (for latest stable Java 12):
https://docs.oracle.com/en/java/javase/12/install/installation-jdk-macos.html

To install the JDK on macOS:
	1. Download the JDK .dmg file, jdk-12.interim.update.patch-macosx-x64.dmg.
Before the file can be downloaded, you must accept the license agreement.
	2. From either the browser Downloads window or from the file browser, double-click the .dmg file to start it.
A Finder window appears that contains an icon of an open box and the name of the .pkg file. 
	3. Double-click the JDK 12.pkg icon to start the installation application.
The installation application displays the Introduction window. 
	4. Click Continue. 
The Installation Type window appears. 
	5. Click Install. 
A window appears that displays the message: Installer is trying to install new software. Enter your password to allow this.
	6. Enter the Administrator user name and password and click Install Software.
The software is installed and a confirmation window is displayed.

## Linux 
Follow the guide here (for latest stable Java 12):
https://docs.oracle.com/en/java/javase/12/install/installation-jdk-linux-platforms.html

To install the 64-bit JDK on a Linux platform:
	1. Download the file, jdk-12.interim.update.patch_linux-x64_bin.tar.gz. 
Before you download a file, you must accept the license agreement. Anyone (not only by root users) can install the archive binary in any location having write access.
The .tar.gz archive file (also called a tarball) is a file that can be uncompressed and extracted in a single step. 
	2. Change the directory to the location where you want to install the JDK, then move the .tar.gz archive binary to the current directory. 
	3. Unpack the tarball and install the JDK: 
$ tar zxvf jdk-12.interim.update.patch_linux-x64_bin.tar.gz
The Java Development Kit files are installed in a directory called jdk-12.interim.update.patch. 
	4. Delete the .tar.gz file if you want to save disk space.
