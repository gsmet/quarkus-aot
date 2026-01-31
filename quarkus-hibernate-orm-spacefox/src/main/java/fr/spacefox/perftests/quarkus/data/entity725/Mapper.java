package fr.spacefox.perftests.quarkus.data.entity725;

import fr.spacefox.perftests.quarkus.core.service725.model.Model725;

final class Mapper {
    private Mapper() {}

    public static Model725 of(Entity725 entity) {
        return new Model725(entity.getId(), entity.getField());
    }
}
