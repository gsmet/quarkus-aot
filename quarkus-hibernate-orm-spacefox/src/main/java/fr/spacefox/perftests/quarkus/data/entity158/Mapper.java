package fr.spacefox.perftests.quarkus.data.entity158;

import fr.spacefox.perftests.quarkus.core.service158.model.Model158;

final class Mapper {
    private Mapper() {}

    public static Model158 of(Entity158 entity) {
        return new Model158(entity.getId(), entity.getField());
    }
}
