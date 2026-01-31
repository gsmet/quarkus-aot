package fr.spacefox.perftests.quarkus.data.entity99;

import fr.spacefox.perftests.quarkus.core.service99.model.Model99;

final class Mapper {
    private Mapper() {}

    public static Model99 of(Entity99 entity) {
        return new Model99(entity.getId(), entity.getField());
    }
}
