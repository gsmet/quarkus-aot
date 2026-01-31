package fr.spacefox.perftests.quarkus.data.entity681;

import fr.spacefox.perftests.quarkus.core.service681.model.Model681;

final class Mapper {
    private Mapper() {}

    public static Model681 of(Entity681 entity) {
        return new Model681(entity.getId(), entity.getField());
    }
}
