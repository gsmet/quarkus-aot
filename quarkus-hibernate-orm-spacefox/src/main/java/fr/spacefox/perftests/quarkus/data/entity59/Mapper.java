package fr.spacefox.perftests.quarkus.data.entity59;

import fr.spacefox.perftests.quarkus.core.service59.model.Model59;

final class Mapper {
    private Mapper() {}

    public static Model59 of(Entity59 entity) {
        return new Model59(entity.getId(), entity.getField());
    }
}
