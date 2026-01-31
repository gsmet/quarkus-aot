package fr.spacefox.perftests.quarkus.data.entity131;

import fr.spacefox.perftests.quarkus.core.service131.model.Model131;

final class Mapper {
    private Mapper() {}

    public static Model131 of(Entity131 entity) {
        return new Model131(entity.getId(), entity.getField());
    }
}
