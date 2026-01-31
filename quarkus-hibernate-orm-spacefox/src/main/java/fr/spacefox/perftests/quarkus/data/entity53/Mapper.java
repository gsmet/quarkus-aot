package fr.spacefox.perftests.quarkus.data.entity53;

import fr.spacefox.perftests.quarkus.core.service53.model.Model53;

final class Mapper {
    private Mapper() {}

    public static Model53 of(Entity53 entity) {
        return new Model53(entity.getId(), entity.getField());
    }
}
