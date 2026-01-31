package fr.spacefox.perftests.quarkus.data.entity393;

import fr.spacefox.perftests.quarkus.core.service393.model.Model393;

final class Mapper {
    private Mapper() {}

    public static Model393 of(Entity393 entity) {
        return new Model393(entity.getId(), entity.getField());
    }
}
