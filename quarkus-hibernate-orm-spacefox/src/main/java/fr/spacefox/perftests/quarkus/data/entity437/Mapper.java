package fr.spacefox.perftests.quarkus.data.entity437;

import fr.spacefox.perftests.quarkus.core.service437.model.Model437;

final class Mapper {
    private Mapper() {}

    public static Model437 of(Entity437 entity) {
        return new Model437(entity.getId(), entity.getField());
    }
}
