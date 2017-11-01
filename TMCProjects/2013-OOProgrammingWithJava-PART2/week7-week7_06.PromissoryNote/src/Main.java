public class Main {
    public static void main(String[] args) {
        // Test your program here

        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.55);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebt("arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("mikael"));
        System.out.println(mattisNote.howMuchIsTheDebt("aman"));
    }
}
