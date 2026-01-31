package fr.spacefox.perftests.quarkus.data.entity875;

import fr.spacefox.perftests.quarkus.core.service875.model.Model875;

final class Mapper {
    private Mapper() {}

    public static Model875 of(Entity875 entity) {
        return new Model875(entity.getId(), entity.getField());
    }
}
