package fr.spacefox.perftests.quarkus.data.entity596;

import fr.spacefox.perftests.quarkus.core.service596.model.Model596;

final class Mapper {
    private Mapper() {}

    public static Model596 of(Entity596 entity) {
        return new Model596(entity.getId(), entity.getField());
    }
}
