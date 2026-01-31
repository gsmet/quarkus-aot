package fr.spacefox.perftests.quarkus.data.entity412;

import fr.spacefox.perftests.quarkus.core.service412.model.Model412;

final class Mapper {
    private Mapper() {}

    public static Model412 of(Entity412 entity) {
        return new Model412(entity.getId(), entity.getField());
    }
}
