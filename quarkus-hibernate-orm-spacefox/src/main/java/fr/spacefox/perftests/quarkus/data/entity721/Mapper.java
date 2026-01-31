package fr.spacefox.perftests.quarkus.data.entity721;

import fr.spacefox.perftests.quarkus.core.service721.model.Model721;

final class Mapper {
    private Mapper() {}

    public static Model721 of(Entity721 entity) {
        return new Model721(entity.getId(), entity.getField());
    }
}
