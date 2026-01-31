package fr.spacefox.perftests.quarkus.data.entity175;

import fr.spacefox.perftests.quarkus.core.service175.model.Model175;

final class Mapper {
    private Mapper() {}

    public static Model175 of(Entity175 entity) {
        return new Model175(entity.getId(), entity.getField());
    }
}
