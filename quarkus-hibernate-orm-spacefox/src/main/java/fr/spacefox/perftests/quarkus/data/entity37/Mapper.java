package fr.spacefox.perftests.quarkus.data.entity37;

import fr.spacefox.perftests.quarkus.core.service37.model.Model37;

final class Mapper {
    private Mapper() {}

    public static Model37 of(Entity37 entity) {
        return new Model37(entity.getId(), entity.getField());
    }
}
