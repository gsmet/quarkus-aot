package fr.spacefox.perftests.quarkus.data.entity481;

import fr.spacefox.perftests.quarkus.core.service481.model.Model481;

final class Mapper {
    private Mapper() {}

    public static Model481 of(Entity481 entity) {
        return new Model481(entity.getId(), entity.getField());
    }
}
