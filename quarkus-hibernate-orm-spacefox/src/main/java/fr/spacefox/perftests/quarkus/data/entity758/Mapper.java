package fr.spacefox.perftests.quarkus.data.entity758;

import fr.spacefox.perftests.quarkus.core.service758.model.Model758;

final class Mapper {
    private Mapper() {}

    public static Model758 of(Entity758 entity) {
        return new Model758(entity.getId(), entity.getField());
    }
}
