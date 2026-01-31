package fr.spacefox.perftests.quarkus.data.entity902;

import fr.spacefox.perftests.quarkus.core.service902.model.Model902;

final class Mapper {
    private Mapper() {}

    public static Model902 of(Entity902 entity) {
        return new Model902(entity.getId(), entity.getField());
    }
}
