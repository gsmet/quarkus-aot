package fr.spacefox.perftests.quarkus.data.entity870;

import fr.spacefox.perftests.quarkus.core.service870.model.Model870;

final class Mapper {
    private Mapper() {}

    public static Model870 of(Entity870 entity) {
        return new Model870(entity.getId(), entity.getField());
    }
}
