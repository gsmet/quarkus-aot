package fr.spacefox.perftests.quarkus.data.entity903;

import fr.spacefox.perftests.quarkus.core.service903.model.Model903;

final class Mapper {
    private Mapper() {}

    public static Model903 of(Entity903 entity) {
        return new Model903(entity.getId(), entity.getField());
    }
}
