package fr.spacefox.perftests.quarkus.data.entity786;

import fr.spacefox.perftests.quarkus.core.service786.model.Model786;

final class Mapper {
    private Mapper() {}

    public static Model786 of(Entity786 entity) {
        return new Model786(entity.getId(), entity.getField());
    }
}
