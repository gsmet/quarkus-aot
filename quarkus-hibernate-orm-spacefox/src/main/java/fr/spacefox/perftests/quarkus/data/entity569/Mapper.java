package fr.spacefox.perftests.quarkus.data.entity569;

import fr.spacefox.perftests.quarkus.core.service569.model.Model569;

final class Mapper {
    private Mapper() {}

    public static Model569 of(Entity569 entity) {
        return new Model569(entity.getId(), entity.getField());
    }
}
