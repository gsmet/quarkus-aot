package fr.spacefox.perftests.quarkus.data.entity710;

import fr.spacefox.perftests.quarkus.core.service710.model.Model710;

final class Mapper {
    private Mapper() {}

    public static Model710 of(Entity710 entity) {
        return new Model710(entity.getId(), entity.getField());
    }
}
