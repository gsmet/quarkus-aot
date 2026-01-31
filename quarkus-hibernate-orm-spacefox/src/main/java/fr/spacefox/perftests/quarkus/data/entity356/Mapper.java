package fr.spacefox.perftests.quarkus.data.entity356;

import fr.spacefox.perftests.quarkus.core.service356.model.Model356;

final class Mapper {
    private Mapper() {}

    public static Model356 of(Entity356 entity) {
        return new Model356(entity.getId(), entity.getField());
    }
}
