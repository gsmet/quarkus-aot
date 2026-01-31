package fr.spacefox.perftests.quarkus.data.entity246;

import fr.spacefox.perftests.quarkus.core.service246.model.Model246;

final class Mapper {
    private Mapper() {}

    public static Model246 of(Entity246 entity) {
        return new Model246(entity.getId(), entity.getField());
    }
}
