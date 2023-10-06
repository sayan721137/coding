
# How to install Java OpenJDK (OpenJDK Open Java Development Kit)

##Universal download page:
http://jdk.java.net/12/

## OpenJDK (Oracle binaries) Windows guide:
Following the guides here:
https://stackoverflow.com/questions/52511778/how-to-install-openjdk-11-on-windows

Steps to install:  
1. Download JavaOpenJDK installation zip archive for Windows from here:  
	https://jdk.java.net/12/  
2. Extract the zip file into a folder, e.g. C:\Program Files\Java\ and it will create a jdk-12 folder (where the bin folder is a direct sub-folder). You may need Administrator privileges to extract the zip file to this location.  
3. Set a PATH:  
	○ Select Control Panel and then System.  
	○ Click Advanced and then Environment Variables.  
	○ Add the location of the bin folder of the JDK installation to the PATH variable in System Variables.  
	○ The following is a typical value for the PATH variable: C:\WINDOWS\system32;C:\WINDOWS;"C:\Program Files\Java\jdk-11\bin"  
4. Set JAVA_HOME:  
	○ Under System Variables, click New.  
	○ Enter the variable name as JAVA_HOME.  
	○ Enter the variable value as the installation path of the JDK (without the bin sub-folder).  
	○ Click OK.  
	○ Click Apply Changes.    
5. (Optional) Configure the JDK in your IDE (e.g. IntelliJ or Eclipse or MSCode).   
You are set.   
To see if it worked, open up the Command Prompt and type java -version and see if it prints your newly installed JDK.  
If you want to uninstall - just undo the above steps.  
6. (Optional) You can also point JAVA_HOME to the folder of your JDK installations and then set the PATHvariable to %JAVA_HOME%\bin. So when you want to change the JDK you change only the JAVA_HOMEvariable and leave PATH as it is.  


## OpenJDK For Mac
Following the guide from:
https://solarianprogrammer.com/2018/09/28/installing-openjdk-macos

Download from here:
	https://jdk.java.net/12/
Start by getting OpenJDK, chose the latest stable for macOS version, currently openjdk-12.0.1. 
Copy and save the JDK name (which contains the version and OS name, something like this: openjdk-12.0.1_osx-x64_bin)
Extract the archive by double clicking on the file or, assuming it is in your Downloads folder, write this in your Terminal:
Note replace "openjdk-12.0.1_osx-x64_bin" with the name you copied above
1 cd ~/Downloads
2 tar xf openjdk-12.0.1_osx-x64_bin.tar.gz
Next step, is to move the extracted folder to a place where macOS searches for Java JDK:
1 sudo mv jdk-12.0.1.jdk /Library/Java/JavaVirtualMachines/
Now, check if you’ve successfully installed the JDK with:
1 java -version
2 javac -version
This is what I see on my machine:
1 ~ $ java -version
2 openjdk version "12.0.1" 2019-04-16
3 OpenJDK Runtime Environment (build 12.0.1+12)
4 OpenJDK 64-Bit Server VM (build 12.0.1+12, mixed mode, sharing)
5 ~ $ javac -version
6 javac 12.0.1
7 ~ $

## OpenJDK For Linux

Following the guide here:
https://openjdk.java.net/install/

Debian, Ubuntu, etc.
On the command line, type:
	$ sudo apt-get install openjdk-7-jre
The openjdk-7-jre package contains just the Java Runtime Environment. If you want to develop Java programs then install the openjdk-7-jdk package.
Fedora, Oracle Linux, Red Hat Enterprise Linux, etc.
On the command line, type:
	$ su -c "yum install java-1.7.0-openjdk"
The java-1.7.0-openjdk package contains just the Java Runtime Environment. If you want to develop Java programs then install the java-1.7.0-openjdk-devel package.
