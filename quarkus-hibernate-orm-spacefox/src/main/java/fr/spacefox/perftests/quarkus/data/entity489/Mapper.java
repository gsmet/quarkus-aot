package fr.spacefox.perftests.quarkus.data.entity489;

import fr.spacefox.perftests.quarkus.core.service489.model.Model489;

final class Mapper {
    private Mapper() {}

    public static Model489 of(Entity489 entity) {
        return new Model489(entity.getId(), entity.getField());
    }
}
