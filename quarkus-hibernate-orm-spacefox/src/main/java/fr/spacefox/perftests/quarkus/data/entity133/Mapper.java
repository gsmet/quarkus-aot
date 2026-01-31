package fr.spacefox.perftests.quarkus.data.entity133;

import fr.spacefox.perftests.quarkus.core.service133.model.Model133;

final class Mapper {
    private Mapper() {}

    public static Model133 of(Entity133 entity) {
        return new Model133(entity.getId(), entity.getField());
    }
}
