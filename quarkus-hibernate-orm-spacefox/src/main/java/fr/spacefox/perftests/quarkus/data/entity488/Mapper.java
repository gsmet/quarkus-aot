package fr.spacefox.perftests.quarkus.data.entity488;

import fr.spacefox.perftests.quarkus.core.service488.model.Model488;

final class Mapper {
    private Mapper() {}

    public static Model488 of(Entity488 entity) {
        return new Model488(entity.getId(), entity.getField());
    }
}
