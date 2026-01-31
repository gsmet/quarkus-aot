package fr.spacefox.perftests.quarkus.data.entity766;

import fr.spacefox.perftests.quarkus.core.service766.model.Model766;

final class Mapper {
    private Mapper() {}

    public static Model766 of(Entity766 entity) {
        return new Model766(entity.getId(), entity.getField());
    }
}
