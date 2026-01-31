package fr.spacefox.perftests.quarkus.data.entity835;

import fr.spacefox.perftests.quarkus.core.service835.model.Model835;

final class Mapper {
    private Mapper() {}

    public static Model835 of(Entity835 entity) {
        return new Model835(entity.getId(), entity.getField());
    }
}
