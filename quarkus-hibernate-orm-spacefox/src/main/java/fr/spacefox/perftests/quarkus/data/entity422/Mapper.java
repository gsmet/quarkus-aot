package fr.spacefox.perftests.quarkus.data.entity422;

import fr.spacefox.perftests.quarkus.core.service422.model.Model422;

final class Mapper {
    private Mapper() {}

    public static Model422 of(Entity422 entity) {
        return new Model422(entity.getId(), entity.getField());
    }
}
