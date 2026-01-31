package fr.spacefox.perftests.quarkus.data.entity513;

import fr.spacefox.perftests.quarkus.core.service513.model.Model513;

final class Mapper {
    private Mapper() {}

    public static Model513 of(Entity513 entity) {
        return new Model513(entity.getId(), entity.getField());
    }
}
