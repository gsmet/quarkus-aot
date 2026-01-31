package fr.spacefox.perftests.quarkus.data.entity900;

import fr.spacefox.perftests.quarkus.core.service900.model.Model900;

final class Mapper {
    private Mapper() {}

    public static Model900 of(Entity900 entity) {
        return new Model900(entity.getId(), entity.getField());
    }
}
