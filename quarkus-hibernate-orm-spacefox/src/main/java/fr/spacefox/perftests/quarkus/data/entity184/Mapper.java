package fr.spacefox.perftests.quarkus.data.entity184;

import fr.spacefox.perftests.quarkus.core.service184.model.Model184;

final class Mapper {
    private Mapper() {}

    public static Model184 of(Entity184 entity) {
        return new Model184(entity.getId(), entity.getField());
    }
}
