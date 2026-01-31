package fr.spacefox.perftests.quarkus.data.entity691;

import fr.spacefox.perftests.quarkus.core.service691.model.Model691;

final class Mapper {
    private Mapper() {}

    public static Model691 of(Entity691 entity) {
        return new Model691(entity.getId(), entity.getField());
    }
}
