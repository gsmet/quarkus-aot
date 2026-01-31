package fr.spacefox.perftests.quarkus.data.entity971;

import fr.spacefox.perftests.quarkus.core.service971.model.Model971;

final class Mapper {
    private Mapper() {}

    public static Model971 of(Entity971 entity) {
        return new Model971(entity.getId(), entity.getField());
    }
}
