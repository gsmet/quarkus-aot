package fr.spacefox.perftests.quarkus.data.entity518;

import fr.spacefox.perftests.quarkus.core.service518.model.Model518;

final class Mapper {
    private Mapper() {}

    public static Model518 of(Entity518 entity) {
        return new Model518(entity.getId(), entity.getField());
    }
}
