package fr.spacefox.perftests.quarkus.data.entity867;

import fr.spacefox.perftests.quarkus.core.service867.model.Model867;

final class Mapper {
    private Mapper() {}

    public static Model867 of(Entity867 entity) {
        return new Model867(entity.getId(), entity.getField());
    }
}
