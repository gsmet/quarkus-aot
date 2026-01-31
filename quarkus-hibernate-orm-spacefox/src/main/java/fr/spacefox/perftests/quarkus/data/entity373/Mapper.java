package fr.spacefox.perftests.quarkus.data.entity373;

import fr.spacefox.perftests.quarkus.core.service373.model.Model373;

final class Mapper {
    private Mapper() {}

    public static Model373 of(Entity373 entity) {
        return new Model373(entity.getId(), entity.getField());
    }
}
