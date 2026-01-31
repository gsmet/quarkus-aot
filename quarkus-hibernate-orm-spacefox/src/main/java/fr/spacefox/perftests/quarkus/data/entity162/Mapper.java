package fr.spacefox.perftests.quarkus.data.entity162;

import fr.spacefox.perftests.quarkus.core.service162.model.Model162;

final class Mapper {
    private Mapper() {}

    public static Model162 of(Entity162 entity) {
        return new Model162(entity.getId(), entity.getField());
    }
}
