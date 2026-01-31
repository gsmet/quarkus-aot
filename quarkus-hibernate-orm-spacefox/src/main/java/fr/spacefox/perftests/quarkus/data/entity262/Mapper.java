package fr.spacefox.perftests.quarkus.data.entity262;

import fr.spacefox.perftests.quarkus.core.service262.model.Model262;

final class Mapper {
    private Mapper() {}

    public static Model262 of(Entity262 entity) {
        return new Model262(entity.getId(), entity.getField());
    }
}
