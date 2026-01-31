package fr.spacefox.perftests.quarkus.data.entity101;

import fr.spacefox.perftests.quarkus.core.service101.model.Model101;

final class Mapper {
    private Mapper() {}

    public static Model101 of(Entity101 entity) {
        return new Model101(entity.getId(), entity.getField());
    }
}
