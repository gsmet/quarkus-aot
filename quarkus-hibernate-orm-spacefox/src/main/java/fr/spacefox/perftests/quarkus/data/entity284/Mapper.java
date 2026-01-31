package fr.spacefox.perftests.quarkus.data.entity284;

import fr.spacefox.perftests.quarkus.core.service284.model.Model284;

final class Mapper {
    private Mapper() {}

    public static Model284 of(Entity284 entity) {
        return new Model284(entity.getId(), entity.getField());
    }
}
