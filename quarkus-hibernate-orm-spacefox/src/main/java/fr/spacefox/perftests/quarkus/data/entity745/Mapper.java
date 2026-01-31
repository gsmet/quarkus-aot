package fr.spacefox.perftests.quarkus.data.entity745;

import fr.spacefox.perftests.quarkus.core.service745.model.Model745;

final class Mapper {
    private Mapper() {}

    public static Model745 of(Entity745 entity) {
        return new Model745(entity.getId(), entity.getField());
    }
}
