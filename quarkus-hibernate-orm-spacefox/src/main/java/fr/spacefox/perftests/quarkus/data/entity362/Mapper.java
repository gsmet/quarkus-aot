package fr.spacefox.perftests.quarkus.data.entity362;

import fr.spacefox.perftests.quarkus.core.service362.model.Model362;

final class Mapper {
    private Mapper() {}

    public static Model362 of(Entity362 entity) {
        return new Model362(entity.getId(), entity.getField());
    }
}
