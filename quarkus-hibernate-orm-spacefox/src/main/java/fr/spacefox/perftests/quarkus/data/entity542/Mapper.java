package fr.spacefox.perftests.quarkus.data.entity542;

import fr.spacefox.perftests.quarkus.core.service542.model.Model542;

final class Mapper {
    private Mapper() {}

    public static Model542 of(Entity542 entity) {
        return new Model542(entity.getId(), entity.getField());
    }
}
