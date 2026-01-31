package fr.spacefox.perftests.quarkus.data.entity507;

import fr.spacefox.perftests.quarkus.core.service507.model.Model507;

final class Mapper {
    private Mapper() {}

    public static Model507 of(Entity507 entity) {
        return new Model507(entity.getId(), entity.getField());
    }
}
