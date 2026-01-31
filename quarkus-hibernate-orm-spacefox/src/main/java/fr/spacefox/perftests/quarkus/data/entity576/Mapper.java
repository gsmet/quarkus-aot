package fr.spacefox.perftests.quarkus.data.entity576;

import fr.spacefox.perftests.quarkus.core.service576.model.Model576;

final class Mapper {
    private Mapper() {}

    public static Model576 of(Entity576 entity) {
        return new Model576(entity.getId(), entity.getField());
    }
}
