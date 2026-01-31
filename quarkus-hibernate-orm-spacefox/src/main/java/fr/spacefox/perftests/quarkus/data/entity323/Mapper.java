package fr.spacefox.perftests.quarkus.data.entity323;

import fr.spacefox.perftests.quarkus.core.service323.model.Model323;

final class Mapper {
    private Mapper() {}

    public static Model323 of(Entity323 entity) {
        return new Model323(entity.getId(), entity.getField());
    }
}
