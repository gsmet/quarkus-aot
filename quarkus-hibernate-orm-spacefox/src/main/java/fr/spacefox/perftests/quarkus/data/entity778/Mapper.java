package fr.spacefox.perftests.quarkus.data.entity778;

import fr.spacefox.perftests.quarkus.core.service778.model.Model778;

final class Mapper {
    private Mapper() {}

    public static Model778 of(Entity778 entity) {
        return new Model778(entity.getId(), entity.getField());
    }
}
