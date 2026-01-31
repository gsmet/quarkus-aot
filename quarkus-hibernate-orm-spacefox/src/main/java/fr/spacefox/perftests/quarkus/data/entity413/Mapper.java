package fr.spacefox.perftests.quarkus.data.entity413;

import fr.spacefox.perftests.quarkus.core.service413.model.Model413;

final class Mapper {
    private Mapper() {}

    public static Model413 of(Entity413 entity) {
        return new Model413(entity.getId(), entity.getField());
    }
}
