package fr.spacefox.perftests.quarkus.data.entity626;

import fr.spacefox.perftests.quarkus.core.service626.model.Model626;

final class Mapper {
    private Mapper() {}

    public static Model626 of(Entity626 entity) {
        return new Model626(entity.getId(), entity.getField());
    }
}
