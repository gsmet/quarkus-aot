package fr.spacefox.perftests.quarkus.data.entity939;

import fr.spacefox.perftests.quarkus.core.service939.model.Model939;

final class Mapper {
    private Mapper() {}

    public static Model939 of(Entity939 entity) {
        return new Model939(entity.getId(), entity.getField());
    }
}
