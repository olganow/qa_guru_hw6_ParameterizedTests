public enum Locale {

    US ("English (US)"),
    RU ("Русский"),
    IT ("Italiano"),
    DE ("Deutsch")
    ;
    private final String desc;
    Locale(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

}
