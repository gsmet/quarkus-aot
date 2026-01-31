package fr.spacefox.perftests.quarkus.data.entity446;

import fr.spacefox.perftests.quarkus.core.service446.model.Model446;

final class Mapper {
    private Mapper() {}

    public static Model446 of(Entity446 entity) {
        return new Model446(entity.getId(), entity.getField());
    }
}
