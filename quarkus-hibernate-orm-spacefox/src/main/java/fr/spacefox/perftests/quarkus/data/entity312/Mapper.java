package fr.spacefox.perftests.quarkus.data.entity312;

import fr.spacefox.perftests.quarkus.core.service312.model.Model312;

final class Mapper {
    private Mapper() {}

    public static Model312 of(Entity312 entity) {
        return new Model312(entity.getId(), entity.getField());
    }
}
