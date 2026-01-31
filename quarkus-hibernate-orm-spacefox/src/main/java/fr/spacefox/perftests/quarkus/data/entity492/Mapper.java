package fr.spacefox.perftests.quarkus.data.entity492;

import fr.spacefox.perftests.quarkus.core.service492.model.Model492;

final class Mapper {
    private Mapper() {}

    public static Model492 of(Entity492 entity) {
        return new Model492(entity.getId(), entity.getField());
    }
}
