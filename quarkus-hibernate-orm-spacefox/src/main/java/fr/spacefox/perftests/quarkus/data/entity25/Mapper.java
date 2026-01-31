package fr.spacefox.perftests.quarkus.data.entity25;

import fr.spacefox.perftests.quarkus.core.service25.model.Model25;

final class Mapper {
    private Mapper() {}

    public static Model25 of(Entity25 entity) {
        return new Model25(entity.getId(), entity.getField());
    }
}
