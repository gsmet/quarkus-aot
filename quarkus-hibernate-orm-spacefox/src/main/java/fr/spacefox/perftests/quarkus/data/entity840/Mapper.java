package fr.spacefox.perftests.quarkus.data.entity840;

import fr.spacefox.perftests.quarkus.core.service840.model.Model840;

final class Mapper {
    private Mapper() {}

    public static Model840 of(Entity840 entity) {
        return new Model840(entity.getId(), entity.getField());
    }
}
