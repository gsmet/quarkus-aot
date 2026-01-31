package fr.spacefox.perftests.quarkus.data.entity145;

import fr.spacefox.perftests.quarkus.core.service145.model.Model145;

final class Mapper {
    private Mapper() {}

    public static Model145 of(Entity145 entity) {
        return new Model145(entity.getId(), entity.getField());
    }
}
