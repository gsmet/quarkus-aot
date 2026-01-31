package fr.spacefox.perftests.quarkus.data.entity943;

import fr.spacefox.perftests.quarkus.core.service943.model.Model943;

final class Mapper {
    private Mapper() {}

    public static Model943 of(Entity943 entity) {
        return new Model943(entity.getId(), entity.getField());
    }
}
