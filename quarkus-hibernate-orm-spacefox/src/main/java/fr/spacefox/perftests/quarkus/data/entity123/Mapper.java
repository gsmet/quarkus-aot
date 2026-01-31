package fr.spacefox.perftests.quarkus.data.entity123;

import fr.spacefox.perftests.quarkus.core.service123.model.Model123;

final class Mapper {
    private Mapper() {}

    public static Model123 of(Entity123 entity) {
        return new Model123(entity.getId(), entity.getField());
    }
}
