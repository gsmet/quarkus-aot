package fr.spacefox.perftests.quarkus.data.entity372;

import fr.spacefox.perftests.quarkus.core.service372.model.Model372;

final class Mapper {
    private Mapper() {}

    public static Model372 of(Entity372 entity) {
        return new Model372(entity.getId(), entity.getField());
    }
}
