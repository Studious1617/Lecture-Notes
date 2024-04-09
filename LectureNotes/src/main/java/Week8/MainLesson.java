package Week8;

public class MainLesson {
    public static void main(String[] args) {



        /*Graphical User Interface (GUI) Programming
• Event Driven
• Program presents user with GUI (pronounced
gooey)
• User can interact with any enabled feature of
the GUI
• Program should respond appropriately
• User clicking a button, or typing, or selecting an
item from a list etc... are events
• So, event driven programming*/

        /*Overview of GUI Programming
• Think about your GUI design - what components will it need?
• Create your GUI from GUI components – frames, buttons,
lists, labels, layout managers...
• Decide which component does what
    – For example, you may want something to happen when user clicks
a button,
    – and something else to happen when selecting an item from a list,
    – And something else when user checks a checkbox
• Write an Event Handler method for each event – so in this
example you'll write 3 event handler methods, one for each
of the 3 events – clicking a button, selecting item from a list,
checking a checkbox*/

        /*The state of GUI programming in Java
• AWT: Original Java GUI toolkit, in Java 1 and up. Basic components.
• Swing: extended, more sophisticated version of AWT, Java 2 and up.
• JavaFX: designed to replace Swing, only works with Java 8; separate library
to the standard JDK; lots of features and customization although more
complexity, never became as popular as Swing because...
• Web and Mobile: today, desktop apps are a relatively small market
    – Java web apps are HUGE - eBay, Amazon, Netflix, Google, Twitter....
    – Android development
• We'll use Swing in this class: it's still being used, there's a lot more
documentation and resources than JavaFX
• Web and Android apps are very interesting, but they have a lot of parts - we don't have time to cover all the concepts
• IntelliJ is built in Swing!*/



        /*More components and events
• JCheckBox and JSlider
• Slider changed event listener
• Checkbox checked/unchecked listener
• Detecting text typed into JTextField*/



        /*GUI design...
• Not as sophisticated as Visual Studio or Xcode
• Java tries to be as generic as possible - the same code can run on
Windows, Mac, Unix, Linux.... All deal with GUIs very differently
    – Visual Studio is solving one problem for one platform
• Try not to stress too much if you don't like the look of your GUI
• Don't spend too much time on making your GUI perfect
• Focus on building a logically laid out GUI; and correct code
• You can always change what an application looks like, without
breaking any of the logic underneath
• The positions and colors and style of the components is
independent of your application's logic
• Real world: common to use 3rd-party GUI toolkits, look-and feel
and themes to make your app look good*/
    }
}
