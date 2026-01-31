package fr.spacefox.perftests.quarkus.data.entity405;

import fr.spacefox.perftests.quarkus.core.service405.model.Model405;

final class Mapper {
    private Mapper() {}

    public static Model405 of(Entity405 entity) {
        return new Model405(entity.getId(), entity.getField());
    }
}
