package fr.spacefox.perftests.quarkus.data.entity884;

import fr.spacefox.perftests.quarkus.core.service884.model.Model884;

final class Mapper {
    private Mapper() {}

    public static Model884 of(Entity884 entity) {
        return new Model884(entity.getId(), entity.getField());
    }
}
