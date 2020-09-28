enum  Exam {
    RUS("русский"),ENG("английский"),MAT("математике"),INF("информатике"),
    PHY("физике"),GEO("географии"),HIM("химии");
    private String name;
    Exam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
