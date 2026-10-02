# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java

- I gather that the program starts its execution in the App class in its main method, where the arguments specified in the command line are processed. 

- Thus, I need to instantiate TruffulaOptions using these arguments, instantiate TruffulaPrinter with the options, and then invoke its printTree() function. 

- This ensures that the configuration is linked to the printer. At the moment, the main method is void, and I will fill this in later in Wave 3 of my project.
## ConsoleColor.java

- I comprehend that ConsoleColor holds the selection of colors applied to the printing process. This is a type of enum, which indicates that this type of variable has a limited amount of possible values.

- Every color contains its own unique code through which you can adjust the color of your text in the terminal window. RESET code restores the text color to its original form.

- Methods getCode() and toString() return the code values mentioned above. The program is already implemented, therefore, I will not change anything in it myself.

## ColorPrinter.java / ColorPrinterTest.java

- I believe ColorPrinter shows messages in the color you chose.White is the default, unless otherwise specified.

- I need to implement print(String message, boolean reset)It should print the color code and message, then only add RESET if reset is true.

- The test captures the output and looks for red text, a newline and RESET.I will try other colors and reset options also.

## TruffulaOptions.java / TruffulaOptionsTest.java

- My understanding of the functionality of TruffulaOptions is that it saves the folder path and settings. The constructor needs to get the details and the path has to be passed last.

- Using the -h will include hidden files and -nc will turn off colors. I want to make sure the path is a valid existing folder.

- The test is designed to check for the existence of a valid folder with both options.I also need to add more tests for other invalid arguments and defaults.

## TruffulaPrinter.java / TruffulaPrinterTest.java
- I think TruffulaPrinter uses Options and ColorPrinter to print the directory tree.

 - In Wave 4 there should be a recursive helper method, the printing of three spaces for each level of folders, and a slash after all folders printed. I have to use out.println() and java.io.

- The test also checks colors, hidden files, and sorting.However, I want to simplify the tests for Wave 4 because these features are implemented in the later waves of the project.


## AlphabeticalFileSorter.java


Wave 0: Understand..... 

As far as I understand, I will know about the project files and how classes interact. There are several types of classes, each being responsible for something different, so I researched classes and objects. Class is a description of what an object can own or what it can perform. I have to take notes for each file, keep my inquiries about the project and record my notes while learning the project.