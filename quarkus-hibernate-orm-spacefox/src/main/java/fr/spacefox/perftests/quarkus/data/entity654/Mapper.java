package fr.spacefox.perftests.quarkus.data.entity654;

import fr.spacefox.perftests.quarkus.core.service654.model.Model654;

final class Mapper {
    private Mapper() {}

    public static Model654 of(Entity654 entity) {
        return new Model654(entity.getId(), entity.getField());
    }
}
