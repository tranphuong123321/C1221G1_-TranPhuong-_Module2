package bai14.bai_tap.colection_review.models;

import java.util.Objects;

public class Rank {
    private final String rankName;

    public Rank(String rankName) {
        this.rankName = rankName;
    }

    public String getRankName() {
        return rankName;
    }

    @Override
    public String toString() {
        return rankName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank = (Rank) o;
        return rankName.equals(rank.rankName);
    }

    @Override
    public int hashCode() {
        return 12;
    }
}