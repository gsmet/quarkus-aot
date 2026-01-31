package fr.spacefox.perftests.quarkus.data.entity278;

import fr.spacefox.perftests.quarkus.core.service278.model.Model278;

final class Mapper {
    private Mapper() {}

    public static Model278 of(Entity278 entity) {
        return new Model278(entity.getId(), entity.getField());
    }
}
