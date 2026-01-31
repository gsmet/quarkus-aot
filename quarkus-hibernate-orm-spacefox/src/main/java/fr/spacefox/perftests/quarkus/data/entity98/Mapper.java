package fr.spacefox.perftests.quarkus.data.entity98;

import fr.spacefox.perftests.quarkus.core.service98.model.Model98;

final class Mapper {
    private Mapper() {}

    public static Model98 of(Entity98 entity) {
        return new Model98(entity.getId(), entity.getField());
    }
}
