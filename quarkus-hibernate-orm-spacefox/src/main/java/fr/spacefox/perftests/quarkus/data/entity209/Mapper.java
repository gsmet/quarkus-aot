package fr.spacefox.perftests.quarkus.data.entity209;

import fr.spacefox.perftests.quarkus.core.service209.model.Model209;

final class Mapper {
    private Mapper() {}

    public static Model209 of(Entity209 entity) {
        return new Model209(entity.getId(), entity.getField());
    }
}
