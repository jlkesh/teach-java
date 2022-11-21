package uz.jl.teach.enums;

public enum Priority {

    HIGH("\uD83D\uDFE5"),
    MEDIUM("\uD83D\uDFE7"),
    LOW("\uD83D\uDFE9");
    private final String emoji;

    Priority(String colorEmoji) {
        this.emoji = colorEmoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
