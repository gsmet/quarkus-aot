package fr.spacefox.perftests.quarkus.data.entity97;

import fr.spacefox.perftests.quarkus.core.service97.model.Model97;

final class Mapper {
    private Mapper() {}

    public static Model97 of(Entity97 entity) {
        return new Model97(entity.getId(), entity.getField());
    }
}
