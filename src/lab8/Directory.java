package lab8;

import java.util.ArrayList;
import java.util.List;
/**
 * Concrete Prototype.
 * <p>
 * Represents a directory (folder) in the file system. Implements the `FileSystemComponent` interface,
 * allowing it to be part of a composite structure and support cloning as part of the Prototype design pattern.
 * </p>
 */
public class Directory implements FileSystemComponent {
    /**
     *  The name of the directory.
     */
    private final String name;
    /**
     * A list of child components (files and/or directories) contained within this directory.
     */
    final List<FileSystemComponent> children = new ArrayList<>();
    /**
     * Constructor that initializes a new directory with the specified name.
     * @param name The name of the directory.
     */
    public Directory(String name) {
        this.name = name;
    }
    /**
     * Adds a child component (file or directory) to this directory.
     * @param component The `FileSystemComponent` to be added as a child.
     */
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    /**
     * Removes a child component (file or directory) from this directory.
     * @param component The `FileSystemComponent` to be removed.
     */
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    /**
     * Retrieves the name of the directory.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Displays the directory's details, including its name and all child components.
     * This method is used as part of the composite structure to recursively display the file system.
     * @param indent A string used for formatting the display with indentation.
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }
    /**
     * Retrieves the list of child components contained in this directory.
     * @return A list of `FileSystemComponent` objects representing the child components.
     */
    public List<FileSystemComponent> getComponents() {
        return children;
    }
    /**
     * Creates a copy of the directory. The depth parameter determines how many levels of children to clone.
     * @param depth An integer representing the depth of cloning (0 for shallow copy, >0 for deep copy).
     * @return A new `Directory` object with cloned child components up to the specified depth.
     */
    @Override
    public FileSystemComponent clone(int depth) {
        Directory clonedDirectory = new Directory(name);
        if (depth > 0) {
            for (FileSystemComponent child : children) {
                clonedDirectory.add(child.clone(depth - 1));
            }
        }
        return clonedDirectory;
    }
}
