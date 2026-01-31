package fr.spacefox.perftests.quarkus.data.entity583;

import fr.spacefox.perftests.quarkus.core.service583.model.Model583;

final class Mapper {
    private Mapper() {}

    public static Model583 of(Entity583 entity) {
        return new Model583(entity.getId(), entity.getField());
    }
}
