package fr.spacefox.perftests.quarkus.data.entity979;

import fr.spacefox.perftests.quarkus.core.service979.model.Model979;

final class Mapper {
    private Mapper() {}

    public static Model979 of(Entity979 entity) {
        return new Model979(entity.getId(), entity.getField());
    }
}
