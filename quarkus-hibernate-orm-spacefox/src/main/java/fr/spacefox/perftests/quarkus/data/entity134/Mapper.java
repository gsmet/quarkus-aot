package fr.spacefox.perftests.quarkus.data.entity134;

import fr.spacefox.perftests.quarkus.core.service134.model.Model134;

final class Mapper {
    private Mapper() {}

    public static Model134 of(Entity134 entity) {
        return new Model134(entity.getId(), entity.getField());
    }
}
