package fr.spacefox.perftests.quarkus.data.entity129;

import fr.spacefox.perftests.quarkus.core.service129.model.Model129;

final class Mapper {
    private Mapper() {}

    public static Model129 of(Entity129 entity) {
        return new Model129(entity.getId(), entity.getField());
    }
}
