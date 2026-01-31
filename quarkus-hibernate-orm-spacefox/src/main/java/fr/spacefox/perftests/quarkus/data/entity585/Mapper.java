package fr.spacefox.perftests.quarkus.data.entity585;

import fr.spacefox.perftests.quarkus.core.service585.model.Model585;

final class Mapper {
    private Mapper() {}

    public static Model585 of(Entity585 entity) {
        return new Model585(entity.getId(), entity.getField());
    }
}
