public class Abit {
    Exam e1;
    Exam e2;
    Exam e3;
    Exam e4;
    Faculty f;
    Balls balls1;
    Balls balls2;
    Balls balls3;
    Balls balls4;
    int id;



    public Abit(int id,Faculty f, Exam e3, Exam e4){
        this.f = f;
        this.id = id;
        this.e1 = Exam.RUS;
        this.e2 = Exam.MAT;
        this.e3 = e3;
        this.e4 = e4;
        this.balls1 = new Balls(Teacher.mark(e1));
        this.balls2 = new Balls(Teacher.mark(e2));
        this.balls3 = new Balls(Teacher.mark(e3));
        this.balls4 = new Balls(Teacher.mark(e4));
    }

    @Override
    public String toString() {

        return "Абитуриент в факультете с названием " + f.name + " получил: \n" + balls1.balls + " по русскому \n"
                + balls2.balls + " по математике \n" + balls3.balls + " по " + e3.getName() + "\n" + balls4.balls + " по "
                + e4.getName();
    }
}

