package fr.spacefox.perftests.quarkus.data.entity266;

import fr.spacefox.perftests.quarkus.core.service266.model.Model266;

final class Mapper {
    private Mapper() {}

    public static Model266 of(Entity266 entity) {
        return new Model266(entity.getId(), entity.getField());
    }
}
