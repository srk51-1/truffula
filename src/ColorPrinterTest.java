import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
void testWithoutReset() {
  
  // Capture output
  ByteArrayOutputStream output = new ByteArrayOutputStream();
  ColorPrinter printer = new ColorPrinter(new PrintStream(output));

  printer.setCurrentColor(ConsoleColor.BLUE);
  printer.print("Hello", false);

  assertEquals(ConsoleColor.BLUE + "Hello", output.toString());
}

@Test
void testDefaultWhite() {

  // Check default color
  ByteArrayOutputStream output = new ByteArrayOutputStream();
  ColorPrinter printer = new ColorPrinter(new PrintStream(output));

  printer.print("Hi");

  String expected = ConsoleColor.WHITE + "Hi" + ConsoleColor.RESET;
  assertEquals(expected, output.toString());
}

}
