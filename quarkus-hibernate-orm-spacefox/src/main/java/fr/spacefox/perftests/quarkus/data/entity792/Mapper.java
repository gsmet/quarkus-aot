package fr.spacefox.perftests.quarkus.data.entity792;

import fr.spacefox.perftests.quarkus.core.service792.model.Model792;

final class Mapper {
    private Mapper() {}

    public static Model792 of(Entity792 entity) {
        return new Model792(entity.getId(), entity.getField());
    }
}
