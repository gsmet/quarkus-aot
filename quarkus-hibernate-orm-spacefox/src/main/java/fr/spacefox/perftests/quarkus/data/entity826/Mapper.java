package fr.spacefox.perftests.quarkus.data.entity826;

import fr.spacefox.perftests.quarkus.core.service826.model.Model826;

final class Mapper {
    private Mapper() {}

    public static Model826 of(Entity826 entity) {
        return new Model826(entity.getId(), entity.getField());
    }
}
