package fr.spacefox.perftests.quarkus.data.entity459;

import fr.spacefox.perftests.quarkus.core.service459.model.Model459;

final class Mapper {
    private Mapper() {}

    public static Model459 of(Entity459 entity) {
        return new Model459(entity.getId(), entity.getField());
    }
}
