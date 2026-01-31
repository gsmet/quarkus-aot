package fr.spacefox.perftests.quarkus.data.entity270;

import fr.spacefox.perftests.quarkus.core.service270.model.Model270;

final class Mapper {
    private Mapper() {}

    public static Model270 of(Entity270 entity) {
        return new Model270(entity.getId(), entity.getField());
    }
}
