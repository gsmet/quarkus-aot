package fr.spacefox.perftests.quarkus.data.entity830;

import fr.spacefox.perftests.quarkus.core.service830.model.Model830;

final class Mapper {
    private Mapper() {}

    public static Model830 of(Entity830 entity) {
        return new Model830(entity.getId(), entity.getField());
    }
}
