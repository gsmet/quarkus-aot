package fr.spacefox.perftests.quarkus.data.entity157;

import fr.spacefox.perftests.quarkus.core.service157.model.Model157;

final class Mapper {
    private Mapper() {}

    public static Model157 of(Entity157 entity) {
        return new Model157(entity.getId(), entity.getField());
    }
}
