package fr.spacefox.perftests.quarkus.data.entity411;

import fr.spacefox.perftests.quarkus.core.service411.model.Model411;

final class Mapper {
    private Mapper() {}

    public static Model411 of(Entity411 entity) {
        return new Model411(entity.getId(), entity.getField());
    }
}
