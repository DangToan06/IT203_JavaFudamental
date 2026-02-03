public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        setScore(score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10){
            System.err.println("Điểm không hợp lệ !!!");
            this.score = 0.0;
        }else {
            this.score = score;
        }
    }

    public String getRank(){
        if(score >= 8.0){
            return "Gioi";
        } else if (score > 6.5) {
            return "Kha";
        }else {
            return "TB";
        }
    }

    @Override
    public String toString(){
        return "User[ID= " + id + ", Name student= '" + name + "Score= " + score + "']\n";
    }
}
