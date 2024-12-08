package lab8;
/**
 * Prototype Interface.
 * <p>
 * This interface defines the common contract for file system components
 * (files and directories). It serves as the base for implementing
 * the Prototype design pattern.
 * </p>
 */
public interface FileSystemComponent {
    /**
     * Retrieves the name of the file system component.
     * @return The name of the component (file name or directory name).
     */
    String getName();
    /**
     * Displays the structure of the file system component for checking.
     * @param indent A string used for formatting indentation during recursive display.
     */
    void display(String indent);
    /**
     * A method that clones the file system component with a specified depth.
     */
    FileSystemComponent clone(int depth);
}
