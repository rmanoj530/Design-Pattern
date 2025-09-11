package deepVSshallowcopy;

public class Exam {
    private int id;
    private int score;

    ReattemptExam  reattemptExam;

    public Exam() {}

    public Exam(Exam s) {
        this.id = s.id;
        this.score = s.score;
        //deep copy
        this.reattemptExam = new ReattemptExam(s.reattemptExam);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
