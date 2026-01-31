package fr.spacefox.perftests.quarkus.data.entity791;

import fr.spacefox.perftests.quarkus.core.service791.model.Model791;

final class Mapper {
    private Mapper() {}

    public static Model791 of(Entity791 entity) {
        return new Model791(entity.getId(), entity.getField());
    }
}
