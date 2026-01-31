package fr.spacefox.perftests.quarkus.data.entity149;

import fr.spacefox.perftests.quarkus.core.service149.model.Model149;

final class Mapper {
    private Mapper() {}

    public static Model149 of(Entity149 entity) {
        return new Model149(entity.getId(), entity.getField());
    }
}
