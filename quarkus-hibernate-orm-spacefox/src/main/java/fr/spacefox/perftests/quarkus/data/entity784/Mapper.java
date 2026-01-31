package fr.spacefox.perftests.quarkus.data.entity784;

import fr.spacefox.perftests.quarkus.core.service784.model.Model784;

final class Mapper {
    private Mapper() {}

    public static Model784 of(Entity784 entity) {
        return new Model784(entity.getId(), entity.getField());
    }
}
