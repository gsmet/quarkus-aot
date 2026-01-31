package fr.spacefox.perftests.quarkus.data.entity269;

import fr.spacefox.perftests.quarkus.core.service269.model.Model269;

final class Mapper {
    private Mapper() {}

    public static Model269 of(Entity269 entity) {
        return new Model269(entity.getId(), entity.getField());
    }
}
