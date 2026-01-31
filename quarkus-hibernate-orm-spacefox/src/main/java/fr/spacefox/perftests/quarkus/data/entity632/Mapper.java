package fr.spacefox.perftests.quarkus.data.entity632;

import fr.spacefox.perftests.quarkus.core.service632.model.Model632;

final class Mapper {
    private Mapper() {}

    public static Model632 of(Entity632 entity) {
        return new Model632(entity.getId(), entity.getField());
    }
}
