package fr.spacefox.perftests.quarkus.data.entity757;

import fr.spacefox.perftests.quarkus.core.service757.model.Model757;

final class Mapper {
    private Mapper() {}

    public static Model757 of(Entity757 entity) {
        return new Model757(entity.getId(), entity.getField());
    }
}
