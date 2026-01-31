package fr.spacefox.perftests.quarkus.data.entity820;

import fr.spacefox.perftests.quarkus.core.service820.model.Model820;

final class Mapper {
    private Mapper() {}

    public static Model820 of(Entity820 entity) {
        return new Model820(entity.getId(), entity.getField());
    }
}
