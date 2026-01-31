package fr.spacefox.perftests.quarkus.data.entity221;

import fr.spacefox.perftests.quarkus.core.service221.model.Model221;

final class Mapper {
    private Mapper() {}

    public static Model221 of(Entity221 entity) {
        return new Model221(entity.getId(), entity.getField());
    }
}
