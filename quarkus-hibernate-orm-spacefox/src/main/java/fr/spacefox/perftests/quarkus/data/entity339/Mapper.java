package fr.spacefox.perftests.quarkus.data.entity339;

import fr.spacefox.perftests.quarkus.core.service339.model.Model339;

final class Mapper {
    private Mapper() {}

    public static Model339 of(Entity339 entity) {
        return new Model339(entity.getId(), entity.getField());
    }
}
