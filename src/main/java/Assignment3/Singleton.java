package Assignment3;

enum Singleton {
    INSTANCE;

    private String statement;

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return this.statement;
    }
}
