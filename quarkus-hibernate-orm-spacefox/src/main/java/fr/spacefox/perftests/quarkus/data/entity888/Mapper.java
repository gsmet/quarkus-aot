package fr.spacefox.perftests.quarkus.data.entity888;

import fr.spacefox.perftests.quarkus.core.service888.model.Model888;

final class Mapper {
    private Mapper() {}

    public static Model888 of(Entity888 entity) {
        return new Model888(entity.getId(), entity.getField());
    }
}
