package fr.spacefox.perftests.quarkus.data.entity526;

import fr.spacefox.perftests.quarkus.core.service526.model.Model526;

final class Mapper {
    private Mapper() {}

    public static Model526 of(Entity526 entity) {
        return new Model526(entity.getId(), entity.getField());
    }
}
