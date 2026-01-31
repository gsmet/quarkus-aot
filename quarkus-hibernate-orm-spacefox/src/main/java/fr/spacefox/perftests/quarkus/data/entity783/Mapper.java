package fr.spacefox.perftests.quarkus.data.entity783;

import fr.spacefox.perftests.quarkus.core.service783.model.Model783;

final class Mapper {
    private Mapper() {}

    public static Model783 of(Entity783 entity) {
        return new Model783(entity.getId(), entity.getField());
    }
}
