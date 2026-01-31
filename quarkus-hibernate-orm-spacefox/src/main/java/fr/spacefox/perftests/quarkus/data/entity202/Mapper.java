package fr.spacefox.perftests.quarkus.data.entity202;

import fr.spacefox.perftests.quarkus.core.service202.model.Model202;

final class Mapper {
    private Mapper() {}

    public static Model202 of(Entity202 entity) {
        return new Model202(entity.getId(), entity.getField());
    }
}
