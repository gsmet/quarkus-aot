package fr.spacefox.perftests.quarkus.data.entity347;

import fr.spacefox.perftests.quarkus.core.service347.model.Model347;

final class Mapper {
    private Mapper() {}

    public static Model347 of(Entity347 entity) {
        return new Model347(entity.getId(), entity.getField());
    }
}
