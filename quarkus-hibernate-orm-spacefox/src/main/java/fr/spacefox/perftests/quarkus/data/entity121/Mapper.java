package fr.spacefox.perftests.quarkus.data.entity121;

import fr.spacefox.perftests.quarkus.core.service121.model.Model121;

final class Mapper {
    private Mapper() {}

    public static Model121 of(Entity121 entity) {
        return new Model121(entity.getId(), entity.getField());
    }
}
