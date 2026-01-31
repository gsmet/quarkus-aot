package fr.spacefox.perftests.quarkus.data.entity329;

import fr.spacefox.perftests.quarkus.core.service329.model.Model329;

final class Mapper {
    private Mapper() {}

    public static Model329 of(Entity329 entity) {
        return new Model329(entity.getId(), entity.getField());
    }
}
