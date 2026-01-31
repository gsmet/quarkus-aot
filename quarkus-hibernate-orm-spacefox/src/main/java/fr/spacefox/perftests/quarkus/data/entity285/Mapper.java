package fr.spacefox.perftests.quarkus.data.entity285;

import fr.spacefox.perftests.quarkus.core.service285.model.Model285;

final class Mapper {
    private Mapper() {}

    public static Model285 of(Entity285 entity) {
        return new Model285(entity.getId(), entity.getField());
    }
}
