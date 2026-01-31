package fr.spacefox.perftests.quarkus.data.entity974;

import fr.spacefox.perftests.quarkus.core.service974.model.Model974;

final class Mapper {
    private Mapper() {}

    public static Model974 of(Entity974 entity) {
        return new Model974(entity.getId(), entity.getField());
    }
}
