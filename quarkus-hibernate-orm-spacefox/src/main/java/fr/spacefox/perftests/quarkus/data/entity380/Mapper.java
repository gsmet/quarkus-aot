package fr.spacefox.perftests.quarkus.data.entity380;

import fr.spacefox.perftests.quarkus.core.service380.model.Model380;

final class Mapper {
    private Mapper() {}

    public static Model380 of(Entity380 entity) {
        return new Model380(entity.getId(), entity.getField());
    }
}
