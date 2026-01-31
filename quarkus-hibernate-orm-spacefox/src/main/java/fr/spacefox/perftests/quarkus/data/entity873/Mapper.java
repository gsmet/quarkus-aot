package fr.spacefox.perftests.quarkus.data.entity873;

import fr.spacefox.perftests.quarkus.core.service873.model.Model873;

final class Mapper {
    private Mapper() {}

    public static Model873 of(Entity873 entity) {
        return new Model873(entity.getId(), entity.getField());
    }
}
