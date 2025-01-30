import java.util.*;

class Kov{
    public static LinkedList<String> a = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    public static int page = 0;

    public static void init() {
        a.add("Home Page");
        open();
    }

    public static void nextp() {
        if (a.size() <= 1 || page == a.size() - 1) {
            System.out.println("No next page");
        } else {
            page++;
            open();
        }
    }

    public static void prevp() {
        if (page == 0) {
            System.out.println("Already at Home Page");
        } else {
            page--;
            open();
        }
    }

    public static void search() {
        System.out.print("Search: ");
        sc.nextLine(); // Clear previous newline
        String s = sc.nextLine().trim(); // Read full-line input
        if (!s.isEmpty()) {
            a.add(s);
            page = a.size() - 1;
            open();
        } else {
            System.out.println("Search cannot be empty!");
        }
    }

    public static void open() {
        System.out.println("Opened: " + a.get(page));
    }

    public static void option() {
        while (true) {
            System.out.print("<- or -> or search or exit: ");
            String s = sc.next();
            if (s.equals("<-")) {
                prevp();
            } else if (s.equals("->")) {
                nextp();
            } else if (s.equals("search")) {
                search();
            } else if (s.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        init();
        option();
    }
}
