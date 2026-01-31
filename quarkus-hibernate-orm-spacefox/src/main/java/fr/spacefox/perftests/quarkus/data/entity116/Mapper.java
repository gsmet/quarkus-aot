package fr.spacefox.perftests.quarkus.data.entity116;

import fr.spacefox.perftests.quarkus.core.service116.model.Model116;

final class Mapper {
    private Mapper() {}

    public static Model116 of(Entity116 entity) {
        return new Model116(entity.getId(), entity.getField());
    }
}
