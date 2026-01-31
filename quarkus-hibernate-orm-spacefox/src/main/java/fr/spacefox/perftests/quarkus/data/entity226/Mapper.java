package fr.spacefox.perftests.quarkus.data.entity226;

import fr.spacefox.perftests.quarkus.core.service226.model.Model226;

final class Mapper {
    private Mapper() {}

    public static Model226 of(Entity226 entity) {
        return new Model226(entity.getId(), entity.getField());
    }
}
