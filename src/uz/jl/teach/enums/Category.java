package uz.jl.teach.enums;

public enum Category {
    STUDY("\uD83D\uDCD6"),
    ENTERTAINMENT("\uD83D\uDCFD"),
    WORK("\uD83D\uDCBC"),
    DEFAULT("\uD83D\uDCDD");
    private final String emoji;

    Category(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
