package fr.spacefox.perftests.quarkus.data.entity150;

import fr.spacefox.perftests.quarkus.core.service150.model.Model150;

final class Mapper {
    private Mapper() {}

    public static Model150 of(Entity150 entity) {
        return new Model150(entity.getId(), entity.getField());
    }
}
