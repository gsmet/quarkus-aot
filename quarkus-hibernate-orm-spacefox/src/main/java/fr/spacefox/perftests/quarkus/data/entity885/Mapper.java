package fr.spacefox.perftests.quarkus.data.entity885;

import fr.spacefox.perftests.quarkus.core.service885.model.Model885;

final class Mapper {
    private Mapper() {}

    public static Model885 of(Entity885 entity) {
        return new Model885(entity.getId(), entity.getField());
    }
}
