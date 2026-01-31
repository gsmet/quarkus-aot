package fr.spacefox.perftests.quarkus.data.entity379;

import fr.spacefox.perftests.quarkus.core.service379.model.Model379;

final class Mapper {
    private Mapper() {}

    public static Model379 of(Entity379 entity) {
        return new Model379(entity.getId(), entity.getField());
    }
}
