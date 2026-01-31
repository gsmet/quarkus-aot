package fr.spacefox.perftests.quarkus.data.entity92;

import fr.spacefox.perftests.quarkus.core.service92.model.Model92;

final class Mapper {
    private Mapper() {}

    public static Model92 of(Entity92 entity) {
        return new Model92(entity.getId(), entity.getField());
    }
}
