package fr.spacefox.perftests.quarkus.data.entity932;

import fr.spacefox.perftests.quarkus.core.service932.model.Model932;

final class Mapper {
    private Mapper() {}

    public static Model932 of(Entity932 entity) {
        return new Model932(entity.getId(), entity.getField());
    }
}
