package Assignment3_2;

enum Singleton {
    INSTANCE;

    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return this.input;
    }
}
