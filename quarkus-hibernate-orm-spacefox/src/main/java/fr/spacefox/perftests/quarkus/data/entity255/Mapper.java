package fr.spacefox.perftests.quarkus.data.entity255;

import fr.spacefox.perftests.quarkus.core.service255.model.Model255;

final class Mapper {
    private Mapper() {}

    public static Model255 of(Entity255 entity) {
        return new Model255(entity.getId(), entity.getField());
    }
}
