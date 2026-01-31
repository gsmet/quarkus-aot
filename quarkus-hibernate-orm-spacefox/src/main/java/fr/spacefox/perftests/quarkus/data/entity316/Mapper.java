package fr.spacefox.perftests.quarkus.data.entity316;

import fr.spacefox.perftests.quarkus.core.service316.model.Model316;

final class Mapper {
    private Mapper() {}

    public static Model316 of(Entity316 entity) {
        return new Model316(entity.getId(), entity.getField());
    }
}
