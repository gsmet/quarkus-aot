package fr.spacefox.perftests.quarkus.data.entity39;

import fr.spacefox.perftests.quarkus.core.service39.model.Model39;

final class Mapper {
    private Mapper() {}

    public static Model39 of(Entity39 entity) {
        return new Model39(entity.getId(), entity.getField());
    }
}
