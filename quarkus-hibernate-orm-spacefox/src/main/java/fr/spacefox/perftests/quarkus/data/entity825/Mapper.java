package fr.spacefox.perftests.quarkus.data.entity825;

import fr.spacefox.perftests.quarkus.core.service825.model.Model825;

final class Mapper {
    private Mapper() {}

    public static Model825 of(Entity825 entity) {
        return new Model825(entity.getId(), entity.getField());
    }
}
