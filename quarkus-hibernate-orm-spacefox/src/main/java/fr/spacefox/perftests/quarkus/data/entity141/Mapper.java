package fr.spacefox.perftests.quarkus.data.entity141;

import fr.spacefox.perftests.quarkus.core.service141.model.Model141;

final class Mapper {
    private Mapper() {}

    public static Model141 of(Entity141 entity) {
        return new Model141(entity.getId(), entity.getField());
    }
}
