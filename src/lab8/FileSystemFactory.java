package lab8;
/**
 * Factory class.
 * Creating clones of file system components.
 */
public class FileSystemFactory {
    /**
     * The prototype object from which clones will be created.
     */
    private final FileSystemComponent prototype;
    /**
     * Constructor: Initializes the factory with a specific prototype.
     * @param prototype the prototype object that will serve as the basis for creating clones.
     */
    public FileSystemFactory(FileSystemComponent prototype) {
        this.prototype = prototype;
    }
    /**
     * Clones the prototype object with a specified depth.
     * @return a new instance of {@link FileSystemComponent}, cloned from the prototype.
     */
    public FileSystemComponent cloneComponent(int depth) {
        return prototype.clone(depth);
    }
}