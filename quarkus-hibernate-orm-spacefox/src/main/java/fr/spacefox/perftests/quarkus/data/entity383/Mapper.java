package fr.spacefox.perftests.quarkus.data.entity383;

import fr.spacefox.perftests.quarkus.core.service383.model.Model383;

final class Mapper {
    private Mapper() {}

    public static Model383 of(Entity383 entity) {
        return new Model383(entity.getId(), entity.getField());
    }
}
