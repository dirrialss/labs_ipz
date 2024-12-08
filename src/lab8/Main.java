package lab8;

/**
 * Client.
 * It demonstrates the creation of a hierarchical file system consisting of directories and files,
 * cloning it with varying depth levels, and displaying the original and cloned structures.
 * @author Siukalo Diana
 */
public class Main {
    /**
     * The main method demonstrates the creation of a file system, cloning it with
     * different depths, and displaying both the original and cloned structures.
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        Directory General = new Directory("General");
        File text1 = new File("text1.txt", "something1",354);
        File text2 = new File("text2.txt", "something2",144);
        Directory Documents = new Directory("Documents");
        File text3 = new File("text3.txt", "something3",101);
        Directory Images = new Directory("Images");
        File myphoto = new File("myphoto.png", "Photo",130);
        Documents.add(text3);
        General.add(text1);
        General.add(text2);
        General.add(Images);
        General.add(Documents);
        Images.add(myphoto);
        System.out.println("__--__-- Initial File System __--__--");
        General.display("");
        FileSystemFactory factory = new FileSystemFactory(General);
        Directory clonedDepth1 = (Directory) factory.cloneComponent(1);
        System.out.println("\n__--__--Cloned File System (Depth 1)__--__--");
        File clonedFile1 = (File) clonedDepth1.getComponents().get(0);
        clonedFile1.setContent("CHANGES in this file");
        clonedDepth1.display("");
        Directory clonedDepth2 = (Directory) factory.cloneComponent(2);
        System.out.println("\n__--__--Cloned File System (Depth 2)__--__--");
        clonedDepth2.display("");
        System.out.println("\n__--__--Original File System for сhecking__--__--");
        General.display("");
    }
}