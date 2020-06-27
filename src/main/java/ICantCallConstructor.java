public class ICantCallConstructor {
    private String something;
    private Integer someoneForgotAboutMe;

    private ICantCallConstructor() {
        this.something = "hello!";
    }

    public String getSomething() {
        return something;
    }
}
