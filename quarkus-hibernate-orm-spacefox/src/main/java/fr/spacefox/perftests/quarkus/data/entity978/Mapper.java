package fr.spacefox.perftests.quarkus.data.entity978;

import fr.spacefox.perftests.quarkus.core.service978.model.Model978;

final class Mapper {
    private Mapper() {}

    public static Model978 of(Entity978 entity) {
        return new Model978(entity.getId(), entity.getField());
    }
}
