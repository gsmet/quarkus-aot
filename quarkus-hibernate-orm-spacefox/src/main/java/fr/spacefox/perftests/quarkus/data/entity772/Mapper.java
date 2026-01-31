package fr.spacefox.perftests.quarkus.data.entity772;

import fr.spacefox.perftests.quarkus.core.service772.model.Model772;

final class Mapper {
    private Mapper() {}

    public static Model772 of(Entity772 entity) {
        return new Model772(entity.getId(), entity.getField());
    }
}
