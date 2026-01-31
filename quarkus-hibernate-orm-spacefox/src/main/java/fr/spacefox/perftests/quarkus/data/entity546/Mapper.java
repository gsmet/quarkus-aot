package fr.spacefox.perftests.quarkus.data.entity546;

import fr.spacefox.perftests.quarkus.core.service546.model.Model546;

final class Mapper {
    private Mapper() {}

    public static Model546 of(Entity546 entity) {
        return new Model546(entity.getId(), entity.getField());
    }
}
