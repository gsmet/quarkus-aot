package fr.spacefox.perftests.quarkus.data.entity553;

import fr.spacefox.perftests.quarkus.core.service553.model.Model553;

final class Mapper {
    private Mapper() {}

    public static Model553 of(Entity553 entity) {
        return new Model553(entity.getId(), entity.getField());
    }
}
