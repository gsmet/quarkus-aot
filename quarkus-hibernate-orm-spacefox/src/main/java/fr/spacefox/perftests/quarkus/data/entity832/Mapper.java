package fr.spacefox.perftests.quarkus.data.entity832;

import fr.spacefox.perftests.quarkus.core.service832.model.Model832;

final class Mapper {
    private Mapper() {}

    public static Model832 of(Entity832 entity) {
        return new Model832(entity.getId(), entity.getField());
    }
}
