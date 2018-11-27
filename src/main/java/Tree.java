import Objects.Family;

public class Tree {
    public static void main(String[] args) {
        Family myFamily = new Family("./src/main/resources/familyList.json");
        myFamily.printAsIs();
        myFamily.printSorted();
    }
}
