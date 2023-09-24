public enum HeroType {
    TANK("Tank"), HEALER("Healer"), ASSASSIN("Assassin");

    private final String name;
    HeroType(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
