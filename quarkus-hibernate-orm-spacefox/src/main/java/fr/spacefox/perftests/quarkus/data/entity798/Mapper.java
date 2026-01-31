package fr.spacefox.perftests.quarkus.data.entity798;

import fr.spacefox.perftests.quarkus.core.service798.model.Model798;

final class Mapper {
    private Mapper() {}

    public static Model798 of(Entity798 entity) {
        return new Model798(entity.getId(), entity.getField());
    }
}
