# Point3D

The purpose of this repo is to demonstrate a component made 
using Git and VSCode as opposed to SVN and Eclipse. 

## Recommended Steps to Get Started

When starting your portfolio project, the following steps
should make your life a bit easier. 

### Step 1: Install Recommended Plugins

When you open VSCode with this project, you should get a 
notification in the bottom right corner that there are some
recommended extensions to install. Click install all. 
If you ignored this message or it never came up, feel free
to press CTRL+SHIFT+P and type "Show Recommended Extensions".
Install all of the extensions listed.

### Step 2: Install the Latest JDK

If you do not have an available JDK on your system, you
may be prompted to install one by VSCode. The default
seems to be Red Hat's OpenJDK, which seems to require
you to register for an account or to install on the
command line. Regardless, there is no mac support.
As a result, I would just recommend installing the
latest JDK [directly from Oracle's site][jdk-downloads].

### Step 3: Add Key Libraries to Project

As you are probably all aware at this point, you
need the components jar to get anything running.
My advice is to [download it from here][components-jar]. 
Then, drop it into the `lib` folder in the project.
Git automatically ignores anything you put here by
default, so don't worry about committing it to
version control. 

Similarly, you will need the testing APIs (e.g., JUnit).
Perhaps the easiest way to include them in your project
is to click the beaker symbol in the left sidebar; it's
right below the extensions button which looks like four
squares. From there, you can click "Enable Java Tests"
and then click "JUnit" from the dropdown. That's it!
You should now see the two JUnit libraries in the lib
folder. 

[components-jar]: http://web.cse.ohio-state.edu/software/common/components.jar
[jdk-downloads]: https://www.oracle.com/java/technologies/downloads/
