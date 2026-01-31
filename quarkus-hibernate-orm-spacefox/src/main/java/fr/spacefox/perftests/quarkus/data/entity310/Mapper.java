package fr.spacefox.perftests.quarkus.data.entity310;

import fr.spacefox.perftests.quarkus.core.service310.model.Model310;

final class Mapper {
    private Mapper() {}

    public static Model310 of(Entity310 entity) {
        return new Model310(entity.getId(), entity.getField());
    }
}
