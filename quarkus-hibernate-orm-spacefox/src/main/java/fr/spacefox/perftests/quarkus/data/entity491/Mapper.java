package fr.spacefox.perftests.quarkus.data.entity491;

import fr.spacefox.perftests.quarkus.core.service491.model.Model491;

final class Mapper {
    private Mapper() {}

    public static Model491 of(Entity491 entity) {
        return new Model491(entity.getId(), entity.getField());
    }
}
