package lecture.section01.enumtype;

public enum subjects {

    //사용하고 싶은 필드를 작성하는데 대문자로 작성한다.
    JAVA,
    ///
    MYSQL,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;

    @Override
    public String toString() {
        return "=====" +  this.name() + "====";
    }


}
