package fr.spacefox.perftests.quarkus.data.entity415;

import fr.spacefox.perftests.quarkus.core.service415.model.Model415;

final class Mapper {
    private Mapper() {}

    public static Model415 of(Entity415 entity) {
        return new Model415(entity.getId(), entity.getField());
    }
}
