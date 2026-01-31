package fr.spacefox.perftests.quarkus.data.entity391;

import fr.spacefox.perftests.quarkus.core.service391.model.Model391;

final class Mapper {
    private Mapper() {}

    public static Model391 of(Entity391 entity) {
        return new Model391(entity.getId(), entity.getField());
    }
}
