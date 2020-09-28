public class Main {
    public static void main(String[] args) {
        Faculty f = new Faculty("факультет");
        Abit a = new Abit(01,f,Exam.INF,Exam.PHY);
        System.out.println(a);
    }
}
