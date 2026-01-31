package fr.spacefox.perftests.quarkus.data.entity984;

import fr.spacefox.perftests.quarkus.core.service984.model.Model984;

final class Mapper {
    private Mapper() {}

    public static Model984 of(Entity984 entity) {
        return new Model984(entity.getId(), entity.getField());
    }
}
