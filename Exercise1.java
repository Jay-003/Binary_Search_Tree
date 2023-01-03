import java.util.Scanner;

//This class creates a binary search tree using
// user inputs and calculates the maximum, minimum element in the tree and
// also searches for an element asked by the user.
public class Exercise1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //creating a binary search tree object.
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();

        //prompting user to input an int or 0 to exit.
        System.out.print("Enter int or '0': ");
        int input = kb.nextInt();

        while (input!=0) {
            //inserting the input in the tree according to their value.
            searchTree.insert(input);
            System.out.print("Enter int or '0': ");
            input = kb.nextInt();
        }

        //output area.
        System.out.print("The max data value in the BST is: ");
        System.out.print(searchTree.findMax());
        System.out.println();
        System.out.print("The min data value in the BST is: ");
        System.out.print(searchTree.findMin());
        System.out.println();
        System.out.print("What key would you like to search for? ");
        int key = kb.nextInt();
        //printing found if the key is present in the tree, not found otherwise.
        if(searchTree.recursiveSearch(key) != null) {
            System.out.println("Found!");
        }
        else {
            System.out.println("Not Found!");
        }

    }
}
