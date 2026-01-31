package fr.spacefox.perftests.quarkus.data.entity399;

import fr.spacefox.perftests.quarkus.core.service399.model.Model399;

final class Mapper {
    private Mapper() {}

    public static Model399 of(Entity399 entity) {
        return new Model399(entity.getId(), entity.getField());
    }
}
