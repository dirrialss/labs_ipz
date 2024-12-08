package lab8;
/**
 * Concrete Prototype.
 * <p>
 * Represents a file in the file system. Implements the `FileSystemComponent` interface,
 * allowing it to be part of a composite structure and support cloning as part of the
 * Prototype design pattern.
 * </p>
 */
public class File implements FileSystemComponent {
    /** Field: the name of the file.
     */
    private final String name;
    /** Field: the content of the file.
     */
    private String content;
    /** Field: the size of the file in bytes.
     */
    private final int size;
    /**
     * Constructor that initializes a new file with the specified name, content, and size.
     * @param name    The name of the file.
     * @param content The content of the file.
     * @param size    The size of the file in bytes.
     */
    public File(String name, String content,int size) {
        this.name = name;
        this.content = content;
        this.size = size;
    }
    /**
     * Method that retrieves the name of the file.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Method that retrieves the content of the file.
     */
    public String getContent() {
        return content;
    }
    /**
     * A void that updates the content of the file.
     * @param content A string representing the new content of the file.
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * Displays the file's details, including its name, content, and size.
     * This method is used as part of the composite structure to recursively
     * display the file system.
     * @param indent A string used for formatting the display with indentation.
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name + " [Content: " + content + "]...........size: " + size + " bytes");
    }
    /**
     * Creates a copy of the file. As files do not have children, the depth parameter
     * does not affect the cloning process.
     * @param depth An integer representing the depth of cloning (ignored for files).
     * @return A new `File` object with the same name, content, and size as the original.
     */
    @Override
    public FileSystemComponent clone(int depth) {
        return new File(name, content, size); // Копіюємо заданий розмір файлу
    }
}
