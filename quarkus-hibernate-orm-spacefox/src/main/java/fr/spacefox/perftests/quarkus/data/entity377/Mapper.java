package fr.spacefox.perftests.quarkus.data.entity377;

import fr.spacefox.perftests.quarkus.core.service377.model.Model377;

final class Mapper {
    private Mapper() {}

    public static Model377 of(Entity377 entity) {
        return new Model377(entity.getId(), entity.getField());
    }
}
