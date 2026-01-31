package fr.spacefox.perftests.quarkus.data.entity161;

import fr.spacefox.perftests.quarkus.core.service161.model.Model161;

final class Mapper {
    private Mapper() {}

    public static Model161 of(Entity161 entity) {
        return new Model161(entity.getId(), entity.getField());
    }
}
